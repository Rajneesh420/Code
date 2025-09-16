class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
      HashSet<String> st = new HashSet<>();
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        for (String str : wordDict) {
            st.add(str);
        }

        dp[n]=true;
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                String curr=s.substring(i,j+1);
                if(st.contains(curr) && dp[j+1]){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[0];
    }
}