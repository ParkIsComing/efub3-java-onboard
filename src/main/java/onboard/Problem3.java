package onboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }

        Collections.sort(numbers);
        List<Integer> answer =List.of(sum/numbers.size(), numbers.get(2));
        return answer;
    }
}
