

import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        
        // Edge cases that Codacity runs, despite it going against the contraints of the specification.
        if (A.length == 0 || A[0] != 1)
            return 1;
        if (A.length == 1)
            return 2;

        for (int i = 0; i < A.length - 1; i++){
            if (A[i] + 1 != A[i + 1]){
                // Return what we should've had, given base assumptions about the problem.
                return A[i] + 1;
            }
        }
        // If we get to this point, everything was fine so far, so give the N + 1st element.
        return A[A.length - 1] + 1;
    }
}

