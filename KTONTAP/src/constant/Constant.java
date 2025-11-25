package constant;

public class Constant {
    public static void menu(){
        System.out.println("---menu---");
        System.out.println("1. In ra danh sách tất cả các nhân viên");
        System.out.println("2. In ra thông tin nhiên viên theo ID");
        System.out.println("3. Lọc ra danh sách nhân viên theo Tên ");
        System.out.println("4. Thoát");
        System.out.println("nhập lựa chọn của bạn ^_^");
    }
    public static class enter{
        public static final String ID = "nhap id:";
        public static final String NAME = "nhap ten:";
        public static final String AGE = "nhap tuoi:";
        public static final String BASICSALARY = "nhap luong co ban:";
        public static final String OVERTIMEHOURS = "nhap thoi gian lam them:";
        public static final String BUGDELETEEDCOUNT = "nhap so bug sua:";
    }
    public static class message{
        public static final String EXIT = "thoat thanh cong";

    }
    public static class error{
        public static final String CHOOSE = "lua chon khong hop le nhap lai";
        public static final String EMPTY = "danh sach trong";

    }
}
