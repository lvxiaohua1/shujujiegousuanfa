package 第一;

import javax.sound.midi.Soundbank;

public class Ceshi {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int i=0;
        int j=100;

        for (int a=0;a<j;a++){
            i+=a;
        }
        System.out.println(i);
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
