class Solution {
    public String solution(String bin1, String bin2) {
        // String answer = "";
        // int num1 = Integer.parseInt(bin1, 2);
        // int num2 = Integer.parseInt(bin2, 2);
        // int res = num1+num2;
        // answer = Integer.toBinaryString(res);
        // return answer;
        
        StringBuffer answer = new StringBuffer();
        int bin1_len = bin1.length();
        int bin2_len = bin2.length();
        int add_bin = 0;

        StringBuffer rbin1 = new StringBuffer(bin1);
        StringBuffer rbin2 = new StringBuffer(bin2);
        rbin1.reverse();
        rbin2.reverse();

        for (int i = 0; i<bin1_len; i++)
            if (rbin1.charAt(i)=='1')
                add_bin += Math.pow(2,i);

        for (int i = 0; i<bin2_len; i++)
            if (rbin2.charAt(i)=='1')
                add_bin += Math.pow(2,i);

        while (add_bin != 0) {
            answer.append(add_bin % 2);
            add_bin /= 2;
        }
        
        return answer.toString().equals("") ? "0" : answer.reverse().toString();
    }
}