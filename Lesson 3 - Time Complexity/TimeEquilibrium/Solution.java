import java.util.*;

class Solution {
    
    // Sum array elements from "from", incusive, to "to", non-inclusive.
    private int sum_arr(int[] arr, int from, int to){
        int total = 0;
        for (; from < to; from++){
            total += arr[from];
        }
        return total;
    }

    public int solution(int[] A) {
        // Edge case for too few elements
        if (A.length == 0)
            return 0;
        if (A.length == 1)
            return Math.abs(A[0]);

        // Fencepost and declare our vars.
        int l_sum = A[0];
        int r_sum = sum_arr(A, 1, A.length);
        int best_net_sum = Math.abs(l_sum - r_sum);
        
        // Calculate for 0 < P < N
        for (int P = 2; P < A.length; P++){
            l_sum += A[P - 1];
            r_sum -= A[P - 1];
            int net = Math.abs(l_sum - r_sum);

            if (net < best_net_sum)
                best_net_sum = net;
        }
        return best_net_sum;
    }
}

