package sort;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Comparable[] array = {4,5,6,3,2,1};
        Bubble.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
