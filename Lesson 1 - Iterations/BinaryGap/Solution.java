class Solution {
    public int solution(int N) {
        // Iterate from the LSB to MSB
        int overall_longest = 0;
        int current_len = 0;

        while (N != 0){
            // Starting a gap
            if ((N & 0x1) == 1 && ((N >> 1) & 0x1) == 0){
                // Skip that 1 we just read
                N >>= 1;

                // Iterate over zeroes until we hit a 1.
                while ((N & 0x1) == 0 && N != 0){
                    current_len++;
                    N >>= 1;
                }
                
                // Compare with our longest
                if (current_len > overall_longest){
                    overall_longest = current_len;   
                }
                // In all cases, reset
                current_len = 0;
            } else {
                // Iterate forward, look for a starting case.
                N >>= 1;   
            }
        }
        return overall_longest;
    }
}