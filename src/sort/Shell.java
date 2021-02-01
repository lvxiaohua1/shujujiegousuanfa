package sort;

public class Shell {
    //对数组a进行希尔排序
    public static void sort(Comparable[] a){
        //1、根据a的长度确定，确定增量h的值
        int h = 1;
        while (h< a.length/2){
            h = 2*h+1;
        }
        //2、希尔排序
        while (h>=1){
            //排序
            //2.1找到待插入的元素
            for (int i = h;i< a.length;i++){
                //2.2把待插入的元素插入到有序序列中
                for (int j=i;j>=h;j-=h){
                    //待插入的元素a[j],比较a[j]和a[j-h]
                    if (greater(a[j-h],a[j])){
                        //交换元素
                        exch(a,j-h,j);
                    }else {
                        //待插入元素已经找到合适的位置，结束循环
                        break;
                    }
                }
            }
            //减小h的值
            h=h/2;
        }
    }
    //比较数组元素v是否比w大
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    //交换i与j位置的数据
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] =temp;
    }
}
