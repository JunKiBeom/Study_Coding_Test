class Solution {
    public String solution(String letter) {
        StringBuffer answer = new StringBuffer();
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (String s : letter.split(" ")) {
            for (int i = 0; i < morse.length; i++) {
                if (s.equals(morse[i]))
                    answer.append((char)(i+97));
            }
        }

        return answer.toString();
    }
}