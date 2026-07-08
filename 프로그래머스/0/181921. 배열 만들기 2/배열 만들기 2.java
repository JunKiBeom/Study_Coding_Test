import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 5 == 0) {
                String str = String.valueOf(i);
                boolean chk = true;

                for (int j = 0; j < str.length(); j++) {
                    char ch = str.charAt(j);
                    if (ch != '0' && ch != '5') {
                        chk = false;
                        break;
                    }
                }
                
                if (chk)
                    list.add(i);
            }
        }
        
        if (list.isEmpty())
            return new int[]{-1};

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}