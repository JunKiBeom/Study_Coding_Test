class Solution {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
        int xSum = 0;
        int num = 0;
        
        for (String s : polynomial.split(" ")) {
            if (s.contains("x"))
                xSum += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x",""));
            else if (!s.equals("+"))
                num += Integer.parseInt(s);
        }
        if (xSum == 1) {
            sb.append("x");
        }
        else if (xSum != 0) {
            sb.append(xSum).append("x");
        }
        
        
        if (num != 0 && sb.length() != 0) {
            sb.append(" + ").append(num);
        }
        else if (num != 0 && sb.length() == 0) {
            sb.append(num);
        }
        
        
        return sb.toString();
    }
}