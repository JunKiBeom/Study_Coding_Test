class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        b /= gcd(a,b); // 최대공약수로 나누고
        while (b % 2 == 0) b /= 2; // 나머지가 0이 아니면 2로 계속 나눈다
        while (b % 5 == 0) b /= 5; // 5로 계속 나눈다
        return b == 1 ? 1 : 2; // 분모가 1이냐 아니냐로 유한소수 판별
    }
    
    int gcd(int m, int n) {
        return m % n == 0 ? n : gcd(n, m % n);
    }
}