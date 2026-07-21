import java.util.Scanner;

public class b5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên (Mã số - Họ tên - Năm sinh - Phòng ban):");
        String rawData = sc.nextLine();
        rawData = rawData.trim();
        String[] parts = rawData.split("-");
        if (parts.length != 4) {
            System.out.println("Dữ liệu nhập vào không đúng định dạng!");
            return;
        }
        String id = parts[0].trim();
        String rawName = parts[1].trim();
        String birthYearStr = parts[2].trim();
        String department = parts[3].trim();
        String[] words = rawName.split("\\s+");
        StringBuilder normalizedNameBuilder = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                String formattedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                normalizedNameBuilder.append(formattedWord).append(" ");
            }
        }
        String normalizedName = normalizedNameBuilder.toString().trim();
        String deptLower = department.toLowerCase();
        if (deptLower.contains("kỹ thuật") || deptLower.contains("ky thuat")) {
            System.out.println("Phân loại: Nhân viên kỹ thuật");
        } else {
            System.out.println("Phân loại: Nhân viên nghiệp vụ");
        }
        int currentYear = 2026;
        int age = currentYear - Integer.parseInt(birthYearStr);
        System.out.println("Mã nhân viên: " + id + " | Họ và tên: " + normalizedName + " | Tuổi: " + age + " | Bộ phận: " + department);
    }
}
