public class Problem5 {
    public static void main(String[] args) {
        int answer = 0;
        int i = 1;

        boolean running = true;
        while (running) {
           for (int j = 2; j <= 20; j++) {
               if (!(i % j == 0)) {
                    i++;
                    break;                
               } else if (j == 20 && i % j == 0) {
                   answer = i;
                   running = false;
               }
           }
        }

        System.out.println(answer);
    }
}
