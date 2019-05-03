import java.util.*;

class Solution {
    public int[] solution(int N, int[] A) {
        // Initialize
        int [] counters = new int[N];
        int max_val = 0;
        
        // Itearate over all commands.
        for(int command : A){
            // Handle incr test
            if (command <= N) {
                counters[command - 1]++;
                if (counters[command - 1] > max_val)
                    max_val = counters[command - 1];
            } else {
                // Set everything to be the max value.
                int len = counters.length;
                counters[0] = max_val;
                for (int i = 1; i < len; i += i)
                    System.arraycopy(counters, 0, counters, i, ((len - i) < i) ? (len - i) : i);
            }
        }
        return counters;
    }
}