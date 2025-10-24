import java.util.Scanner;

public class Main {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhập số lượng ptu:");
        int n = sc.nextInt();
        int []a = new int[n];
        Utils.nhapMang(a);

        System.out.println("---menu---");
        System.out.println("1. Tính tổng các phẩn tử trong mảng");
        System.out.println("2. In ra phần tử lớn nhất, nhỏ nhất trong mảng");
        System.out.println("3. Sắp xếp lại mảng theo chiều tăng dần");
        System.out.println("4. In ra số nguyên tố lớn nhất trong mảng (nếu không có in ra :Không có)");
        System.out.println("Nhập lựa chọn:");

        int total = sc.nextInt();
        if(total<1 || total>4){
            System.out.println("lựa chọn không hợp lệ, nhập lại");
        }
        else{
            switch (total){
                case 1:
                    System.out.println(Utils.tinhTong(a));
                    break;
                case 2:
                    Utils.findMaxMin(a);
                    break;
                case 3:
                    Utils.sapXep(a);
                    break;
                case 4:
                    Utils.findSoNgto(a);
                    break;
            }
        }
    }
}