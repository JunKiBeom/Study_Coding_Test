import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice); // 오름차순 정렬
        
        if (dice[0] == dice[3])
            return 1111 * dice[0];
        
        else if (dice[0] == dice[2]) // aaab
            return (int) Math.pow(10 * dice[0] + dice[3], 2);
        else if (dice[1] == dice[3]) // abbb
            return (int) Math.pow(10 * dice[1] + dice[0], 2);
        
        else if (dice[0] == dice[1] && dice[2] == dice[3]) // aabb
            return (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);

        else if (dice[0] == dice[1]) // aabc
            return dice[2] * dice[3];
        else if (dice[1] == dice[2]) // abbc
            return dice[0] * dice[3];
        else if (dice[2] == dice[3]) // abcc
            return dice[0] * dice[1];
        
        else
            return dice[0];
    }
}
// hashmap을 이용해 카운팅 후 스위치로 개선