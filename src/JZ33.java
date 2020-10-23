import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JZ33 {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) return 0;
        int p2 = 0, p3 = 0, p5 = 0;
        int[] uglys = new int[index];
        uglys[0] = 1;
        for (int i = 1; i < index; i++) {
            uglys[i] = Math.min(uglys[p2] * 2, Math.min(uglys[p3] * 3, uglys[p5] * 5));
            if (uglys[i] == uglys[p2] * 2) p2++;
            if (uglys[i] == uglys[p3] * 3) p3++;
            if (uglys[i] == uglys[p5] * 5) p5++;
        }
        return uglys[index - 1];
    }

    @Test
    void test() {
        Assertions.assertEquals(2, GetUglyNumber_Solution(2));
        Assertions.assertEquals(3, GetUglyNumber_Solution(3));
        Assertions.assertEquals(3, GetUglyNumber_Solution(3));
    }
}
