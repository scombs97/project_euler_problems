public class Problem7 {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        while (count < 10001 ) {
            if (isPrime(i)) {
                count++;
            }
            i++;
        }

        System.out.println(i - 1);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
