public class JZ7 {
    public int JumpFloor(int target) {
        if (target > 1) {
            int i, j = 1, k = 1, a = 0;
            for (i = 2; i <= target; i++) {
                a = j + k;
                j = k;
                k = a;
            }
            return a;
        } else {
            return 1;
        }
    }


    public static void main(String[] args) {
        JZ7 test = new JZ7();
        System.out.println(test.JumpFloor(1));
    }
}