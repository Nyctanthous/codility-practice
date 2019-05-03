class Solution {
    public int solution(int X, int Y, int D) {
        // Jump to what is approximately the next-to-last jump.
        int jumps = (Y - X) / D;

        // We are either at the right value, or one shy.
        if (X + jumps * D < Y)
            jumps++;

        return jumps;
    }
}