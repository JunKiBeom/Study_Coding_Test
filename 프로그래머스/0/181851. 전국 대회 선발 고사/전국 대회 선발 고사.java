import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> att = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                att.add(new int[] {rank[i], i});
            }
        }
        Collections.sort(att, (a, b) -> Integer.compare(a[0], b[0]));
        
        return 10000 * att.get(0)[1] + 100 * att.get(1)[1] + att.get(2)[1];
    }
}