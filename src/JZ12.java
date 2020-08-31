public class JZ12 {
    public double Power(double base, int exponent) {
        if (exponent < 0) { //将负指数转化为正数
            base = 1 / base;
            exponent = -exponent;
        }
        double pow = base;
        double ret = 1.0d;
        while (exponent > 0) {
            if ((exponent & 1) == 1) { //判断这一位是否为1
                ret *= pow;
            }
            pow *= pow;
            exponent >>= 1;
        }
        return ret;

    }
}
