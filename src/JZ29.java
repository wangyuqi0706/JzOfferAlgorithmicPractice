import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;


public class JZ29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (k > input.length || k == 0)
            return new ArrayList<Integer>();
        else if (k == input.length) {
            ArrayList<Integer> integers = new ArrayList<>();
            for (Integer i : input) {
                integers.add(i);
            }

        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                if (integer >= t1)
                    return -1;
                else
                    return 1;
            }
        });
        for (int i : input) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(i);
            } else {
                Integer max = priorityQueue.peek();
                if (i < max) {
                    priorityQueue.poll();
                    priorityQueue.offer(i);
                }
            }
        }
        return new ArrayList<>(priorityQueue);
    }

    @Test
    void test() {
        var input = GetLeastNumbers_Solution(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 4);
        Assertions.assertIterableEquals(input, Arrays.asList(1, 2, 3, 4));
    }
}
