import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        
        for (long i=1; i<=n; i++)
            answer.add(i*x);
        
        return answer.stream().mapToLong(xx->xx).toArray();
    }
}