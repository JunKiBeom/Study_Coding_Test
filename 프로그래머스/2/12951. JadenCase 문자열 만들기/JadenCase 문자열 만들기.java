class Solution {
    public String solution(String s) {
        String[] words = s.toLowerCase().split(" ", -1);
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0 ; i < words.length; i++) {
            String word = words[i];
            
            if (!word.equals("")) {
                words[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
            
            answer.append(words[i]);
            
            if (i < words.length - 1) {
                answer.append(" ");
            }
        }
        
        return answer.toString();
    }
}