public class Problem6 {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfSquares = sumOfSquares + (i * i);
            sum = sum + i;
        }

        System.out.println((sum * sum) - sumOfSquares);
    }
}
