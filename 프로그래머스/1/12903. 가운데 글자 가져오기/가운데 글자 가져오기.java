class Solution {
    public String solution(String s) {
        int sl = s.length();
        if (sl% 2 == 0) {
            return s.substring(sl / 2 - 1, sl / 2 + 1);
        } else {
            return s.substring(sl / 2, sl / 2 + 1);
        }
    }
}