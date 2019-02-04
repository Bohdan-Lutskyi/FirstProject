package Kata;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.IntStream;

public class Kata_8_Kyu {

    public String remove(String s, int n){
        while (n-- != 0)
            s = s.replaceFirst("!","");
        return s;
    }//+
    public int noBoringZeros(int n) {
        for (int i = 1; i < 10; i++) {
            if (n%Math.pow(10, i) != 0)
                return Integer.valueOf(String.valueOf(n).substring(0,String.valueOf(n).length() - --i));
        }
        return 0;
    }//+
    public static byte sum (byte a, byte b) {
        return (byte) (a + b);
    }//+
    public int pipeFix(int[] numbers) {
        IntStream.of(numbers).average();
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray().length;
    }//+
    public float mpgToKPM(final float mpg) {
        return BigDecimal.valueOf(mpg * 1.609344 / 4.54609188)
                .setScale(2, BigDecimal.ROUND_HALF_UP)
                .floatValue();
    }//+
    public double fuelPrice(int litres, double pricePerLiter) {
        double res = 0;
        if (litres < 2) res = litres * pricePerLiter;
        else if (litres < 4) res = litres * (pricePerLiter - 0.05);
        else if (litres < 6) res = (litres * (pricePerLiter - 0.10));
        else if (litres < 8) res = litres * (pricePerLiter - 0.15);
        else if (litres < 10) res = litres * (pricePerLiter - 0.20);
        else res = litres * (pricePerLiter - 0.25);

        return BigDecimal.valueOf(res).setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue();
    }//+
    public String printArray(Object[] array) {

//        return Arrays.toString(array).substring(1, array.length*3 - 1).replace(" ", "");
        return Arrays.toString(array).replaceAll("[ \\[\\]]", "");
    }//+
    public double TwoDecimalPlaces(double number) {
        return BigDecimal.valueOf(number).setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue();
    }//+
    public String buildString(String... args)
    {
        return new StringBuilder("I like ").append(args).toString();
    }//-
    public String monkeyCount(final int n) {
        return Arrays.toString(IntStream.rangeClosed(1, n).toArray());
    }//+
    public List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        for (int i = 0; i < listOfNumbers.size(); i++){
            if (listOfNumbers.get(i)%2 == 0){
                listOfNumbers.remove(i);
                i--;
            }
        }
        return listOfNumbers;
    }
    public long stairsIn20(int[][] stairs){
        long res = 0;
        for (int i = 0; i < stairs.length; i++) {
            res += Arrays.stream(stairs[i]).sum();
        }
        return res * 20;
    }//+
    public boolean isDigit(String s) {
        return s.matches("[0-9]");
    }//+
    public int sum(int[] numbers) {
        int res;

        if (numbers == null || numbers.length < 2) return 0;
        Arrays.sort(numbers);
        res = Arrays.stream(numbers).sum() - numbers[0] - numbers[numbers.length - 1];
        return res;
    }//+
    public String squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 != 0) array[i] = (int) Math.pow(array[i], 2);
            else array[i] = (int) Math.sqrt(array[i]);
        }
        return Arrays.toString(array);
    }//+
    public String duckDuckGoose(Object[] players, int goose) {
        boolean pool = true;

        while (pool){
            if (goose > players.length) goose -= players.length;
            else pool = false;
        }
        return players[goose - 1].toString();
    }//-
    public String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }//+
    public Integer calculateTip(double amount, String rating) {
        switch (rating.toLowerCase()){
            case "terrible": return (int) (Math.ceil(amount));
            case "poor": return (int) (Math.ceil(amount * 0.05));
            case "good": return (int) (Math.ceil(amount * 0.1));
            case "great": return (int) (Math.ceil(amount * 0.15));
            case "excellent": return (int) (Math.ceil(amount * 0.2));
            default: return null;
        }
    }//+
    public int nthPower(int[] array, int n) {
        try{
            return (int) (Math.pow(array[n], n));
        }catch (ArrayIndexOutOfBoundsException e){
            return -1;
        }
    }//+
    public String tripleTrouble(String one, String two, String three) {
        String res = "";
        for (int i = 0; i < one.length(); i++) {
            res += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }

        return res;
    }//+
    public String repeatString(final Object toRepeat, final int n) {
        if (toRepeat instanceof Integer) return "Not a string";
        String res = "";
        for (int i = 0; i <= n; i++) {
            if (toRepeat instanceof String){
                res += toRepeat;
            }
        }
        return res;
    }//+
    public static String greet(String language){
        switch(language){
            case("english"):
                return "Welcome";
            case("czech"):
                return "Vitejte";
            case("danish"):
                return "Velkomst";
            case("dutch"):
                return "Welkom";
            case("estonian"):
                return "Tere tulemast";
            case("finnish"):
                return "Tervetuloa";
            case("flemish"):
                return "Welgekomen";
            case("french"):
                return "Bienvenue";
            case("german"):
                return "Willkommen";
            case("irish"):
                return "Failte";
            case("italian"):
                return "Benvenuto";
            case("latvian"):
                return "Gaidits";
            case("lithuanian"):
                return "Laukiamas";
            case("polish"):
                return "Witamy";
            case("spanish"):
                return "Bienvenido";
            case("swedish"):
                return "Valkommen";
            case("welsh"):
                return "Croeso";

            default:
                return "Welcome";
        }
    }//+
    public String rps(String p1, String p2) {
        if (p1.equalsIgnoreCase(p2)) return "draw";
        else if ((p1.equals("rock") && p2.equals("scissors")) ||
                 (p1.equals("scissors") && p2.equals("paper")) ||
                 (p1.equals("paper") && p2.equals("rock"))) return "Player 1 won!";
        else return "Player 2 won!";
    }
    public String sayHello(String[] name, String city, String state){
        return "Hello, " + String.join(" ", name) + "! Welcome to " + city + ", " + state + "!";
    }
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers)
                .filter(x -> (x % divider) == 0)
                .toArray();
    }//Array.filter
    public String smash(String... words) {
        return String.join(" ", words);
    }
    public String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi <= 18.5) return "Underweight";
        else if (bmi <= 25) return "Normal";
        else if (bmi <= 30) return "Overweight";
        else return "Obese";
    }
    public String HQ9(char code) {
        if (code == 'H') return "Hello World";
        else if (code == '9') return ("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take one down and pass it around, 98 bottles of beer on the wall.\n" +
                "98 bottles of beer on the wall, 98 bottles of beer.\n" +
                "Take one down and pass it around, 97 bottles of beer on the wall.\n" +
                "97 bottles of beer on the wall, 97 bottles of beer.\n" +
                "Take one down and pass it around, 96 bottles of beer on the wall.\n96 bottles of beer on the wall, 96 bottles of beer.\nTake one down and pass it around, 95 bottles of beer on the wall.\n95 bottles of beer on the wall, 95 bottles of beer.\nTake one down and pass it around, 94 bottles of beer on the wall.\n94 bottles of beer on the wall, 94 bottles of beer.\nTake one down and pass it around, 93 bottles of beer on the wall.\n93 bottles of beer on the wall, 93 bottles of beer.\nTake one down and pass it around, 92 bottles of beer on the wall.\n92 bottles of beer on the wall, 92 bottles of beer.\nTake one down and pass it around, 91 bottles of beer on the wall.\n91 bottles of beer on the wall, 91 bottles of beer.\nTake one down and pass it around, 90 bottles of beer on the wall.\n90 bottles of beer on the wall, 90 bottles of beer.\nTake one down and pass it around, 89 bottles of beer on the wall.\n89 bottles of beer on the wall, 89 bottles of beer.\nTake one down and pass it around, 88 bottles of beer on the wall.\n88 bottles of beer on the wall, 88 bottles of beer.\nTake one down and pass it around, 87 bottles of beer on the wall.\n87 bottles of beer on the wall, 87 bottles of beer.\nTake one down and pass it around, 86 bottles of beer on the wall.\n86 bottles of beer on the wall, 86 bottles of beer.\nTake one down and pass it around, 85 bottles of beer on the wall.\n85 bottles of beer on the wall, 85 bottles of beer.\nTake one down and pass it around, 84 bottles of beer on the wall.\n84 bottles of beer on the wall, 84 bottles of beer.\nTake one down and pass it around, 83 bottles of beer on the wall.\n83 bottles of beer on the wall, 83 bottles of beer.\nTake one down and pass it around, 82 bottles of beer on the wall.\n82 bottles of beer on the wall, 82 bottles of beer.\nTake one down and pass it around, 81 bottles of beer on the wall.\n81 bottles of beer on the wall, 81 bottles of beer.\nTake one down and pass it around, 80 bottles of beer on the wall.\n80 bottles of beer on the wall, 80 bottles of beer.\nTake one down and pass it around, 79 bottles of beer on the wall.\n79 bottles of beer on the wall, 79 bottles of beer.\nTake one down and pass it around, 78 bottles of beer on the wall.\n78 bottles of beer on the wall, 78 bottles of beer.\nTake one down and pass it around, 77 bottles of beer on the wall.\n77 bottles of beer on the wall, 77 bottles of beer.\nTake one down and pass it around, 76 bottles of beer on the wall.\n76 bottles of beer on the wall, 76 bottles of beer.\nTake one down and pass it around, 75 bottles of beer on the wall.\n75 bottles of beer on the wall, 75 bottles of beer.\nTake one down and pass it around, 74 bottles of beer on the wall.\n74 bottles of beer on the wall, 74 bottles of beer.\nTake one down and pass it around, 73 bottles of beer on the wall.\n73 bottles of beer on the wall, 73 bottles of beer.\nTake one down and pass it around, 72 bottles of beer on the wall.\n72 bottles of beer on the wall, 72 bottles of beer.\nTake one down and pass it around, 71 bottles of beer on the wall.\n71 bottles of beer on the wall, 71 bottles of beer.\nTake one down and pass it around, 70 bottles of beer on the wall.\n70 bottles of beer on the wall, 70 bottles of beer.\nTake one down and pass it around, 69 bottles of beer on the wall.\n69 bottles of beer on the wall, 69 bottles of beer.\nTake one down and pass it around, 68 bottles of beer on the wall.\n68 bottles of beer on the wall, 68 bottles of beer.\nTake one down and pass it around, 67 bottles of beer on the wall.\n67 bottles of beer on the wall, 67 bottles of beer.\nTake one down and pass it around, 66 bottles of beer on the wall.\n66 bottles of beer on the wall, 66 bottles of beer.\nTake one down and pass it around, 65 bottles of beer on the wall.\n65 bottles of beer on the wall, 65 bottles of beer.\nTake one down and pass it around, 64 bottles of beer on the wall.\n64 bottles of beer on the wall, 64 bottles of beer.\nTake one down and pass it around, 63 bottles of beer on the wall.\n63 bottles of beer on the wall, 63 bottles of beer.\nTake one down and pass it around, 62 bottles of beer on the wall.\n62 bottles of beer on the wall, 62 bottles of beer.\nTake one down and pass it around, 61 bottles of beer on the wall.\n61 bottles of beer on the wall, 61 bottles of beer.\nTake one down and pass it around, 60 bottles of beer on the wall.\n60 bottles of beer on the wall, 60 bottles of beer.\nTake one down and pass it around, 59 bottles of beer on the wall.\n59 bottles of beer on the wall, 59 bottles of beer.\nTake one down and pass it around, 58 bottles of beer on the wall.\n58 bottles of beer on the wall, 58 bottles of beer.\nTake one down and pass it around, 57 bottles of beer on the wall.\n57 bottles of beer on the wall, 57 bottles of beer.\nTake one down and pass it around, 56 bottles of beer on the wall.\n56 bottles of beer on the wall, 56 bottles of beer.\nTake one down and pass it around, 55 bottles of beer on the wall.\n55 bottles of beer on the wall, 55 bottles of beer.\nTake one down and pass it around, 54 bottles of beer on the wall.\n54 bottles of beer on the wall, 54 bottles of beer.\nTake one down and pass it around, 53 bottles of beer on the wall.\n53 bottles of beer on the wall, 53 bottles of beer.\nTake one down and pass it around, 52 bottles of beer on the wall.\n52 bottles of beer on the wall, 52 bottles of beer.\nTake one down and pass it around, 51 bottles of beer on the wall.\n51 bottles of beer on the wall, 51 bottles of beer.\nTake one down and pass it around, 50 bottles of beer on the wall.\n50 bottles of beer on the wall, 50 bottles of beer.\nTake one down and pass it around, 49 bottles of beer on the wall.\n49 bottles of beer on the wall, 49 bottles of beer.\nTake one down and pass it around, 48 bottles of beer on the wall.\n48 bottles of beer on the wall, 48 bottles of beer.\nTake one down and pass it around, 47 bottles of beer on the wall.\n47 bottles of beer on the wall, 47 bottles of beer.\nTake one down and pass it around, 46 bottles of beer on the wall.\n46 bottles of beer on the wall, 46 bottles of beer.\nTake one down and pass it around, 45 bottles of beer on the wall.\n45 bottles of beer on the wall, 45 bottles of beer.\nTake one down and pass it around, 44 bottles of beer on the wall.\n44 bottles of beer on the wall, 44 bottles of beer.\nTake one down and pass it around, 43 bottles of beer on the wall.\n43 bottles of beer on the wall, 43 bottles of beer.\nTake one down and pass it around, 42 bottles of beer on the wall.\n42 bottles of beer on the wall, 42 bottles of beer.\nTake one down and pass it around, 41 bottles of beer on the wall.\n41 bottles of beer on the wall, 41 bottles of beer.\nTake one down and pass it around, 40 bottles of beer on the wall.\n40 bottles of beer on the wall, 40 bottles of beer.\nTake one down and pass it around, 39 bottles of beer on the wall.\n39 bottles of beer on the wall, 39 bottles of beer.\nTake one down and pass it around, 38 bottles of beer on the wall.\n38 bottles of beer on the wall, 38 bottles of beer.\nTake one down and pass it around, 37 bottles of beer on the wall.\n37 bottles of beer on the wall, 37 bottles of beer.\nTake one down and pass it around, 36 bottles of beer on the wall.\n36 bottles of beer on the wall, 36 bottles of beer.\nTake one down and pass it around, 35 bottles of beer on the wall.\n35 bottles of beer on the wall, 35 bottles of beer.\nTake one down and pass it around, 34 bottles of beer on the wall.\n34 bottles of beer on the wall, 34 bottles of beer.\nTake one down and pass it around, 33 bottles of beer on the wall.\n33 bottles of beer on the wall, 33 bottles of beer.\nTake one down and pass it around, 32 bottles of beer on the wall.\n32 bottles of beer on the wall, 32 bottles of beer.\nTake one down and pass it around, 31 bottles of beer on the wall.\n31 bottles of beer on the wall, 31 bottles of beer.\nTake one down and pass it around, 30 bottles of beer on the wall.\n30 bottles of beer on the wall, 30 bottles of beer.\nTake one down and pass it around, 29 bottles of beer on the wall.\n29 bottles of beer on the wall, 29 bottles of beer.\nTake one down and pass it around, 28 bottles of beer on the wall.\n28 bottles of beer on the wall, 28 bottles of beer.\nTake one down and pass it around, 27 bottles of beer on the wall.\n27 bottles of beer on the wall, 27 bottles of beer.\nTake one down and pass it around, 26 bottles of beer on the wall.\n26 bottles of beer on the wall, 26 bottles of beer.\nTake one down and pass it around, 25 bottles of beer on the wall.\n25 bottles of beer on the wall, 25 bottles of beer.\nTake one down and pass it around, 24 bottles of beer on the wall.\n24 bottles of beer on the wall, 24 bottles of beer.\nTake one down and pass it around, 23 bottles of beer on the wall.\n23 bottles of beer on the wall, 23 bottles of beer.\nTake one down and pass it around, 22 bottles of beer on the wall.\n22 bottles of beer on the wall, 22 bottles of beer.\nTake one down and pass it around, 21 bottles of beer on the wall.\n21 bottles of beer on the wall, 21 bottles of beer.\nTake one down and pass it around, 20 bottles of beer on the wall.\n20 bottles of beer on the wall, 20 bottles of beer.\nTake one down and pass it around, 19 bottles of beer on the wall.\n19 bottles of beer on the wall, 19 bottles of beer.\nTake one down and pass it around, 18 bottles of beer on the wall.\n18 bottles of beer on the wall, 18 bottles of beer.\nTake one down and pass it around, 17 bottles of beer on the wall.\n17 bottles of beer on the wall, 17 bottles of beer.\nTake one down and pass it around, 16 bottles of beer on the wall.\n16 bottles of beer on the wall, 16 bottles of beer.\nTake one down and pass it around, 15 bottles of beer on the wall.\n15 bottles of beer on the wall, 15 bottles of beer.\nTake one down and pass it around, 14 bottles of beer on the wall.\n14 bottles of beer on the wall, 14 bottles of beer.\nTake one down and pass it around, 13 bottles of beer on the wall.\n13 bottles of beer on the wall, 13 bottles of beer.\nTake one down and pass it around, 12 bottles of beer on the wall.\n12 bottles of beer on the wall, 12 bottles of beer.\nTake one down and pass it around, 11 bottles of beer on the wall.\n11 bottles of beer on the wall, 11 bottles of beer.\nTake one down and pass it around, 10 bottles of beer on the wall.\n10 bottles of beer on the wall, 10 bottles of beer.\nTake one down and pass it around, 9 bottles of beer on the wall.\n9 bottles of beer on the wall, 9 bottles of beer.\nTake one down and pass it around, 8 bottles of beer on the wall.\n8 bottles of beer on the wall, 8 bottles of beer.\nTake one down and pass it around, 7 bottles of beer on the wall.\n7 bottles of beer on the wall, 7 bottles of beer.\nTake one down and pass it around, 6 bottles of beer on the wall.\n6 bottles of beer on the wall, 6 bottles of beer.\nTake one down and pass it around, 5 bottles of beer on the wall.\n5 bottles of beer on the wall, 5 bottles of beer.\nTake one down and pass it around, 4 bottles of beer on the wall.\n4 bottles of beer on the wall, 4 bottles of beer.\nTake one down and pass it around, 3 bottles of beer on the wall.\n3 bottles of beer on the wall, 3 bottles of beer.\nTake one down and pass it around, 2 bottles of beer on the wall.\n2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n1 bottle of beer on the wall, 1 bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.");
        else if (code == 'Q') return "" + code;
        else return null;
    }//+
    public String reverseWords(String str){
        String[] arr = str.split(" ");
        String res = "";
        int i = arr.length - 1;
        for (String s : str.split(" ")) {
            arr[i] = s;
            i--;
        }
        for (int j = 0; j < arr.length; j++) {
            res += arr[j] + " ";
        }

        return res.trim();
    }
    public List<String> sort(List<String> textbooks) {
        List<String> res = new ArrayList<>();
        res.addAll(textbooks);
        Collections.sort(res, String.CASE_INSENSITIVE_ORDER);
        return res;
    }//+
    public int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }//+
    public String kataExampleTwist(){
        String[] websites = new String[1000];
        for (int i = 0; i < 1000; i++) {
            websites[i] = "codewars";
        }
        return Arrays.toString(websites);
    }//+
    public double convertToCelsius(double temperature) {
        return (double) ((temperature - 32) * 5 / 9);
    }//+
    public boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int res;
        res = (IntStream.of(classPoints).sum() + yourPoints) / (classPoints.length + 1) ;
        return yourPoints > res;
    }
    public int hexToDec(final String hexString) {return Integer.parseInt(hexString, 16);
    }//+
    public int[] humanYearsCatYearsDogYears(final int humanYears) {
        int cat, dog;
        cat = dog = 0;
        switch (humanYears){
            case 1:
                cat = dog = 15;
                break;
            case 2:
                dog = 15 + 9;
                cat = 15 + 9;
                break;
                default:
                    dog = 15 + 9 + (humanYears - 2 ) * 5;
                    cat = 15 + 9 + (humanYears - 2 ) * 4;
                    break;
        }
        return new int[]{humanYears, cat, dog};
    }
    public Boolean authenticate(String name, String password){
        return (name.equals("Santa Claus") && password.equals("Ho Ho Ho!"));
    }//+
    public String areYouPlayingBanjo(String name) {
        if (name.startsWith("r") || name.startsWith("R")) return name + " plays banjo";
        else return name + " does not play banjo";
    }//+
    public String digitize(long n) {
        String str = new StringBuilder(Long.toString(n)).reverse().toString();
        int[] res = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            res[i] = Character.getNumericValue(str.charAt(i));
        }
        return Arrays.toString(res);
    }//+
    public String solution(String str) {
        StringBuilder res = new StringBuilder();
        res.append(str);
        res.reverse();
        return res.toString();
    }//+
    public String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") return "found the needle at position " + i;
        }
        return "not found";
    }//+
    public String stringy(int size) {
        String res = "";
        for (int i = 0; i < size / 2 + 1; i++) {
            res += "10";
        }
        return res.substring(0, size);
    }
    public int getAverage(int[] marks){
        return (int) (IntStream.of(marks).average().orElse(0));
    }
    public int cockroachSpeed(double x){
        return  (int) (x * 100000/3600);
    }//+
    public String twoSort(String[] s) {
        Arrays.sort(s);
        return String.join("***",s[0].split(""));
    }//+
    public String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");//+
    }
    public String switchItUp(int number){
        String[] num = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return num[number];
    }//+
    public double find_average(int[] array){
        return IntStream.of(array).average().orElse(0);
    }//+
    public String toAlternativeString(String string) {
        String res = "";
        for (char x : string.toCharArray()){
            if (x > 90 && x < 123) res += (char) Character.toUpperCase(x);
            else res += (char) Character.toLowerCase(x);
        }
        return res;
    }//+
    public String subtractSum(int n) {
        String[] arr = new String[]{"kiwi", "pear", "kiwi", "banana", "melon", "banana",  "melon", "pineapple",  "apple",
                "pineapple",  "cucumber",  "pineapple",  "cucumber", "orange", "grape",  "orange", "grape",
                "apple", "grape",  "cherry",  "pear",  "herry",  "pear", "kiwi",
                "banana", "kiwi",  "apple",  "melon", "banana",  "melon",  "pineapple",  "melon",  "pineapple",
                "cucumber", "orange", "apple",  "orange", "grape", "orange",  "grape",  "cherry",  "pear",
                "cherry", "pear", "apple",  "pear",  "kiwi", "banana",  "kiwi", "banana",  "melon",
                "pineapple",  "melon",  "apple", "cucumber", "pineapple",  "cucumber",  "orange",  "cucumber",
                "orange", "grape", "cherry",  "apple",  "cherry", "pear",  "cherry",  "pear",
                "kiwi", "pear", "kiwi",  "banana", "apple",  "banana",  "melon",  "pineapple",
                "melon","pineapple",  "cucumber", "pineapple", "cucumber",  "apple",
                "grape", "orange", "grape", "cherry", "grape",
                "cherry",  "pear", "cherry", "apple", "kiwi",  "banana",  "kiwi",
                "banana",  "melon",  "banana", "melon",  "pineapple", "apple", "pineapple"
        };

        if (n > 0 && n <= 100) return arr[n - 1];
        else if (n > 100 && n < 1000) {
            while (true) {
                if (n > 100) {
                    n = n - (n % 10 + n / 100 + n / 10 % 10);
                } else {
                    return arr[n - 1];
                }
            }
        } else if (n > 999 && n < 10000) {
            while (true) {
                if (n > 999) {
                    n = n - (n % 10 + n / 1000 + n / 100 % 10 + n / 10 % 10);
                } else {
                    return arr[n - 1];
                }
            }
        }
        else return "" + n;
    }//+
    public String fakeBin(String numberString) {
        char[] arr = numberString.toCharArray();
        for (char i = 0; i < arr.length; i++) {
            if (Character.getNumericValue(arr[i]) < 5) arr[i] = '0';
            else arr[i] = '1';
        }
        return String.valueOf(arr);
    }//+
    public String dnaToRna(String dna) {
        return dna.replace("T", "U");
    }//+
    public String bonusTime(final int salary, final boolean bonus) {
        return "\u00A3" + (bonus ? salary * 10 : salary);
    }//+
    public int findLongest(final String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
    }//+
    public int getCount(String str) {
        int vowelsCount = 0;
        for (char ch : str.toCharArray())
            if (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'e') vowelsCount++;
        return vowelsCount;
    }//+
    public String autoMorphic(int n) {
        int res = n * n;
        return Integer.toString(res).endsWith("" + n) ? "Automorphic" : "Not!!";
    } //+
    public String[] fixTheMeerkat(String[] arr) {
        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - i - 1];
        }
        return res;
    }//+
    public int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }//+
    public int grow(int[] x) {
        int res = 1;
        for (int z : x)
            res *= z;
        return res;
    }//+
    public String updateLight(String current) {
        switch (current) {
            case "green":
                return "yellow";
            case "yellow":
                return "red";
            case "red":
                return "green";
            default:
                return current;
        }
    }//+
    public boolean isDivisible(int wallLength, int pixelSize) {
        return (boolean) ((wallLength % pixelSize) == 0);
    }
    public int dutyFree(int normPrice, int discount, int hol) {
        return (int) ((hol * 100) / (normPrice * discount));
    }//+
    public int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i] * -1;
        }
        return array;
    }//+
    public int makeNegative(final int x) {
        return -Math.abs(x);
    }
    public String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }//+
    public int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.toCharArray().length; i++) {
            if (str.charAt(i) == letter) count++;
        }
        return count;
    }//+
    public int TwiceAsOld(int dadYears, int sonYears) {
        return Math.abs(dadYears - sonYears * 2);
    }//++-
    public String abbrevName(String name) {
        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    }//-
    public double findUniq(double arr[]) {
        double x1 = 0, x2 = 0;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                x1 = arr[i];
                x2 = arr[i + 1];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++)
            if (x1 == arr[i]) count++;
        if (count > 1) return x2;
        else return x1;
