class Solution {
    public boolean canFinish(int numC, int[][] pre) {
        int[] in = new int[numC];
        List<List<Integer>> graph = new LinkedList<>();
        for(int i=0;i<numC;i++) graph.add(i,new ArrayList<>());

        for(int[] p:pre){
            in[p[0]]++;
            graph.get(p[1]).add(p[0]);
        }
        Deque<Integer> que = new LinkedList<>();
        for(int i=0;i<numC;i++){
            if(in[i]==0) que.addLast(i);
        }
        int idx = 0;
        int[] result = new int[numC];
        while(!que.isEmpty()) {
            int t = que.pollFirst();
            result[idx++]=t;
            for(int a : graph.get(t)){
                in[a]--;
                if(in[a]==0){
                    que.addLast(a);
                }
            }
        }
        if(idx == numC) return true;
        return false;
    }
}