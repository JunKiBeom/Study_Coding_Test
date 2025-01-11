import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static String solution(String s) {
        List<Integer> numbers = Arrays.stream(s.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return Collections.min(numbers) + " " + Collections.max(numbers);
    }
}