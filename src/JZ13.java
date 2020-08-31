import java.util.ArrayList;

public class JZ13 {
    public void reOrderArray(int[] array) {
        int[] ret = new int[array.length];
        int odd = 0, even = array.length - 1;
        for (int p1 = 0, p2 = array.length - 1; p1 < array.length; p1++, p2--) {
            if ((array[p1] & 1) == 0)
                ret[odd++] = array[p1];
            if ((array[p2] & 1) == 0)
                ret[even--] = array[p2];
        }
        array = ret;
    }
}
