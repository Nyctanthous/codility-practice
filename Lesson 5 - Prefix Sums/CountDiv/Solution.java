class Solution {
    public int solution(int A, int B, int K) {
        // Simple math identity time! Given a range [A, B]
        // and a divisor D, we expect there are no less than
        // floor(B / D) - floor(A / D) values in that range.
        // We undercount by one when A is evenly divisible by D.
        return B / K - A / K + ((A % K == 0) ? 1 : 0);
    }
}