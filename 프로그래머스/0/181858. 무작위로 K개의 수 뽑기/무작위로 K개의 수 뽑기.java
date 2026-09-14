import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num: arr){
            if (!list.contains(num)) {
                list.add(num);
            }
            if (list.size() == k) {
                break;
            }
        }
        
        while (list.size() < k) {
            list.add(-1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}