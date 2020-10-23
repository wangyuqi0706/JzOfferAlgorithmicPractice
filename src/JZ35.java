import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class JZ35 {
    int ret = 0;

    public int InversePairs1(int[] array) {
        //暴力方法
        int pairs = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j])
                    pairs++;
            }
        }
        return pairs % 1000000007;
        //超时
    }

    public int InversePairs(int[] array) {


    }

    private void mergeSort(int[] array, int l, int r) {
        //l,r左闭右开
        if (l >= r)
            return;
        int mid = (r - 1) / 2;

        mergeSort(array, l, mid);
        mergeSort(array, mid, r);
        merge()


    }


    private int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int k = 0, pa = 0, pb = 0;
        while (pa < a.length && pb < b.length) {
            if (a[pa] > b[pb]) {
                result[k++] = a[pa++];
                this.ret += b.length - pb;
            } else
                result[k++] = b[pb++];
        }

        while (pa < a.length)
            result[k++] = a[pa++];

        while (pb < b.length)
            result[k++] = b[pb++];
        return result;

    }

    @Test
    void test() {
        int[] case1 = {3, 2, 1};
        int answer1 = 3;
        int[] case2 = {3, 2, 1, 2};
    }
}
