class Solution {
    public int solution(int a, int b) {
        int concatenated = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int product = 2 * a * b;

        return Math.max(concatenated, product) == concatenated ? concatenated : product;
    }
}
