package constant;

public class Constant {
    public static void menu(){
        System.out.println("---menu---");
        System.out.println("1. Thêm sách");
        System.out.println("2. Lấy sách theo ID");
        System.out.println("3. Lấy tất cả sách theo thể loại (TextBook/Novel)");
        System.out.println("4. Lấy tất cả sách");
        System.out.println("5. Xóa sách theo ID");
        System.out.println("6. Tổng giá trị thư viện ");
        System.out.println("7. Thoát");
        System.out.println("nhập lựa chọn của bạn ^_^");
    }
    public static class enter{
        public static final String ID = "nhap id:";
        public static final String TITLE = "nhap ten tac pham:";
        public static final String AUTHOR = "nhap ten tac gia:";
        public static final String PRICE = "nhap gia tien:";
        public static final String QUANTITY = "nhap so luong:";
        public static final String SUBJECT = "nhap chu de:";
        public static final String GENRE = "nhap the loai:";
        public static final String TYPE = "nhap loai sach:";
    }
    public static class error{
        public static final String CHOOSE = "lua chon khong hop le, nhap lai";
        public static final String NOT_FIND_ID = "khong tim thay id";
    }
    public static class message{
        public static final String EMPTY = "danh sach trong:";
        public static final String EXIT = "thoat thanh cong";
        public static final String REMOVE = "xoa thanh cong:";
        public static final String ADD = "them thanh cong:";
    }
}
