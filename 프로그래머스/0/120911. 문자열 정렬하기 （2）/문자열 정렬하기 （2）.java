import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] tmp = my_string.toLowerCase().toCharArray();
        Arrays.sort(tmp);
        return new String(tmp);
    }
}
