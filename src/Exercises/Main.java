package Exercises;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        JavaHelpRu jhr = new JavaHelpRu();
        int[][] x = new int[5][5];
        for (int q = 0; q < x.length; q++) {
            x[q] = IntStream.rangeClosed(1 , x.length).toArray();
        }

//        System.out.println(jhr.inputConsole());
//        System.out.println(jhr.weightOnMoon(66));
//        jhr.increaseArrayNumber(new int[]{1, 57, 87, 2, 22, 0}, 7);
//        System.out.println(jhr.replaceIncorectWord("бяка іпівпів  бляка"));
//        System.out.println(jhr.distanceToLightning(7.2));
//        jhr.toDivineLetter();
//        jhr.reversString("qwertyu asdfghj xcvbn");
//        System.out.println(jhr.ifDouble(5.0));
//        jhr.array(x, 2);
//        for (int i = 0; i < x.length; i++) {
//            for (int j = 0; j < x[i].length; j++) {
//                System.out.print(x[i][j]);
//            }
//            System.out.println();
//        }


    }
}
