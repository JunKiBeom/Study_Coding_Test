class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        for (int n = 1; n < numLog.length; n++) {
            if (numLog[n] - numLog[n-1] == 1)
                sb.append("w");
            else if (numLog[n] - numLog[n-1] == -1)
                sb.append("s");
            else if (numLog[n] - numLog[n-1] == 10)
                sb.append("d");
            else if (numLog[n] - numLog[n-1] == -10)
                sb.append("a");
        }
        return sb.toString();
    }
}