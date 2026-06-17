class Solution {
    public int solution(String binomial) {
        String[] sp = binomial.split(" ");
        int a = Integer.parseInt(sp[0]);
        String op = sp[1];
        int b = Integer.parseInt(sp[2]);
        
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: return 0;
        }
    }
}