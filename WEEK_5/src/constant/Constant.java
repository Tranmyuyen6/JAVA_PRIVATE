package constant;

public class Constant {
    public static class message{
        public static final String EMPTY = "danh sach trong";
        public static final String DANH_SACH_CON_VAT = "danh sach dong vat";
        public static final String DANH_SACH_TREN_10_TUOI = "danh sach con vat tren 10 tuoi";
        public static final String THOAT = "thoat thanh cong";
    }
    public static class enter{
        public static final String NAME = "Nhap ten: ";
        public static final String AGE = "Nhap tuoi: ";
        public static final String CONTINUEE = "ban con muon nhap khong(y/n)?: ";
    }
    public static class error{
        public static final String NAME = "ten khong duoc de trong, nhap lai";
        public static final String AGE = "tuoi khong hop le, nhap lai";
        public static final String CHOOSE = "lua chon khong hop le, nhap lai";
    }

    public static void menu(){
        System.out.println("--menu---");
        System.out.println("1. them dong vat");
        System.out.println("2. hien thi danh sach dong vat");
        System.out.println("3. tim con vat theo  ten");
        System.out.println("4. danh sach con vat tren 10 tuoi");
        System.out.println("5. thoat");
        System.out.println("nhap lua chon cua ban ^_^");
    }
}
