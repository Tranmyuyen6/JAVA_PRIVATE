public class Array {
    public static int tinhTong(int []a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static int tinhTich(int []a){
        int tich = 1;
        for(int i=1;i<10;i++){
            tich*=a[i];
        }
        return tich;
    }
    public static void soNgTo(int[]a){
        for(int i=0;i<a.length;i++){
            boolean value = false;
            if(a[i]<2){
                value = true;
                continue;
            }
            for(int j=2;j<=Math.sqrt(a[i]);j++){
                if(a[i]%j==0){
                    value = true;
                    break;
                }
            }
            if(!value){
                System.out.print(a[i]+" ");
            }
        }

    }

    public static void main(String[] args) {
        int []a = new int[100];
        for(int i=0;i<a.length;i++){
            a[i] = i;
        }
        System.out.println("tong:"+tinhTong(a));
        System.out.println("tich:"+tinhTich(a));
        soNgTo(a);
    }

}
