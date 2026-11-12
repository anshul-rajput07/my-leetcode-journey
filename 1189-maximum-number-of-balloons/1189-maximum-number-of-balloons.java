class Solution {
    public int maxNumberOfBalloons(String text) {
        char[] text1 = text.toCharArray();
        Map<Character,Integer> hash = new HashMap<>();
        hash.put('b', 0);
        hash.put('a', 0);
        hash.put('l', 0);
        hash.put('o', 0);
        hash.put('n', 0);
        for(char i : text1){
            if(hash.containsKey(i)){
                hash.put(i,hash.get(i) + 1);
            }
        }
        int min = Integer.MAX_VALUE;
        for(char i : hash.keySet()){
            if(i == 'l' || i == 'o'){
                hash.put(i , (int)hash.get(i)/2);
            }
        }
        for(char i : hash.keySet()){
            if(min > hash.get(i)){
                min = hash.get(i);
            }
        }
        return min;
    }
}