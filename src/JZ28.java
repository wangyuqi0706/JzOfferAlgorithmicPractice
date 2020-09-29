import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JZ28 {
    public int MoreThanHalfNum_Solution(int[] array) {
        int candidate = -1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (count == 0) {
                candidate = array[i];
                count++;
            } else {

                if (candidate == array[i])
                    count++;
                else
                    count--;
            }
        }
        count = 0;
        for (int i : array) {
            if (i == candidate) {
                count++;
                if (count > array.length / 2)
                    return i;
            }
        }
        return 0;

    }

    @Test
    void test() {
        int[] a = new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2};
        Assertions.assertEquals(MoreThanHalfNum_Solution(a), 2);

    }
}
