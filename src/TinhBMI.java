import java.util.Scanner;
import java.lang.Math;

public class TinhBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("THỰC HÀNH TÍNH CHỈ SỐ CÂN NẶNG CỦA CƠ THỂ");
        System.out.println("Nhập vào chiều cao [m]: ");
        float height = scanner.nextFloat();
        System.out.println("Nhập vào cân nặng [kg]: ");
        float weight = scanner.nextFloat();

        String type;
        double bmi = weight / Math.pow(height,2);
        if (bmi < 18){
            type = "Thiếu cân";
        }else if (bmi <25){
            type = "Bình thường";
        }else if (bmi <30){
            type = "Thừa cân";
        }else {
            type = "Béo phì";
        }
        System.out.println("Chỉ só BMI của cơ thể là: " + bmi + " " + type);

    }
}
