package onboard;

import java.util.*;
import java.util.stream.Stream;

/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;

        char [] arrNum = Integer.toString(number).toCharArray();
        List<Integer> numbers = new ArrayList<>();
        for(int i=0;i<arrNum.length; i++){
            numbers.add(Character.getNumericValue(arrNum[i]));
        }
        numbers.sort(Comparator.reverseOrder());
        for(int i = 0; i<numbers.size(); i++){
            answer += numbers.get(i) * (int)Math.pow(10, numbers.size()-i-1);
        }

        return answer;
    }
}
