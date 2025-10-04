import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Set<String> spellSet = new HashSet<>(Arrays.asList(spell));

        return Arrays.stream(dic)
                .map(word -> new HashSet<>(Arrays.asList(word.split(""))))
                .anyMatch(set -> set.equals(spellSet)) ? 1 : 2;
    }
}