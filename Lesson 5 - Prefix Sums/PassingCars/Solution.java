class Solution {
    public int solution(int[] A) {
        // Not actually a prefix sum solution. It's actually faster to use
        // variable-based dynamic programming.
        int total = 0;
        int num_west = 0;
        for (int i = A.length - 1; i >= 0; i--){
            if (total > 1000000000)
                return -1;
            if (A[i] == 1)
                num_west++;
            else
                total += num_west;
        }
        return total;
    }
}