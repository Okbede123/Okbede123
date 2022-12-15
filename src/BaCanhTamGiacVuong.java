import java.util.Scanner;

public class BaCanhTamGiacVuong {
    public static void main(String[] args) {
        BaCanhTamGiacVuong khoitao = new BaCanhTamGiacVuong();
        khoitao.TinhBaCanh();

    }
    public void TinhBaCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh 1");
        int canhA = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("nhap canh 2");
        int canhB = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("nhap canh 3");
        int canhC = sc2.nextInt();
        if(canhC*canhC == canhA*canhA + canhB*canhB || canhA*canhA == canhC*canhC + canhB*canhB || canhB*canhB == canhA*canhA + canhC*canhC ){
            System.out.println("day la tam giac vuong");
        }
        else{
            System.out.println("day khong phai tam giac vuong");
        }

    }
}
