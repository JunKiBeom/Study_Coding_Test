class Solution {
    public String[] solution(String[] names) {
        String str = "";
        for (int i = 0; i < names.length; i++) {
            if (i%5==0)
                str += names[i]+",";
        }
        return str.split(",");
    }
}