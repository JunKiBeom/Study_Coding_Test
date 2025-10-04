import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> list = new ArrayList<>();
        for (String q : quiz) {
            String[] parts = q.split("= ");
            // list.add(Arrays.stream(parts[0].replace("- ", "-").replace("+ ", "").replace("--", "+").split(" ")).mapToInt(Integer::parseInt).sum() == Integer.parseInt(parts[1]) ? "O" : "X");
            
             String expr = parts[0]
                    .replace("- ", "-")
                    .replace("+ ", "")
                    .replace("--", "+");

            list.add(Arrays.stream(expr.split(" "))
                    .mapToInt(Integer::parseInt)
                    .sum() == Integer.parseInt(parts[1]) ? "O" : "X");
        }
        return list.toArray(new String[list.size()]);
    }
}