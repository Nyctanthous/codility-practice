import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        
        // Edge case when there is nothing there.
        if (A.length == 0)
            return 1;

        // Main body, make sure we have a continuous sequence.
        int to_find = 1;
        for (int i = 0; i < A.length; i++){
            if (A[i] == to_find){
                to_find++;
            } else if (A[i] > to_find){
                return to_find;
            }
        }
        
        // Final edge cases
        if (A[A.length - 1] < 1)
            return 1;
        return A[A.length - 1] + 1;
    }
}

