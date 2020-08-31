import java.lang.Math;

public class JZ8 {

    public class Solution {
        public int JumpFloorII(int target) {
            if (target < 2)
                return 1;
            else {
                return (int) Math.pow(2, target - 1);
            }
        }
    }
}
