import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int to_find = 1;
        
        for (int element : A){
            if (element > 0){
                if (element == to_find){
                    to_find++;
                } else if (element > to_find){
                    return to_find;
                }
            }
        }
        return to_find;
    }
}

