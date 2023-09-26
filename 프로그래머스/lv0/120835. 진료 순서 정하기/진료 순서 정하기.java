import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copyEmergency = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++)
        {
            copyEmergency[i] = emergency[i];
        }
        Arrays.sort(emergency);
        for(int i = 0; i < copyEmergency.length; i++)
        {
            for(int j = 0; j < emergency.length; j++)
            {
                if(copyEmergency[i] == emergency[j])
                {
                    answer[i] = emergency.length - j;
                }
            }
        }
        return answer;
    }
}