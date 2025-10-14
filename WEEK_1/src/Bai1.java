import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số t1: ");
        int soThuNhat = sc.nextInt();
        System.out.println("nhập số t2: ");
        int soThuHai = sc.nextInt();
        System.out.println("tổng: "+(soThuNhat+soThuHai));
        System.out.println("hiệu: "+(soThuNhat-soThuHai));
        System.out.println("tích: "+(soThuNhat*soThuHai));
        System.out.println("thương: "+(soThuNhat/soThuHai));
        System.out.println("phần dư: "+(soThuNhat%soThuHai));
    }
}
