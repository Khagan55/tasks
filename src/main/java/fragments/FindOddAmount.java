package fragments;

import java.util.List;

public class FindOddAmount {
    public int findOddAmount(List<Integer> numbers) {
        int count = 0, get_result = 0;
        for(int i = 0; i < numbers.size(); i++){
            for(int j = 0; j < numbers.size(); j++){
                if(numbers.get(i) == numbers.get(j)){
                    count++;
                }
            }
            if(count % 2 != 0){
                get_result = numbers.get(i);
                break;
            }
        }
        return get_result;
    }
}
