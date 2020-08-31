public class JZ10 {
    public int RectCover(int target) {
        int a = 1, b = 2, c = target;
        for (int i = 3; i <= target; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
