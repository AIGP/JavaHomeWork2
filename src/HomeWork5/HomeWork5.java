package HomeWork5;

import java.util.Arrays;

public class HomeWork5 {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float[] a1 = new float[h];
    static float[] a2 = new float[h];
    public static void main(String[] args) throws InterruptedException {
        MethodWithoutThreads();
        MethodWithTwoThreads();

    }

    static void MethodWithoutThreads(){
        Arrays.fill(arr, 1);
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (float)(i / 5)) * Math.cos(0.2f + (float)(i / 5)) * Math.cos(0.4f + (float)(i / 2)));
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Время работы первого метода: " + (t2 - t1));
    }
    static void MethodWithTwoThreads() throws InterruptedException {
        Arrays.fill(arr, 1);

        long t3 = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        long t4 = System.currentTimeMillis();

        Thread th1 = new Thread( () -> {
            //System.out.println("th1: start " + System.currentTimeMillis());
            for(int i = 0; i < h; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + (float)(i / 5)) * Math.cos(0.2f + (float)(i / 5)) * Math.cos(0.4f + (float) (i / 2)));
            }
        });
        Thread th2 = new Thread( () -> {
            //System.out.println("th2: start " + System.currentTimeMillis());
            for(int i = 0; i < h; i++) {
                a2[i] = (float)(a2[i] * Math.sin(0.2f + (float)(i / 5)) * Math.cos(0.2f + (float)(i / 5)) * Math.cos(0.4f + (float)(i / 2)));
            }
        });

        th1.start();
        th2.start();
        th1.join();
        th2.join();

        long t5 = System.currentTimeMillis();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        long t6 = System.currentTimeMillis();

        System.out.println("Время разбивки массива: " + (t4 - t3));
        System.out.println("Время склейки массива: " + (t6 - t5));
        System.out.println("Полное время для двух потоков: " + (t6 - t3));
    }
}
