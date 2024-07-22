public class Main {
    public static void main(String[] args) {
        // Task 1
        for (int x = 0; x <= 10; x++) {
            System.out.print(x + " ");
        }

        //Task 2
        System.out.println("");
        for (int x = 10; x >= 0; x--) {
            System.out.print(x + " ");
        }

        //Task 3 Как показано в уроке
        System.out.println("");
        for (int x = 0; x <= 17; x = x + 2) {
            System.out.print(x + " ");
        }
        //Task 3 Как бы сделал я
        System.out.println("");
        for (int x = 0; x <= 17; x++) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }

        //Task 4
        System.out.println("");
        for (int x = 10; x >= -10; x--) {
            System.out.print(x + " ");
        }

        //Task 5
        System.out.println("");
        for (int x = 1904; x <= 2096; x = x + 4) {
            System.out.print(x + " ");
        }

        //Task 6
        System.out.println("");
        for (int x = 7; x <= 98; x++) {
            if (x % 7 == 0) {
                System.out.print(x + " ");
            }
        }

        //Task 7
        System.out.println("");
        for (int x = 1; x < 512;) {
            x = x * 2;
            System.out.print(x + " ");
        }

        //Task 8
        System.out.println("");
        int salary = 29000;
        int total = 0;
        for (int x = 1; x <= 12; x++) {
            total = total + salary;
            System.out.print(x + ")" + total + " ");
        }

        //Task 9
        System.out.println("");
        total = 0;
        float percent = 1.01f;
        for (int x = 1; x <= 12; x++) {
            total = (int) ((total + salary) * percent);
            System.out.print(x + ")" + total + " ");
        }

        //Task 10
        System.out.println("");
        int sum;
        for (int x = 1; x <= 10; x++) {
            sum = 2 * x;
            System.out.println("2 * " + x + " = " + sum + " ");
        }
    }
}
