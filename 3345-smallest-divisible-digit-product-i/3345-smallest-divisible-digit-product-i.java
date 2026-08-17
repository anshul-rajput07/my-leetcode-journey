class Solution {
    public int smallestNumber(int n, int t) {
        
        while (true){
            int n1 = n;
            int sum = 1;
            while(n1 != 0){
                int rem = n1 % 10;
                sum *= rem;
                n1 /= 10;
            }
            if(sum % t == 0){
                return n;
            }
            n++;
       
        }

    }
}