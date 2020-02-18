package Kata;

import java.util.*;
import java.util.stream.Stream;

//comment from Sombra

public class Kata_6_Kyu {
    class Solution {
        public int minimumNumber(int[] numbers) {
            return (int) Stream.iterate(0, i -> i + 1)
                    .limit(28)
                    .filter(i -> prime(Arrays.stream(numbers).sum() + i)).toArray()[0];
        }

        private boolean prime(int n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }//знайти зайближче ціле число


    public String catalog(String s, String article) {
        String[] res = s.split("\\n");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            res[i] = res[i].replaceAll("(<prod><name>)", "")
                            .replace("</name>", "")
                            .replace("<prx>", " > prx: $")
                            .replace("</prx>", "")
                            .replace("<qty>", " qty: ")
                            .replace("</qty>", "")
                            .replace("</prod>", "");
        }
        for (String re : res) {
            if (re.contains(article)) result.add(re);
        }
        return result.size() == 0 ? "Nothing" : String.join("\n", result);
    }
    public String balance(String book) {
        if ("".equals(book)) return "";

        String[] res = book.replaceAll("[!=:;?{}]","").split("\\n");
        int div = 0;
        double sum = Double.valueOf(res[0]);
        StringBuilder result = new StringBuilder("Original Balance: ");

        for (int i = 0; i < res.length; i++) {
            int x = 0;
            for (String s : res[i].split(" ")){
                if (x++ == 2) {
                    sum = sum - Double.valueOf(s);
                    div++;
                }
            }
            if (i == 0) result.append(res[i]).append("\r\n");
            else result.append(res[i]).append(" Balance ").append(String.format("%.2f", sum)).append("\r\n");
        }
        sum = Double.valueOf(res[0]) - sum;
        result.append("Total expense  ").append(String.format("%.2f", sum));
        result.append("\nAverage expense  ").append(String.format("%.2f", sum/div));
        return result.toString().replaceAll(",", ".");

//        String t = book.replaceAll("([^\\n. \\da-zA-Z])", "");
//        String[] arr = t.split("[\\n]+");
//        double current = Double.parseDouble(arr[0]);
//        double total = 0;
//        int count = 0;
//        StringBuilder result = new StringBuilder();
//        result.append("Original Balance: " + arr[0]);
//        for (int i = 1; i < arr.length; i++) {
//            count++;
//            String[] line = arr[i].split("[ ]+");
//            current -= Double.parseDouble(line[2]);
//            total += Double.parseDouble(line[2]);
//            String u = String.format("\\r\\n%s %s %s Balance %.2f", line[0], line[1], line[2], current);
//            result.append(u);
//        }
//        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", total, total / count));
//        return result.toString();
    }//+
    public double[] tribonacci(double[] s, int n) {
        if (n == 0) return new double[0];

            double[] res = new double[n];
            res[0] = s[0];
            res[1] = s[1];
            res[2] = s[2];
            for (int i = 3; i < n; i++) {
                res[i] = res[i - 1] + res[i - 2] + res[i - 3];
            }
            return res;
    }//+
}
