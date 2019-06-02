import java.util.*;

class Solution {
    public int solution(int[] A) {
        // The solution is clearly trivial with a Set.
        // Algorithm complexity is an order better, too.
        Set<Integer> elements = new HashSet<>();
        
        for (int element : A)
            elements.add(element);
        
        return elements.size();
    }
}

