package Book;

import java.util.Random;
import java.util.Scanner;

public class ExampleJava5_8FromBook {
    static Scanner scan;
    static Random rand;

    public ExampleJava5_8FromBook() {
        scan = new Scanner(System.in);
        rand = new Random();
        double y, x = 1, z, res;
        int a;
        double[] x1;

//        for (int i = 0; i < 10; i++)
//            System.out.print(20 + " ");
//        for (int i = 20; i <= 35; i++)
//            System.out.print("\n" + i);
//        for (int i = 10; i <= 25; i++)
//            System.out.println(i + " " + (i + 0.4));
//        for (int i = 100; i <= 500; i++)
//            x += i;
//        System.out.println(x);
//        a = 6;
//        x1 = new double[a];
//        x1[0] = x1[1] = 0;
//        x1[2] = 1.5;
//        for (int i = 3; i < a; i++){
//             y = i;
//            x1[i] = (y*y +1)/(y-1)*x1[i-1]-x1[i-2]+x1[i-3];
//            x1[i-2] = x1[i-1];
//            x1[i-3] = x1[i-2];
//        }
//        System.out.println(x1[a-1]);

        for (int i = 100; i < 200; i++)
            if (i%3 == 0) System.out.println(i);

    }
}
