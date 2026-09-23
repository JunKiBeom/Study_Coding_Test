class Solution {
    public boolean solution(int x) {
        int chk = x;
        int div = 0;
        
        while (x != 0) {
            div += x % 10;
            x /= 10;
        }
        
        if (chk % div == 0)
            return true;
        else
            return false;
    }
}