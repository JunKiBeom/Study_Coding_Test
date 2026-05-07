class Solution {
    public int solution(String myString, String pat) {
        String answer = myString.replace("A", "X")
                                 .replace("B", "A")
                                 .replace("X", "B");
        return answer.contains(pat) ? 1 : 0;
    }
}