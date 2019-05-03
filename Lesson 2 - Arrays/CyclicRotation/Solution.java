import java.lang.*;

class Solution {
    public int[] solution(int[] A, int K) {
        // Handle non-rotatable array case
        if (A.length <= 1)
            return A;
        
        // Handle K > array length
        // Division is present when for an int c, K >= c * A.length.
        if (K > A.length)
            K -= (K / A.length) * A.length;
            
        
        int[] rotated = new int[A.length];
        
        // "rotate" the last k elements to the front.
        // Don't actually rotate, because that's too slow.
        System.arraycopy(A, A.length - K, rotated, 0, K);
        
        // Copy over the rest, shifted forward by K.
        System.arraycopy(A, 0, rotated, K, A.length - K);
        return rotated;
    }
}

