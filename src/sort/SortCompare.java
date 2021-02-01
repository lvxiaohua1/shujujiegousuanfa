package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EnumSet;

public class SortCompare {
    //调用不同的测试方法，完成测试
    public static void main(String[] args) throws IOException {
        //1、创建一个ArrayList集合，保存读取出来的数据
        ArrayList<Integer> list = new ArrayList<>();
        //2、创建缓存读取流BufferedReader,读取数据并且存储到ArrayList中
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(SortCompare.class.getClassLoader().getResourceAsStream("number.txt")));
        String line=null;
        while ((line= bufferedReader.readLine())!=null){
            int i = Integer.parseInt(line);
            list.add(i);
//            System.out.println(i);
        }
        bufferedReader.close();
        //3、把ArrayList转化为数组
        Integer[] a = new Integer[list.size()];
        list.toArray(a);
        //4、用测试代码完成测试
//        testInsert(a);//直接插入排序执行时间为36867毫秒
        /*for (int i=0;i<10;i++){
            testShell(a);
        }*/
        /*for (int i=0;i<100;i++){
            testMerge(a);
        }*/
        testQuick(a);//测试这个会发生栈内存溢出异常
    }
    //测试希尔排序
    public static void testShell(Integer[] a){
        //1、获取执行之前的时间
        long start = System.currentTimeMillis();
        //2、执行算法代码
        Shell.sort(a);
        //3、获取执行之后的时间
        long end = System.currentTimeMillis();
        //4、算出程序执行时间并输出
        System.out.println("希尔排序执行的时间为："+(end-start)+"毫秒");
    }
    //测试直接插入排序
    public static void testInsert(Integer[] a){
        //1、获取执行之前的时间
        long start = System.currentTimeMillis();
        //2、执行算法代码
        Insertion.sort(a);
        //3、获取执行之后的时间
        long end = System.currentTimeMillis();
        //4、算出程序执行时间并输出
        System.out.println("直接插入排序执行时间为"+(end-start)+"毫秒");
    }
    //测试归并排序
    public static void testMerge(Integer[] a){
        //1、获取执行之前的时间
        long start = System.currentTimeMillis();
        //2、执行算法代码
        Merge.sort(a);
        //3、获取执行之后的时间
        long end = System.currentTimeMillis();
        //4、算出程序执行时间并输出
        System.out.println("归并排序执行时间为"+(end-start)+"毫秒");
    }
    //测试快速排序
    public static void testQuick(Integer[] a){
        //1、获取执行之前的时间
        long start = System.currentTimeMillis();
        //2、执行算法代码
        Quick.sort(a);
        //3、获取执行之后的时间
        long end = System.currentTimeMillis();
        //4、算出程序执行时间并输出
        System.out.println("快速排序执行时间为"+(end-start)+"毫秒");
    }
}
