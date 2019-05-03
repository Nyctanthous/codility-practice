import java.util.Arrays; 

class Solution {
    public int solution(int[] A) {
        // Sort so we can just count odd sequences of the same number
        Arrays.sort(A);
        
        int num_last_type = 1;
        for (int i = 0; i < A.length - 1; i++){
            // If we are the same as the next one...    
            if (A[i] == A[i + 1]){
                num_last_type++;
            } else {
                // If not, see if we have an odd sequence.
                if (num_last_type % 2 == 1){
                    return A[i];
                }
                // Otherwise, reset
                num_last_type = 1;
            }
        }
        // If we reach this, we made it to the end, so the largest
        // value is the non-pair.
        return A[A.length - 1];
    }
}
