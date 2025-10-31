package basic;
import java.util.*;
public class happy_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = num;
        while (result != 1 && result != 4) {
            int sum = 0;
            while (result > 0) {
                int digit = result % 10;
                sum += digit * digit;
                result /= 10;
            }
            result = sum;
        }
        if (result == 1)
            System.out.println(num + " is a Happy Number.");
        else
            System.out.println(num + " is not a Happy Number.");
    }
}
