import java.util.Scanner;

public class ThucHanh04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Bài 1a:
        System.out.println("Bài 1a: ");
        int num1a;
        do {
            System.out.print("Nhập số nguyên dương number 1a: ");
            num1a = scanner.nextInt();
        }
        while (num1a <= 0);
        if (isSymmetryNumber(num1a)){
            System.out.format("%d là số đối xứng! \n", num1a);
        }
        else{
            System.out.format("%d KHÔNG PHẢI số đối xứng! \n", num1a);
        }
//////        Bài 1b:
        System.out.println("Bài 1b: ");
        int num1b;
        do {
            System.out.print("Nhập số nguyên dương number 1b: ");
            num1b = scanner.nextInt();
        }
        while (num1b <= 0);
            if (isSquareNum(num1b)) {
                System.out.format("%d là số chính phương \n", num1b);
            } else {
                System.out.format("%d KHÔNG PHẢI số chính phương \n", num1b);
            }
//

//        Bài 2d:
        System.out.println("Bài 2d: ");
        int num2d;
        do {
            System.out.print("Nhập số nguyên dương number 2d: ");
            num2d = scanner.nextInt();
        }
        while (num2d <= 0);
        long s2d = tinhGiaithua(num2d);
        System.out.format("Giai thừa: %d \n", s2d);

//        Bài 2e:
        System.out.println("Bài 2e: ");
        int num2e;
        do {
            System.out.print("Nhập số nguyên dương number 2d: ");
            num2e = scanner.nextInt();
        }
        while (num2e < 0);
        long sum2e = sumGiaithua(num2e);
        System.out.format("Tổng Giai thừa: %d \n", sum2e);

//        Bài 4:
        System.out.println("Bài 4: ");
        int num3;
        do {
            System.out.print("Nhập số dương number 3 (0 < n < 50): ");
            num3 = scanner.nextInt();
        }
        while (num3 <= 0 || num3 >= 50);
        int sum3 = sumPrimeNumber(num3);
        System.out.format("Tổng sô nguyên tố: %d \n", sum3);

//        Bài 5:
        int num5;
        System.out.println("Bài 5: ");
        do {
            System.out.print("Nhập số dương number 5: ");
            num5 = scanner.nextInt();
        }
        while (num5 < 0);
        int reversedNumber = reverseNumber(num5);
        System.out.format("Số đảo ngược của số %d là: %d",num5,reversedNumber);
    }

    public static boolean isSymmetryNumber(int num1a) {
        int reversed = 0;
        int original = num1a;
        while (num1a != 0) {
            int temp = num1a % 10;
            reversed = reversed * 10 + temp;
            num1a = num1a / 10;
        }
        System.out.format("Số sau khi đảo ngược: %d\n", reversed);
        boolean checka1 = false;
        if (reversed == original) {
            checka1 = true;
        }
        return checka1;
    }

    public static boolean isSquareNum(int num1b) {
        boolean check1b = false;
        double result = Math.sqrt(num1b);
        if (result == Math.floor(result)) {
            check1b = true;
        } else {
            check1b = false;
        }
        return check1b;
    }

    public static long tinhGiaithua(int num2d) {
        long s2d = 1;
        if (num2d == 0 || num2d == 1) {
            return s2d;
        } else {
            for (int i = 2; i <= num2d; i++) {
                s2d = s2d * i;
            }
        }
        return s2d;
    }

    public static long sumGiaithua(int num2e) {
        long sum2e = 1;
        long s2e = 1;
        if (num2e == 0 || num2e == 1) {
            return sum2e;
        } else {
            for (int i = 2; i <= num2e; i++) {
                s2e = s2e * i;
                sum2e = sum2e + s2e;
            }
        }
        return sum2e;
    }


    public static boolean isPrimeNumber(int num3) {
        boolean result = true;
        if (num3 <= 1) {
            result = false;
        } else {
            for (int i = 2; i < num3; i++) {
                if (num3 % i == 0) {
                    result = false;
                }
            }
        }
        return result;
    }

    public static int sumPrimeNumber(int num3) {
        int sum3 = 0;
        for (int i = 2; i < num3; i++) {
            if (isPrimeNumber(i)) {
                sum3 = sum3 + i;
            }
        }
        return sum3;
    }

    public static int reverseNumber(int num5) {
        int reversed = 0;
        int original = num5;
        while (num5 != 0) {
            int temp = num5 % 10;
            reversed = reversed * 10 + temp;
            num5 = num5 / 10;
        }
        return reversed;
    }
}


