class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> extraOpenBrack = new Stack<>();
        Stack<Integer> astrick = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                extraOpenBrack.push(i);
            }
            else if(ch == '*'){
                astrick.push(i);
            }
            else{
                if(!extraOpenBrack.isEmpty()){
                    extraOpenBrack.pop();
                }
                else if(!astrick.isEmpty()){
                    astrick.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!extraOpenBrack.isEmpty()){
            if(astrick.isEmpty()){
                return false;
            }
            int openIndex = extraOpenBrack.pop();
            int closeIndex = astrick.pop();
            if(openIndex > closeIndex){
                return false;
            }
        }
        return extraOpenBrack.isEmpty();
    }
}