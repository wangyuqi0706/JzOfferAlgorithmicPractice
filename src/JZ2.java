public class JZ2 {
    public String replaceSpace(StringBuffer str) {
        StringBuilder result = new StringBuilder();
        result.ensureCapacity(3 * str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ')
                result.append(c);
            else
                result.append("%20");
        }
        return result.toString();
    }
}
