import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class JZ27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str.length() == 1) {
            result.add(str);
            return result;
        }

        for (int i = 0; i < str.length(); i++) {
            ArrayList<String> sub_result = Permutation(str.substring(0, i) + str.substring(i + 1));
            for (String s : sub_result) {
                result.add(str.charAt(i) + s);
            }
        }
        LinkedHashSet<String> set = new LinkedHashSet<>(result);
        result = new ArrayList<>(set);
        Collections.sort(result);

        return result;
    }
}
