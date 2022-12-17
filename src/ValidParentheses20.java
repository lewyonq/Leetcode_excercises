public class ValidParentheses20 {
    public static void main(String[] args) {
        System.out.println(isValid("[()]}"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;

        int oldLength = 0;
        while(true) {
            oldLength = s.length();
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            if(oldLength == s.length()) break;
        }

        if(s.isEmpty()) return true;

        return false;
    }
}
