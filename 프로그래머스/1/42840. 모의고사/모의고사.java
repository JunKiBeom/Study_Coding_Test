import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자들 찍는 방식
        int[] p0 = {1, 2, 3, 4, 5};
        int[] p1 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p2 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 수포자들 정답 카운트
        int[] cnt = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p0[i % p0.length]) cnt[0]++;
            if (answers[i] == p1[i % p1.length]) cnt[1]++;
            if (answers[i] == p2[i % p2.length]) cnt[2]++;
        }
        
        int m = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        
        // 가장 높은 점수를 받은 사람 찾기
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (cnt[i] == m) l.add(i + 1);
        }
        
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}