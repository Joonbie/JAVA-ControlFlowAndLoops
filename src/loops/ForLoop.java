package loops;

public class ForLoop {

    public static void main(String[] args) {

        // Create a simple count up to 1 to 10
        int countUp = 10;
        int countDown = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            if (i == 10)
                System.out.println("Happy May Day");
        }

        // Create a simple count down from 10 to 1 before displaying "Happy Labour Day"

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);

            if (i == 1)
                System.out.println("Happy Labour Day");
        }
        
    }
}

