import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();
        
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }
        
        for (char c : s.toCharArray()) {
            int count = 0;
            char current = c;
            
            while (count < index) {
                current++;
                if (current > 'z') {
                    current = 'a';
                }
                if (!skipSet.contains(current)) {
                    count++;
                }
            }
            
            answer.append(current);
        }
        
        return answer.toString();
    }
}
