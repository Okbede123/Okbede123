import java.util.Scanner;

public class BaiTapPhepNhan {
    public static void main(String[] args) {

        BaiTapPhepNhan so1 = new BaiTapPhepNhan();
        so1.KetQua();
        //test
    }

    public void KetQua(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 so");
        int songuyen = sc.nextInt();
        for (int i = 1; i <= 20 ; i++) {
            System.out.println("ket qua " + songuyen + "x" + i + "=" + songuyen*i );
        }
    }
}
