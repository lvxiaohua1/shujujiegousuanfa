package sort;

import java.util.Arrays;

/**
 * @program: untitled
 * @description: 测试快速排序
 * @author: lvxiaohua
 * @create: 2021-02-01 13:52
 **/
public class QuickTest {
    public static void main(String[] args) {
        Integer[] a = {6,1,2,7,9,3,4,5,8};
        Quick.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
