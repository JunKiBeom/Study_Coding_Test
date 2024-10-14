import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = sol2(array, commands[i]);
        }
        return answer;
    }

    public int sol2(int[] array, int[] commands) {
        int[] arr = Arrays.copyOfRange(array, commands[0] - 1, commands[1]);
        Arrays.sort(arr);
        //System.out.println(commands);
        return arr[commands[2] - 1];
    }
}