class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")||token.equals("-")||token.equals("/")||token.equals("*")){
               
                

                int a = stk.pop();
                int b = stk.pop();
                

                if(token.equals("+")){
                    stk.push(b+a);
                }else if(token.equals("-")){
                    stk.push(b-a);
                }else if(token.equals("/")){
                    stk.push(b/a);
                }else if(token.equals("*")){
                    stk.push(b*a);
                }

            }else{
                 stk.push(Integer.parseInt(token));
            }
        }
        return stk.peek();
    }
}
