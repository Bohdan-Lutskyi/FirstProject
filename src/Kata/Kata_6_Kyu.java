package Kata;

import java.util.Arrays;
import java.util.stream.Stream;

public class Kata_6_Kyu {

    class Solution {
        public int minimumNumber(int[] numbers) {
            return (int) Stream.iterate(0, i -> i + 1)
                    .limit(28)
                    .filter(i -> prime(Arrays.stream(numbers).sum() + i)).toArray()[0];
        }

        public boolean prime(int n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }//знайти зайближче ціле число
}