//            if (arr[i] != arr[i + 1]) {
//                if (arr[i+1] == arr[arr.length - 1]){
//                    x = arr[i + 1];
//                    break;
//                }
//                else if (arr[i + 1] == arr[i + 2]){
//                        x = arr[i];
//                        break;
//                }
//                else{
//                    x = arr[i + 1];
//                    break;
//                }
//            }
//        }

//        Arrays.sort(arr);
//        if (arr[0] == arr[1]) return arr[x];
//        else return arr[0];
    }
    public String numberToString(int num) {
        return Integer.toString(num);
    }//+
    public int opposite(int number) {
        return Math.negateExact(number);
    }//+
    static String noSpace(final String x) {
        return x.replace(" ", "");
    }//+
    public boolean check(Object[] a, Object x) {
        for (Object o : a) {
            if (o == x) return true;
        }
        return false;
    }
    public int[] mergeArrays(int[] first, int[] second){
        int j = 0;
        Collection<Integer> arr = new TreeSet<Integer>();
        for (int i : first)
            arr.add(i);
        for (int i : second)
            arr.add(i);

        int[] res = new int[arr.size()];
        for (Integer x : arr)
            res[j++] = x;
        return res;
    }//-
    public boolean feast(String beast, String dish) {
        char c1 = beast.charAt(0), cl = beast.charAt(beast.length() - 1);
        char c2 = dish.charAt(0), c2l = dish.charAt(dish.length() - 1);
        return (c1 == c2 && cl == c2l);
    }//+
    public String repair(String string) {
        char[] ch = string.toCharArray();
        string = "";
        for (char s : ch) {
            if (s == '1') string += 'I';
            else if (s == '0') string += 'O';
            else if (s == '5') string += 'S';
            else string += s;
        }

        return string;
    } //+
    public int arrays3(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == null) continue;
            else if (arrayOfSheeps[i] == true) count++;
        }
        return count;
    }//+
    public int arrays2(int[] input) {
        int res = 0;
        for (int i : input) {
            if (res == 0) res = i;
            if (res > i) res = i;
        }

        return res;
    }// +
    public int[] arrays(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        else {
            int count = 0, sum = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) count++;
                else sum += input[i];
            }
            return new int[]{count, sum};
        }
    } //+
    public int liters(double time) {
        return (int) (time * 0.5);
    }//+
    public int maxNum(int num) {
        int z = 0;
        char[] ch = (Integer.toString(num).toCharArray());
        int[] res = new int[ch.length],
                x = new int[ch.length],
                y = new int[ch.length];
        for (int i = 0; i < ch.length; i++)
            res[i] = Character.getNumericValue(ch[i]);
        x[0] = res[0];
        y[1] = res[1];
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                x[i] = res[i];
                y[j] = res[j];
                if (x[i] < y[j]) {
                    res[i] = y[j];
                    res[j] = x[i];
                } else {
                    res[i] = x[i];
                    res[j] = y[j];
                }
            }
        }
        for (int i = 0; i < ch.length; i++)
            z += res[i] * (int) Math.pow(10, ch.length - i - 1);
        return z;
    }//хз
    public int age(final String herAge) {
        int age = Character.getNumericValue(herAge.charAt(0));
        return age;
    }//-
}
