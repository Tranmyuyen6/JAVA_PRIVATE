import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số giây: ");
        int seconds = sc.nextInt();
        int minutes = seconds/60;
        int lastSeconds = seconds%60;
        int hours = minutes/60;
        int lastMinutes = minutes%60;
        System.out.println(hours+" giờ "+lastMinutes+" phút "+lastSeconds+" giây");
    }
}
