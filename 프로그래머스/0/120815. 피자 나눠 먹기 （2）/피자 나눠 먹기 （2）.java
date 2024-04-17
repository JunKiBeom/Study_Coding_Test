class Solution {
    /// 최대공약수
    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);

    }

    //    /// 최소공배수
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public int solution(int n) {
        int answer = 0;
        return lcm(n, 6)/6;
    }
}