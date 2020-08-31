public class JZ6 {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0)
            return 0;

        int low = 0, high = array.length - 1;
        int mid = (low + high) / 2;

        while (high > low) {
            if (array[mid] > array[high])
                low = mid + 1;
            else if (array[mid] < array[high])
                high = mid;
            else
                high--;
            mid = (high + low) / 2;
        }

        return array[low];
    }
}
