import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        List<Integer> intList = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(intList);
        return intList.stream().mapToInt(Integer::intValue).toArray();
    }
}