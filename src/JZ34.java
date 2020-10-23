import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class JZ34 {
    //可使用bitset节省空间
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0)
            return -1;
        if (str.length() == 1)
            return 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (!hashMap.containsKey(c))
                hashMap.put(c, i);
            else
                hashMap.put(c, -1);
        }
        int minIndex = Integer.MAX_VALUE;
        for (Character character : hashMap.keySet()) {
            if (hashMap.get(character) > -1) {
                if (hashMap.get(character) < minIndex)
                    minIndex = hashMap.get(character);
            }
        }
        if (minIndex == Integer.MAX_VALUE)
            return -1;
        return minIndex;
    }

    @Test
    void test() {
        Assertions.assertEquals(1, FirstNotRepeatingChar(new String("AcrabbCnAut")));
        Assertions.assertEquals(-1, FirstNotRepeatingChar(new String("AcrabcbnAutnautr")));
    }
}
