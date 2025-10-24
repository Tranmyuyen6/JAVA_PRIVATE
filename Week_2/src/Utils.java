import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner(System.in);
    public static void nhapMang(int []a){
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
    }
    public static int tinhTong(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++) {
            sum+=a[i];
        }
        return sum;
    }
    public static void findMaxMin(int []a){
        int maxx=a[0];
        int minn=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>maxx){
                maxx=a[i];
            }
            if(a[i]<minn){
                minn=a[i];
            }
        }
        System.out.println("max: "+maxx);
        System.out.println("min: "+minn);
    }
    public static void sapXep(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        System.out.println("mảng tăng dần: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static void findSoNgto(int[] a) {
        int dem = 0;
        int[] b = new int[a.length];//mang chua toan so ngto
        //tim so nguyen to
        for (int i = 0; i < a.length; i++) {
            boolean value = false;
            if (a[i] < 2) {
                value = true;
                continue;
            }
            for (int j = 2; j <= Math.sqrt(a[i]); j++) {
                if (a[i] % j == 0) {
                    value = true;
                    break;
                }
            }
            if (!value) {
                b[dem] = a[i];
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("không có số ngto");
        } else {
            //tìm só ngto lớn nhất trong mảng số ngto
            int max = b[0];
            for(int i=1;i<dem;i++){
                if(b[i]>max){
                    max = b[i];
                }
            }
            System.out.println("số ngto lớn nhất trong mảng:"+max);
        }


    }

}
