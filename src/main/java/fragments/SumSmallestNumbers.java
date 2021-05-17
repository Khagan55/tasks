package fragments;

import java.util.List;

public class SumSmallestNumbers {
    public int sumSmallestNumbers(List<Integer> numbers){
        int sum = numbers.stream().sorted().limit(2).reduce(0, Integer::sum);
        return  sum;
    }
}