
public class JZ1 {
    public boolean Find(int target, int[][] array) {
        if (array.length == 0) {
            return false;
        } else if (array[0].length == 0)
            return false;

        int row = 0, col = array[0].length - 1;
        while (row < array.length && col >= 0) {
            if (array[row][col] == target)
                return true;
            else if (array[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
