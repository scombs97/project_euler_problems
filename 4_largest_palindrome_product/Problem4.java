public class Problem4 {
    public static void main(String[] args) {
        int largest = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 0; j <= 999; j++) {
                int product = i * j;
                String productStr = String.valueOf(product);
                if (isPalidrome(productStr) && product > largest) {
                    largest = product;
                }
            }
        }

        System.out.println(largest);
    }

    public static boolean isPalidrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
