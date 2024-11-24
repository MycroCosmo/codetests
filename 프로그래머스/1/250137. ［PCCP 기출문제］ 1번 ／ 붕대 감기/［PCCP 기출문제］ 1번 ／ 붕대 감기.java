import java.util.*;
public class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0]; // 기술 시전 시간
        int x = bandage[1]; // 초당 회복량
        int y = bandage[2]; // 추가 회복량

        int currentHealth = health; // 현재 체력
        int successTime = 0; // 연속 성공 시간
        int maxHealth = health; // 최대 체력
        int currentTime = 0; // 현재 시간

        // 공격 정보를 Map으로 변환하여 시간별 공격 관리
        Map<Integer, Integer> attackInfo = new HashMap<>();
        for (int[] attack : attacks) {
            attackInfo.put(attack[0], attack[1]);
        }

        // 현재 시간부터 마지막 공격 시간까지 시뮬레이션
        for (currentTime = 1; currentTime <= attacks[attacks.length - 1][0]; currentTime++) {
            if (attackInfo.containsKey(currentTime)) {
                // 공격 발생 시 체력 감소
                currentHealth -= attackInfo.get(currentTime);
                successTime = 0; // 연속 성공 초기화

                if (currentHealth <= 0) {
                    return -1; // 체력이 0 이하이면 즉시 종료
                }
            } else {
                // 공격이 없을 때 초당 회복량 적용
                currentHealth = Math.min(maxHealth, currentHealth + x);
                successTime++;

                if (successTime == t) {
                    // 연속 성공 시 추가 회복량 적용
                    currentHealth = Math.min(maxHealth, currentHealth + y);
                    successTime = 0; // 연속 성공 초기화
                }
            }
        }

        return currentHealth;
    }
}
