class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> myStack = new Stack<>();
        for(int i = 0;i<n;i++){
            char curr = s.charAt(i);
            if(curr=='(' || curr=='['|| curr=='{'){ 
                myStack.push(curr);
            }else{
                if(myStack.isEmpty()) return false;
                char top = myStack.pop();
                if(curr ==')' && top!= '(' || curr ==']' && top!= '[' || curr =='}' && top!= '{' ){
                    return false;
                } 
            }
        }
        return myStack.isEmpty();
    }
}