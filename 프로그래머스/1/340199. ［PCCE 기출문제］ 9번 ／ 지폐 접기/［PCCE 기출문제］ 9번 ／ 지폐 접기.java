import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while (!checkSize(wallet, bill)) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } 
            else {
                bill[1] /= 2;
            } 
            answer++;
        }
        return answer;
    }

    private boolean checkSize(int[] wallet, int[] bill) {
        Arrays.sort(wallet);
        Arrays.sort(bill);

        return bill[0] <= wallet[0] && bill[1] <= wallet[1];
    }
}