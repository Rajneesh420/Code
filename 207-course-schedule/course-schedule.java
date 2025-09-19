class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>(numCourses);
        Queue<Integer> leafs = new LinkedList<>();
        int numProcessed = 0;
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            adjList.get(prereq[1]).add(prereq[0]);

            indegree[prereq[0]]++;
        }

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                leafs.offer(i);
            }
        }

        while (!leafs.isEmpty()) {
            int l = leafs.poll();

            for (int v : adjList.get(l)) {
                indegree[v]--;

                if (indegree[v] == 0) {
                    leafs.offer(v);
                }
            }

            numProcessed++;
        }

        return numProcessed == numCourses;
    }
}