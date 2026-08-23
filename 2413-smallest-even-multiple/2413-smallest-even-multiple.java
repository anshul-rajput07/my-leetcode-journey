class Solution {
    public int smallestEvenMultiple(int n) {
        int res = (n % 2 == 0) ? n : n*2;
        return res;
    }
}