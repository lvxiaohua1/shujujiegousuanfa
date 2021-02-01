package sort;

import java.util.Arrays;

/**
 * @program: untitled
 * @description: 归并排序测试
 * @author: lvxiaohua
 * @create: 2021-02-01 10:37
 **/
public class MergeTest {
    public static void main(String[] args) {
        Integer[] a = {8,4,5,7,1,3,6,2};
        Merge.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
