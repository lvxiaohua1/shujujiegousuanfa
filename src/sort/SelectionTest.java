package sort;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        Integer[] array = {4,6,8,7,9,2,10,1};
        Selection.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
