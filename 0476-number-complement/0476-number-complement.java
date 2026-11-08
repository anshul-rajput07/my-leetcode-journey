class Solution {
    public int findComplement(int num) {

        int mask = ~0 >>> Integer.numberOfLeadingZeros(num);
        return num ^ mask; 
    }
}