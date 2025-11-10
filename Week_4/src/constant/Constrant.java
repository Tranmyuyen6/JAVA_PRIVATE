package constant;

public class Constrant {
    public static class enter{
        public static final String ENTER_ID = "nhap id: ";
        public static final String ENTER_NAME = "nhap ten: ";
        public static final String ENTER_DESCRIPTION = "nhap mo ta: ";
        public static final String ENTER_PRICE = "nhap gia tien(don vi:trieu): ";
        public static final String ENTER_TYPE = "nhap the loai: ";
        public static final String ENTER_CPU = "nhap cpu: ";
        public static final String ENTER_RAM = "nhap ram: ";
        public static final String ENTER_HAS5G = "nhap 5G(y/n): ";
    }

    public static class error{
        public static final String ERROR_EMPTY = "danh sach trong";
        public static final String ERROR_TYPE = "nhap sai the loai, nhap lai";
        public static final String ERROR_DATA = "du lieu khong ton tai";
    }

    public static class success{
        public static final String SUCCESS_RM = "xoa san pham thanh cong";
        public static final String SUCCESS_ADD = "them san pham thanh cong";
        public static final String SUCCESS_DATA = "da tim thay du lieu";
    }

    public static class hienThi{
        public static final String DANHSACH = "danh sach hien thi";
    }

    public static void menu(){
        System.out.println("---menu---");
        System.out.println("1. them san pham moi");
        System.out.println("2. xoa san pham");
        System.out.println("3. in thong tin san pham");
        System.out.println("4. danh sach san pham");
        System.out.println("5. thoat");
        System.out.println("nhap lua chon cua ban");
    }
    public void inFoProduct(){

    }

}
