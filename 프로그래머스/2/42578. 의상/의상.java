import java.util.*;

class Solution {
 public int solution(String[][] clothes) {
        // 종류별 의상 개수를 저장할 HashMap 생성
        HashMap<String, Integer> clothesMap = new HashMap<>();
        
        // 의상의 종류를 키로, 개수를 값으로 하여 HashMap에 저장
        for (String[] cloth : clothes) {
            String type = cloth[1];
            clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
        }
        
        // 조합의 수 계산
        int combinations = 1;
        for (int count : clothesMap.values()) {
            combinations *= (count + 1); // 해당 종류의 의상을 입지 않는 경우도 고려
        }
        
        // 최소 한 개의 의상을 입어야 하므로, 아무것도 입지 않는 경우 하나를 뺀다
        return combinations - 1;
    }
}