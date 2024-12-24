package level_0.reverseArray;

import java.util.ArrayList;

public class Solution {

        public ArrayList<Integer> solution(int[] num_list) {
            ArrayList<Integer> answer = new ArrayList<Integer>();
            for(int i = num_list.length-1; i >= 0;  i--){
                answer.add(num_list[i]);

            }
            System.out.println(answer);
            return answer;
        }
    }
