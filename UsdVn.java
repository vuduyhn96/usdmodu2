import java.util.Scanner;

public class UsdVn {
    public static void main(String[] args) {
        double exchangeRate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        double usdAmount = scanner.nextDouble();
        double vndAmount = usdAmount * exchangeRate;
        System.out.println(usdAmount + " USD = " + vndAmount + " VND");
    }
}
