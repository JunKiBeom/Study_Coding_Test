class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            switch(mode) {
                case 0:
                    if (code.charAt(i) == '1')
                        mode = 1;
                    else if (code.charAt(i) != 1 && i % 2 == 0)
                        ret.append(code.charAt(i));
                    break;

                case 1:
                    if (code.charAt(i) == '1')
                        mode = 0;
                    else if (code.charAt(i) != 1 && i % 2 != 0)
                        ret.append(code.charAt(i));
                    break;
            }
        }
        if (ret.length() == 0)
            return "EMPTY";
        return ret.toString();
    }
}