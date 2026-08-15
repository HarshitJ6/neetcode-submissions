class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();    
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            List<Character> open = new ArrayList(Arrays.asList('(','[','{'));
            if(open.contains(ch)){
                st.push(ch);
            }else{
                if(st.size() == 0){
                    return false;
                }
                Character top = st.pop();
                if(ch == ')' && top == '('){
                    continue;
                }else if(ch == '}' && top == '{'){
                    continue;
                }else if(ch == ']' && top == '['){
                    continue;
                }else{
                    return false;
                }
            }
        }
        if(st.size()>0) return false;
        else return true;
    }
}
