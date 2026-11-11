class Solution {
    public String addBinary(String a, String b) {
        int a1 = a.length() - 1 , b1 = b.length() - 1;
        int carry = 0;
        StringBuilder binary = new StringBuilder();
        while(a1 >= 0 || b1 >= 0 || carry == 1){
            if(a1 >= 0){
                carry += a.charAt(a1--) - '0';
            }
            if(b1 >= 0){
                carry += b.charAt(b1--) - '0';
            }
            binary.append(carry % 2);
            carry /= 2;
        }
        
        return binary.reverse().toString();

    }
}