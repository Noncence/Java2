package geekbrains.javatwo.homeworks.lesson5.homework5;

public class Main {
    static final int ONE = 1;
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    static float[] a1 = new float[h];
    static float[] a2 = new float[h];

    public static void main(String[] args) {

        for (int i = 0; i < size ; i++) {
            arr[i] = ONE;
        }

        method1(arr, size);
        method2(arr, h);
    }

    public static void method1(float[] arr, int size){

        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        float delta = System.currentTimeMillis() - a;
        System.out.println("Время обработки первого метода: " + delta + " мс.");
    }

    public static void method2(float[] arr, int h){

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h ; i++) {
                    a1[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        };
        new Thread(r1, "Thread #1").start();

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h ; i++) {
                    a2[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        };
        new Thread(r2, "Thread #2").start();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        float delta = System.currentTimeMillis() - a;

        System.out.println("Время обработки второго метода: " + delta + " мс.");
    }
}