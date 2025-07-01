import java.util.*;

public class Main {
    static final int MAX = 100001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수빈 위치
        int K = sc.nextInt(); // 동생 위치

        System.out.println(bfs(N, K));
    }

    public static int bfs(int start, int target) {
        boolean[] visited = new boolean[MAX];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start, 0));
        visited[start] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.position == target) {
                return current.time; // 동생 찾음
            }

            int[] nextPositions = {
                current.position - 1,
                current.position + 1,
                current.position * 2
            };

            for (int next : nextPositions) {
                if (next >= 0 && next < MAX && !visited[next]) {
                    visited[next] = true;
                    queue.add(new Node(next, current.time + 1));
                }
            }
        }

        return -1; // 절대 도달하지 못하는 경우는 없음
    }

    static class Node {
        int position;
        int time;

        public Node(int position, int time) {
            this.position = position;
            this.time = time;
        }
    }
}