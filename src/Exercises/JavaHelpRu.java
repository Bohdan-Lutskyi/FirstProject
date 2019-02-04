package Exercises;

import java.util.*;
import java.util.stream.IntStream;


public class JavaHelpRu {
    private Scanner key;
    private Random rand;

    public String inputConsole(){
        key = new Scanner(System.in);
        String res;

        while (true){
            res = key.nextLine();
            if (res.equals(".")) return "Line end";
        }

    }//1.1
    public int weightOnMoon(int yourWeight){
        return (int) (yourWeight * 0.17);
    }//1.2
    public void increaseArrayNumber(int[] arr, int x) {
        try {
            System.out.println(arr[x - 1] * 0.1 + arr[x - 1]);
        }catch (Exception e){
            System.out.println("There is no element with that index");
        }
    }//1.3
    public String replaceIncorectWord(String str){
        return str.replaceAll("бяка", "вирізано цензурою");
    }//1.4
    public double distanceToLightning(double time){
        return time * 1100;
    }//1.5
    public void toDivineLetter(){
        rand = new Random();
        key = new Scanner(System.in);
        char s;
        char x = (char) ('A' + rand.nextInt(26));
        System.out.println(x);
        System.out.println("Enter number");
        while (true){
            s = key.nextLine().toUpperCase().charAt(0);
            if (s < x) System.out.println("You are too low");
            else if (s > x) System.out.println("You are too high");
            else{
                System.out.println("You are Right");
                return;
            }
        }
    }//1.6
    public double average(int[] arr){
        return IntStream.of(arr).average().orElse(0);
    }//1.8
    public void reversString(String str){
        List res = Arrays.asList(str.split(" "));
        Collections.reverse(res);
        System.out.println(String.join(" ", res));
        System.out.println(new StringBuilder(str).reverse());
    }//1.9
    public String ifDouble(Object d){
        if (d instanceof Double) return "+";
        else return "-";
    }//2.1
    public int[][] array(int[][] arr, int index){
        Arrays.fill(arr[index], 0);
        return arr;
    }//2.2


}
