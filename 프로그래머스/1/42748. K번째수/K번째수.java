import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int startNum = commands[i][0] - 1;
            int endNum = commands[i][1];
            int positionNum = commands[i][2] - 1;

            int[] tempArray = Arrays.copyOfRange(array, startNum, endNum);
            Arrays.sort(tempArray);

            answer[i] = tempArray[positionNum];
        }

        return answer;
    }
}
