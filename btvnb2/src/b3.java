import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine().trim();
        boolean isLengthValid = password.length() >= 8;
        boolean hasDigit = false;
        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (hasDigit && hasUppercase) {
                break;
            }
        }
        if (isLengthValid && hasDigit && hasUppercase) {
            System.out.println("Mật khẩu hợp lệ!");
        } else {
            System.out.println(" Mật khẩu không hợp lệ!");

            if (!isLengthValid) {
                System.out.println("- Mật khẩu phải có độ dài tối thiểu 8 ký tự.");
            }
            if (!hasDigit) {
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ số.");
            }
            if (!hasUppercase) {
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa.");
            }
        }
    }
}
