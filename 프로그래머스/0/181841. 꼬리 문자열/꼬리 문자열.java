class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        
        for(String s : str_list) 
            if(!s.contains(ex)) // ex를 포함하고 있지 않으면 더함
                sb.append(s);
        
        return sb.toString();
    }
}