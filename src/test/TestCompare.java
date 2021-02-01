package test;

import a.Student;

public class TestCompare {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(148);

        Student student2 =  new Student();
        student2.setName("李四") ;
        student2.setAge(29);

        Comparable max = getMax(student1, student2);
        System.out.println(max);
    }

    public static Comparable getMax(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);
        if (result>=0){
            return c1;
        }
        else {
            return c2;
        }
    }
}
