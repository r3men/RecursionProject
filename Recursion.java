public class Recursion {
    public static void main(String[] args) {
        System.out.println("Function 1 Result: " + f1(8, 12));
        System.out.println("Function 2 Result: " + f2(f2(f2(f2(f2(10))))));
        System.out.println("Function 3 Result: " + f3(30, 12));
        System.out.println("Function 4 Result: " + f4(32));
        System.out.println("Function 5 Result: " + f5(5));
        System.out.println("Function 6 Result: " + f6(35, 8));
        int totalSum = 0;
        // Use a for loop to continuously add the result of calling the function as the argument increases by 1
        for (int i = 1; i <= 10; i++) {
            totalSum += f7(i);
        }
        System.out.println("Function 7 Result: " + totalSum);
        System.out.println("Function 8 Result: " + f8(f8(f8(f8(18)))));
    }

    public static int f1(int x, int y) {
        if (x < y) {
            return f1(x + 1, y - 2) + 3;
        }
        else if (x == y) {
            // Cast result of Math.pow function to integer since it returns a double
            return (int) (Math.pow(x, 2) + Math.pow(y, 2)); 
        }
        else {
            return f1(y - 1, x) - 1;
        }
    }

    public static int f2(int x) {
        if (x > 7) {
            return f2(x - 5) - 3;
        }
        else if (x > 3 && x <= 7) {
            return f2(x + 2) + 2;
        }
        else {
            return x + 5;
        }
    }

    public static int f3(int x, int y) {
        if (x > y) {
            // Use Math.max to compare the results of calling both functions
            return Math.max(f3(x - 4, y + 3), f3(y, x));
        }
        else {
            return x * y;
        }
    }

    public static int f4(int x) {
        if (x % 2 == 0) {
            return f4(x / 2 - 1) + 3;
        }
        else if (x % 2 != 0 && x > 0) {
            return 2 * f4(x - 3) - 5;
        }
        else {
            return (int) (Math.pow(x, 2)) - 3;
        }
    }

    public static int f5(int n) {
        if (n == 1) {
            return 8;
        }
        else {
            return 2 * f5(n - 1) - 4;
        }
    }

    public static int f6(int x, int y) {
        if (x >= y) {
            return f6(x - y, y + 2) + y;
        }
        else {
            return (int) Math.pow(x, 2) - y;
        }
    }

    public static int f7(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return f7(n - 1) + 5;
        }
    }

    public static int f8(int x) {
        if (x >= 10) {
            return f8(x - 5) - 2;
        }
        else if (x >= 7 && x < 10) {
            return f8(x + 4) + 6;
        }
        else {
            return x - 4;
        }
    }

}

/* Program Output
Function 1 Result: 136
Function 2 Result: 7
Function 3 Result: 396
Function 4 Result: 10
Function 5 Result: 68
Function 6 Result: 41
Function 7 Result: 235
Function 8 Result: -6
*/