class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i < address.length() ; i++){
            char s = address.charAt(i);
            if(s == '.'){
                str.append("[.]");
            }
            else{
                str.append(s);
            }
        }
        return str.toString();
    }
}