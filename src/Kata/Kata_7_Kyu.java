package Kata;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata_7_Kyu {
    public List<String> myLanguages(final Map<String, Integer> results) {
//        Map<String, Integer> sortedMap = results
//                .entrySet()
//                .stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .collect(
//                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
//                        LinkedHashMap::new ));
//
//        List<String> strings = new ArrayList<>();
//        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()){
//            if (entry.getValue() >= 60) strings.add(entry.getKey());
//        }
//        return strings;
        return results.entrySet()
                .stream()
                .filter(me -> me.getValue() >= 60)
                .sorted((m1, m2) -> Integer.compare(m2.getValue(), m1.getValue()))
                .map(me -> me.getKey())
                .collect(Collectors.toList());
    }//output list of selected keys from the map
    public Object dbSort(Object[] a) {
        List<Integer> intRay = new ArrayList<>();
        List<String> strRay = new ArrayList<>();
        List<Object> res = new ArrayList<>();

        for (Object x : a) {
            if (x instanceof Integer) {
                intRay.add((Integer) (x));
            } else if (x instanceof String) {
                strRay.add((String) (x));
            }
        }
        Collections.sort(strRay);
        Collections.sort(intRay);
        res.addAll(intRay);
        res.addAll(strRay);

        return res;
    }//sorted list of several variables
    public int maxTriSum(int[] numbers) {
        int sum = 0;
        int[] arr = IntStream.of(numbers).distinct().sorted().toArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + arr[i - 1] + arr[i - 2];
            break;
        }
        return sum;
    }//sorted array without duplicates
    public void sortedMap() {
        Map<Integer, String> unsortMap = new HashMap<>();
        unsortMap.put(10, "Ashraf");
        unsortMap.put(5, "Sara");
        unsortMap.put(6, "Mohamed");
        unsortMap.put(20, "Esraa");
        unsortMap.put(1, "Bahaa");
        unsortMap.put(7, "Dalia");
        unsortMap.put(8, "Amira");
        unsortMap.put(99, "Ahmed");
        unsortMap.put(50, "Sama");
        unsortMap.put(2, "Nada");
        unsortMap.put(9, "Osama");
        System.out.println("Unsort Map......");
        printMap(unsortMap);

        // Using the default natural ordering of sorted map Integer key which implement Comparable interface
        System.out.println("\nSorted Map in ascending order......");
        Map<Integer, String> ascSortedMap = new TreeMap<>(unsortMap);
        printMap(ascSortedMap);

        // Forcing the descending order by creating our own comparator then passing it to the sorted map at creation time
        System.out.println("\nSorted Map in descending order......");
        Map<Integer, String> desSortedMap = new TreeMap<>(Comparator.reverseOrder());
        desSortedMap.putAll(unsortMap);
        printMap(desSortedMap);
    }//map sorting
    private static void printMap(Map<Integer, String> map) {
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }//sortedMap output


    public boolean getXO (String str) {
        int xamount = 0, oamount = 0;
        for (int i = 0; i < str.toCharArray().length; i++) {
            if (str.toLowerCase().charAt(i) == 'x') xamount++;
            if (str.toLowerCase().charAt(i) == 'o') oamount++;
        }
        return xamount == oamount;
    }//+
    public String wallpaper(double l, double w, double h) {
        int res = 0;
        if (w == 0){
            res = (int) Math.ceil(2 * h * l * 1.15 / 5.2);
            return number(res);
        }
        if (h == 0){
            res = (int) Math.ceil(2 * (l + w) * 1.15 / 5.2);
            return number(res);
        }
        if (l == 0){
            res = (int) Math.ceil(2 * h * w * 1.15 / 5.2);
            return number(res);
        }
        res = (int) Math.ceil(2 * h * (l + w) * 1.15 / 5.2);
        return number(res);
    }//+
    private String number(int x) {
        String[] res = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty"
        };
        return res[x];
    }//
    public String longest (String s1, String s2) {
        Set<String> res = new TreeSet<>();
        res.addAll(Arrays.asList(s1.split("")));
        res.addAll(Arrays.asList(s2.split("")));
        return res.toString().replaceAll("[\\[\\], ]", "");
    }//+
    public String reverseWords(final String original) {
        if (original.replaceAll(" ", "").equals("")) return original;
        String[] arr = original.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            res.append(arr[i]).append(" ");
        }
        return res.reverse().toString().trim();
    }//+
    public String fizzBuzzCuckooClock(String time) {
        String min = time.substring(3);
        String hour = time.substring(0, 2);

        if (min.equals("00")) {
            if (hour.equals("00")){
                String[] res = new String[12];
                Arrays.fill(res, "Cuckoo");
                return Arrays.toString(res).replaceAll("[\\[\\],]", "");
            }
            if (Integer.valueOf(hour) < 13) {
                String[] res = new String[Integer.valueOf(hour)];
                Arrays.fill(res, "Cuckoo");
                return Arrays.toString(res).replaceAll("[\\[\\],]", "");
            } else {
                hour = Integer.toString(Integer.valueOf(hour) - 12);
                String[] res = new String[Integer.valueOf(hour)];
                Arrays.fill(res, "Cuckoo");
                return Arrays.toString(res).replaceAll("[\\[\\],]", "");
            }
        }
        if (min.equals("30"))
            return "Cuckoo";
        if (Integer.valueOf(min) % 3 == 0 && Integer.valueOf(min) % 5 == 0)
            return "Fizz Buzz";
        if (Integer.valueOf(min) % 3 == 0 )
            return "Fizz";
        if (Integer.valueOf(min) % 5 == 0)
            return "Buzz";
        else
        return "tick";

    }//+
    public double movie(int card, int ticket, double perc) {
        double sumB = card, sumA = ticket;
        int res = 0;

        for (int i = 1; Math.ceil(sumA) <= Math.ceil(sumB); i++) {
            sumA += ticket;
            sumB += ticket * Math.pow(perc, i);
            res = i;
        }
        return res + 1;
    }//+
    public long[] seven(long m) {
        int count = 0;
        long res = m;
        while (res >= 100) {
            res = ((int) res / 10) - (2 * (res % 10));
            count++;
        }
        return new long[]{res, count};
    }//+
    public int nbDig(int n, int d) {
        int res = 0;
        for (int i = 0; i <= n; i++) {

            for (String x : String.valueOf((int) Math.pow(i, 2)).split("")) {
                if (x.matches(String.valueOf(d))) res++;
            }
        }

        return res;
    }//+
    public int mxdiflg(String[] a1, String[] a2) {
        if (a1 == null || a2 == null) return -1;
        if (a1.length == 0 || a2.length == 0) return -1;
        int max = 0;
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a1.length; j++) {
                int z = Math.abs(a2[i].length() - a1[j].length());
                if (z > max) max = z;
            }
        }
        return max;
    }//+
    public String printerError(String s) {
        int count = 0;
        for (String x : s.split("")) {
            if (x.matches("[n-z]")) count++;
        }
        return count + "/" + s.toCharArray().length;
    }//+
    public int nthterm(int first, int n, int c) {

        int res = first;
        for (int i = 0; i < n; i++) {
            res += c;
        }
        return res;
    }//+
    public boolean isNegativeZero(float n) {
        return Float.valueOf(n).equals(-0.0f);
    }//+
    public int gps(int s, double[] x) {
        double maxSpeed = 0;
        for (int i = 1; i < x.length; i++)
            maxSpeed = Math.max((x[i] - x[i - 1]), maxSpeed);

        return (int) (maxSpeed * 3600 / s);
    }//+
    public String scale(String str, int k, int v) {
        if (str.length() == 0) return "";

        String result = "";
        String[] s;
        List res = new ArrayList();
        char[] arr = str.toCharArray();

        for (char x : arr)
            for (int j = 0; j < k; j++) {
                res.add(x);
                if (x == '\n') break;
            }

        s = res.toString().split("");
        for (int i = 0; i < v; i++)
            result += Arrays.toString(s).replaceAll("[, \\[\\]]", "") + "\n";
        s = result.split("\n");
        Arrays.sort(s);
        for (int i = 0; i < s.length; i++) {
            s[i] += "\n";
        }
        return Arrays.toString(s).replaceAll("[, \\[\\]]", "");
    }//+-
    public boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }//+
    public int findShort(String s) {
        String str = "";
        int wordLength = 100;
        for (String x : s.split(" ")) {
            if (wordLength > x.length()) wordLength = x.length();
        }
        return wordLength;
    }//+
    public long maxNumber(long n) {
        List<String> arr = new ArrayList<>();
        for (String s : String.valueOf(n).split("")) {
            arr.add(s);
        }
        Collections.sort(arr);
        StringBuilder str = new StringBuilder(String.join("", arr));
        return Long.valueOf(str.reverse().toString());
    }//+
    public String getIssuer(String cardNumber) {
//        if (cardNumber.length() == 13) return "VISA";
//        if (cardNumber.length() == 16 & cardNumber.startsWith("4")) return "VISA";
//        if (cardNumber.length() == 15) return "AMEX";
//        if (cardNumber.length() == 16 & cardNumber.startsWith("6011")) return "Discover";
//        if (cardNumber.length() == 16 & cardNumber.startsWith("51")) return "Mastercard";
//        if (cardNumber.length() == 16 & cardNumber.startsWith("52")) return "Mastercard";
//        if (cardNumber.length() == 16 & cardNumber.startsWith("53")) return "Mastercard";
//        if (cardNumber.length() == 16 & cardNumber.startsWith("54")) return "Mastercard";
//        if (cardNumber.length() == 16 & cardNumber.startsWith("55")) return "Mastercard";
//        else return "Unknown";
        if (cardNumber.matches("^3[47]\\d{13}$")) return "AMEX";
        if (cardNumber.matches("^6011\\d{12}$")) return "Discover";
        if (cardNumber.matches("^5[12345]\\d{14}$")) return "Mastercard";
        if (cardNumber.matches("^4\\d{12}(\\d{3})?$")) return "VISA";
        return "Unknown";
    }//+
    public int nthSmallest(final int[] arr, final int n) {
        Arrays.sort(arr);
        return arr[n - 1];
    }//+
    public int adjacentElementsProduct(int[] array) {
        int res = array[0] * array[1];
        int mult;
        for (int i = 2; i < array.length; i++) {
            mult = array[i - 1] * array[i];
            if (res < mult) res = mult;
        }
        return res;
    }//+
    public int minimumSteps(int[] numbers, int k) {
        int res = 0;
        Arrays.sort(numbers);
        for (int i = 0; i <= numbers.length; i++) {
            if (res >= k) return i - 1;
            else res += numbers[i];
        }
        return res;
    }//+
    public int minValue(int[] values) {
        int[] arr = IntStream.of(values).sorted().distinct().toArray();

//        int res = 0;
//        for (int i = 0; i < arr.length; i++) {
//            res += arr[i] * Math.pow(10, (arr.length - i - 1));
//        }
//        return res;

        String s;
        s = Arrays.toString(arr);
        return Integer.valueOf(s.replaceAll("[, \\[\\]]", ""));
    }//+
    public int[] rowWeights(final int[] weights) {
        int odd = 0, even = 0;
        for (int i = 0; i < weights.length; i++) {
            if ((i % 2) == 0) even += weights[i];
            else odd += weights[i];
        }
        return new int[]{even, odd}; // Do your magic!
    }//+
    public long[] productArray(int[] numbers) {
        long[] res = new long[numbers.length];
        Arrays.fill(res, 1);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                res[i] *= numbers[j];
            }
            res[i] /= numbers[i];
        }
        return res;
    }//+
    public int maxGap(int[] numbers) {
        int sum, res = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length; i++) {
            sum = Math.abs(numbers[i] - numbers[i - 1]);
            if (sum > res) res = sum;
        }
        return res;
    }//+
    public List arrayLeaders(int[] numbers) {
        int sum, r = 0;
        List res = new ArrayList();
        for (int i = 0; i < numbers.length; i++) {
            int x = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                x += numbers[j];
                if ((j == numbers.length - 1) && numbers[i] > x) res.add(numbers[i]);
            }
        }
        if (numbers[numbers.length - 1] > 0) res.add(numbers[numbers.length - 1]);
        return res;
    }//+
    public long maxProduct(int[] numbers, int sub_size) {
        long res = 1;
        Arrays.sort(numbers);
        for (int i = 0; i < sub_size; i++) {
            res *= numbers[numbers.length - 1 - i];
        }
        return res;
    }//+
    public int minSum(int[] passed) {
        int minSum = 0;
        Arrays.sort(passed);
        for (int i = 0; i < passed.length / 2; i++) {
            minSum += passed[i] * passed[passed.length - 1 - i];
        }
        return minSum;
    }//+
    public String diagonal(int[][] matrix) {
        int pd = 0, sd = 0;
        for (int i = 0; i < matrix.length; i++) {
            pd += matrix[i][i];
            sd += matrix[i][matrix.length - i - 1];
        }
        if (pd > sd) return "Principal Diagonal win!";
        else if (sd > pd) return "Secondary Diagonal win!";
        else return "Draw!";
    }//+
}
