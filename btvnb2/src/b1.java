import java.util.Scanner;
import java.text.DecimalFormat;

public class b1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x1: ");
        int x1 = sc.nextInt();
        System.out.print("Nhập y1: ");
        int y1 = sc.nextInt();
        System.out.print("Nhập x2: ");
        int x2 = sc.nextInt();
        System.out.print("Nhập y2: ");
        int y2 = sc.nextInt();
        double d =  Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        DecimalFormat df = new DecimalFormat("#.##");
        String result = df.format(d);
        System.out.println("Khoảng cách giữa hai điểm A và B là: " + result);
    }
}


