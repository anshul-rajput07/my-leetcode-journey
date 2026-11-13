class Solution {
    public String toGoatLatin(String sentence) {
        
        int n = sentence.length();
        String[] words = sentence.split(" ");
        HashSet<Character> hash = new HashSet<>();
        hash.add('a');
        hash.add('e');
        hash.add('i');
        hash.add('o');
        hash.add('u');
        hash.add('A');
        hash.add('E');
        hash.add('I');
        hash.add('O');
        hash.add('U');
        int idx = 0;
        int number = 2;
        StringBuilder ans = new StringBuilder();
        for(String word : words){
            String a = "";
            if(!hash.contains(word.charAt(0))){
                String s = word.substring(1,word.length());
                a += s+word.charAt(0);
            }else{
                a=word;
            }
            String letter = "m";
            for(int i = 0; i < number ; i++){
                letter += "a";
            }
            number++;
            ans.append(a+letter+" "); 
        }
        return ans.toString().trim();
        
    }
}