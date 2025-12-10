import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] text = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            for (String t : text) {
                if (babbling[i].contains(t)) {
                    babbling[i] = babbling[i].replace(t, "/"); // 특정 문자로 치환
                }
            }
        }
        
        return (int) Arrays.stream(babbling)
                    .map(b -> b.replace("/","")) // 공백으로 치환
                    .filter(String::isEmpty)
                    .count();
    }
}