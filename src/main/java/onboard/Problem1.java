package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute){
        if(minute < 45){
            if(hour == 0){
                hour = 23;
            }else{
                hour -= 1;
            }
            minute = minute + 60 - 45;
        }else{
            minute = minute - 45;
        }
        List<Integer> answer = List.of(hour, minute);
        return answer;
    }
}
