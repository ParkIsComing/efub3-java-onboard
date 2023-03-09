package onboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = new Integer[20];

        for(int i=0; i<20; i++){
            answer[i] = i+1;
        }
        for(Integer[] set: flipCards){
            Integer [] copiedRange = Arrays.copyOfRange(answer,set[0]-1,set[1]);

            Integer [] flipped = new Integer[copiedRange.length];
            for(int i=0; i<copiedRange.length;i++){
                flipped[copiedRange.length - 1 - i] = copiedRange[i];
            }
            System.arraycopy(flipped, 0, answer, set[0]-1, copiedRange.length );
        }
        return answer;
    }
}
