import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        return new int[]{Arrays.stream(array).max().getAsInt(), Arrays.binarySearch(array, Arrays.stream(array).max().getAsInt())};
    }
}