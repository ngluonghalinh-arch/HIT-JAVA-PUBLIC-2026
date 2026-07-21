import java.util.Scanner;

public class b4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.print("Nhập số lượng học sinh: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Số lượng học sinh phải lớn hơn 0. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
                sc.next();
            }
        }
        double[] grades = new double[n];
        for (int i = 0; i < n; i++) {
            double grade = -1.0;
            while (grade < 0.0 || grade > 10.0) {
                System.out.print("Nhập điểm cho học sinh thứ " + (i + 1) + " : ");
                if (sc.hasNextDouble()) {
                    grade = sc.nextDouble();
                    if (grade < 0.0 || grade > 10.0) {
                        System.out.println("Điểm không hợp lệ. Vui lòng nhập trong khoảng từ 0.0 đến 10.0.");
                    } else {
                        grades[i] = grade;
                    }
                } else {
                    System.out.println("Vui lòng nhập một số thực hợp lệ.");
                    sc.next();
                }
            }
        }
        double maxGrade = findMax(grades);
        double averageGrade = calculateAverage(grades);
        int failedCount = countFailedStudents(grades);
        System.out.println("Điểm cao nhất trong lớp: " + maxGrade);
        System.out.printf("Điểm trung bình của lớp: %.2f\n", averageGrade);
        System.out.println("Số học sinh dưới trung bình (< 5.0): " + failedCount);

        sc.close();
    }
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Hàm tính điểm trung bình
    public static double calculateAverage(double[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int countFailedStudents(double[] arr) {
        int count = 0;
        for (double grade : arr) {
            if (grade < 5.0) {
                count++;
            }
        }
        return count;
    }
}
