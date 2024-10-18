import java.util.*;

class Solution {
    public long solution(long n) {
        List<Integer> list = new ArrayList<>();
        
        while(n>0){
            list.add((int)(n%(long)10));
            n/=10;
        }
        list.sort(Collections.reverseOrder());
        
        // 리스트를 하나의 long 값으로 변환
        StringBuilder sb = new StringBuilder();
        for (int l : list) {
            sb.append(l);
        }
        
        // 문자열을 long으로 변환
        return Long.parseLong(sb.toString());
    }
}