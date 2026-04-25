import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        // 배열의 길이가 다른 경우
        if (arr1.length != arr2.length)
            return arr1.length > arr2.length ? 1 : -1;
        
        // 배열의 길이가 같은 경우
        int s1 = Arrays.stream(arr1).sum();
        int s2 = Arrays.stream(arr2).sum();
        
        if (s1 != s2)
            return s1 > s2 ? 1 : -1;
        
        // 두 조건을 모두 만족하지 않는 경우
        return 0;
    }
}