import javax.swing.plaf.synth.SynthColorChooserUI;
import java.util.ArrayList;

public class JZ19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int top = 0, left = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
        while (top <= bottom && left <= right) {
            //输出最上方一行
            for (int i = left; i <= right; i++) result.add(matrix[top][i]);
            top++;
            //判断边界条件
            if (top > bottom || left > right)
                break;
            //输出最右一列
            for (int i = top; i <= bottom; i++) result.add(matrix[i][right]);
            right--;
            if (top > bottom || left > right)
                break;
            //输出最下一列
            for (int i = right; i >= left; i--) result.add((matrix[bottom][i]));
            bottom--;
            if (top > bottom || left > right)
                break;
            //输出最左一列
            for (int i = bottom; i >= top; i--) result.add(matrix[i][left]);
            left++;
        }
        return result;
    }

    public static void main(String[] args) {
        JZ19 test = new JZ19();
        int[][] array = {{1}, {2}, {3}, {4}, {5}};
        System.out.println(test.printMatrix(array));
    }
}
