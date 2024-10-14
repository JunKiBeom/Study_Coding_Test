class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            // 각 명함의 가로와 세로 길이를 정렬
            int width = Math.max(size[0], size[1]);
            int height = Math.min(size[0], size[1]);

            // 최대 가로와 최대 세로 길이 갱신
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        // 지갑의 크기 계산
        return maxWidth * maxHeight;
    }
}