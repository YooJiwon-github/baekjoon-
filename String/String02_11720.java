package String;

import java.util.Scanner;

public class String02_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = sc.next();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += number.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
