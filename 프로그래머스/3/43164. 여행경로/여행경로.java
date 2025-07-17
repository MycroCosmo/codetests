import java.util.*;

class Solution {
    List<String> answer = new ArrayList<>();
    boolean[] used;

    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, (a, b) -> {
            if (a[0].equals(b[0])) {
                return a[1].compareTo(b[1]);
            } else {
                return a[0].compareTo(b[0]);
            }
        });

        used = new boolean[tickets.length];
        List<String> path = new ArrayList<>();
        path.add("ICN");

        dfs("ICN", path, tickets);

        return answer.toArray(new String[0]);
    }

    public boolean dfs(String current, List<String> path, String[][] tickets) {
        if (path.size() == tickets.length + 1) {
            answer = new ArrayList<>(path); // 경로 완성
            return true; // 종료 조건
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!used[i] && tickets[i][0].equals(current)) {
                used[i] = true;
                path.add(tickets[i][1]);

                if (dfs(tickets[i][1], path, tickets)) {
                    return true; // 사전순 첫 경로를 찾으면 바로 종료
                }

                path.remove(path.size() - 1);
                used[i] = false;
            }
        }

        return false;
    }
}
