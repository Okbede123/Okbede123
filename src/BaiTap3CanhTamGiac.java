import java.util.Scanner;

public class BaiTap3CanhTamGiac {
    public static void main(String[] args) {
        BaiTap3CanhTamGiac khoitao = new BaiTap3CanhTamGiac();
        khoitao.BaCanhTamGiac();

    }
    public void BaCanhTamGiac(){
        Scanner cA = new Scanner(System.in);
        System.out.println("nhap canh A");
        //test
        //test
        int canhA = cA.nextInt();
        Scanner cB = new Scanner(System.in);
        System.out.println("nhap canh B");
        int canhB = cB.nextInt();
        Scanner cC = new Scanner(System.in);
        System.out.println("nhap canh C");
        int canhC = cC.nextInt();
        if(canhA+canhB > canhC|| canhA+canhC > canhB || canhC + canhB > canhA){
            System.out.println("day la 3 canh cua 1 tam giac");
        }else{
            System.out.println("khong phai");
        }
    }
}
