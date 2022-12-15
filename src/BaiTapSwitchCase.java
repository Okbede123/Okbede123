import java.util.Scanner;

public class BaiTapSwitchCase {
    public static void main(String[] args) {
        BaiTapSwitchCase khoitao = new BaiTapSwitchCase();
        khoitao.CheckSo();
    }

    public void CheckSo(){
        Scanner so = new Scanner(System.in);
        System.out.println("hay nhap so");
        int sonhap = so.nextInt();
        switch (sonhap){
            case 0:{
                System.out.println("day la so không");
            }
            case 1:{
                System.out.println("day la so 1");
                break;
            }
            case 2:{
                System.out.println("day la so hai");
            }
            default:{
                System.out.println("chi co tung nay so");
                CheckSo();
                break;
//                Scanner nhaplai = new Scanner(System.in);
//                System.out.println("nhap lai so ");
//                int sonhaplai = nhaplai.nextInt();
            }
        }
    }
}
