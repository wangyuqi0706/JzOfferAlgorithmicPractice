import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;

public class JZ32 {
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return "";
        if (numbers.length == 1)
            return Integer.toUnsignedString(numbers[0]);
        ArrayList<String> sNumbers = new ArrayList<>();
        for (int i : numbers) {
            sNumbers.add(Integer.toUnsignedString(i));
        }
        sNumbers.sort(new OrderComparator());
        StringBuilder result = new StringBuilder();
        for (String s : sNumbers) {
            result.append(s);
        }
        return result.toString();
    }

    class OrderComparator implements Comparator<String> {
        @Override
        public int compare(String s, String t1) {
            if (s.equals(t1))
                return 0;
            if (s.length() == 0 || t1.length() == 0)
                return s.compareTo(t1);
            if (s.length() == t1.length())
                return s.compareTo(t1);
            else {
                String longString = s.length() > t1.length() ? s : t1;
                String shortString = s.length() < t1.length() ? s : t1;
                String lowerString = longString;
                //321 32144;456,4563;456,456444;3,3334,3332
                int compareShort = shortString.compareTo(longString.substring(0, shortString.length()));
                if (compareShort == 0) {
                    for (int i = shortString.length(), j = 0; i < longString.length(); i++) {
                        if (longString.charAt(i) < shortString.charAt(j)) {
                            lowerString = longString;
                            j++;
                            break;
                        } else if (longString.charAt(i) > shortString.charAt(j)) {
                            lowerString = shortString;
                            j++;
                            break;
                        }
                    }
                } else {
                    if (compareShort < 0)
                        lowerString = shortString;
                    else
                        lowerString = longString;
                }

                if (lowerString.equals(s))
                    return -1;
                else
                    return 1;
            }
        }
    }


    @Test
    void test() {
        //int[] n1 = new int[]{3, 5, 1, 4, 2};
        int[] n2 = new int[]{3, 323, 32123};
        int[] n3 = new int[]{3334, 3};
        // Assertions.assertEquals("12345", PrintMinNumber(n1));
        //Assertions.assertEquals("321233233", PrintMinNumber(n2));
        Assertions.assertEquals("33334", PrintMinNumber(n3));
    }
}

