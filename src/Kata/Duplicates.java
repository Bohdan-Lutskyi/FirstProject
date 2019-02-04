package Kata;

import java.util.*;
//public static String[] str = {  // don't work
//        "abcde",
//        "aabbcde",
//        "aabBcde",
//        "indivisibility" ,
//        "Indivisibilities" ,
//        "aA11" ,
//        "ABBA"
//        };
//public static void main(String[] args) {
//        ExampleClass ex = new ExampleClass();
//        for(int i = 0; i < str.length; i++)
//        ex.duplicates(str[i]);
//        }

public class Duplicates {
    public void duplicates(String str) {
        int count = 0;
        Collection<Character> exlusiveStr = new LinkedHashSet<>();
        Collection<Character> list = new ArrayList<>();
        char[] ch = str.toCharArray();
        char duplicatedCharacter;

        for (int i = 0; i < ch.length; i++) {
            list.add(ch[i]);
            exlusiveStr.addAll(list);
        }
        for (Object o : exlusiveStr)
            list.remove(o);

        System.out.print("Hash: ");
        for (Object o : exlusiveStr)
            System.out.print(o + ",");
        System.out.println();

        System.out.print("List: ");
        for (Object ob : list)
            System.out.print(ob + ",");
        System.out.println();


//        for (Object o : exlusiveStr) {
//            if (list.contains(o)){
//                count++;
//            }
//        }
//        System.out.printf("In line \"%s\" is %d duplicates(s) it is \n", str, count);

//        if (count == 0) System.out.printf("There are no duplicates(s) in the line \"%s\"\n", str);
//        else System.out.printf("In line \"%s\" is %d duplicates(s) it is \n", str, count);
    }

}
