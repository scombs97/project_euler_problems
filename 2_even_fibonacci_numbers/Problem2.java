public class Problem2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int sum = 2;
        while (b <= 4000000) {
            int c = a + b;
            if (c % 2 == 0) {
                sum = sum + c;
            }
            a = b;
            b = c;
        }

        System.out.println(sum);
    }
}
