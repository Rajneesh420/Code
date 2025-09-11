class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(0,0,"",n,res);
        return res;
    }

    private void dfs(int op,int cl,String s,int n,List<String> res) {
        if(op == cl && op+cl==2*n) {
            res.add(s);
            return ;
        }

        if(op < n) {
            dfs(op+1,cl,s+"(",n,res);
        }

        if(cl < op) {
            dfs(op,cl+1,s+")",n,res);
        }
    }
}