import java.util.Scanner;

public class b2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a:" );
        int a = sc.nextInt();
        System.out.print("Nhập cạnh b:" );
        int b = sc.nextInt();
        System.out.print("Nhập cạnh c:" );
        int c = sc.nextInt();
        if(a + b > c && a + c > b && b + c > a){
            if(a == b && b == c){
                System.out.println("Đây là tam giác vuông.");
            } else if (a == b|| b == c || a == c) {
                System.out.println("Đây là tam giác cân.");
            }else {
                System.out.println("Đây là tam giác thường.");
            }
            double p = ((a + b + c)/ 2);
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Chu vi: " + p * 2);
            System.out.println("Diện tích: " + s );
        }

    }
}
