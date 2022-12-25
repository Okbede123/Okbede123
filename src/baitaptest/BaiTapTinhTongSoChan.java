package baitaptest;

import java.util.Scanner;

public class BaiTapTinhTongSoChan {
    public static void main(String[] args) {
        BaiTapTinhTongSoChan khoitao = new BaiTapTinhTongSoChan();
        khoitao.TinhTong();
    }

    public void TinhTong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 so ");
        int sum = 0;
        int so = sc.nextInt();
        for (int i = 0; i <= so; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("tong cac so chan cua so vua nhap vao la " + sum);
    }
}
