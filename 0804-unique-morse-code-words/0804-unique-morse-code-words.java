class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> s = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); ++i)
                sb.append(code[word.charAt(i) - 'a']);
            s.add(sb.toString());
        }
        return s.size();
    }
}