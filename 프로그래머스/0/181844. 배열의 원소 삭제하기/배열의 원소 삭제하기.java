import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        for (int d: delete_list)
            list.remove(Integer.valueOf(d));
        
        return list.stream().mapToInt(x->x).toArray();
    }
}