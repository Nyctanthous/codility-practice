import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        Set<Integer> leaves = new HashSet<>();

        for (int i = 0; i < A.length; i++){
            leaves.add(A[i]);
            
            // In the event that we have enough leaves,
            // report how long we had to wait.
            if (leaves.size() == X)
                return i;
        }
        return -1;
    }
}
