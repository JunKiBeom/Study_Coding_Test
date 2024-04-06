import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Integer[] arr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,Collections.reverseOrder());
        return arr[0] * arr[1];
    }
}