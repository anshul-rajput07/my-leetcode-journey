class Solution {
    public boolean canAliceWin(int n) {
        int counter = 0;
        int points = 10;
        while(n > 0){
            n -= points--;
            if(n>=0){
                counter++;
            }
        }
        return counter % 2 != 0;
    }
}