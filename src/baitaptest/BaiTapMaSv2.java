package baitaptest;

import java.util.Scanner;

public class BaiTapMaSv2 {
    public static void main(String[] args) {

        BaiTapMaSv2 khoitao = new BaiTapMaSv2();

        System.out.println(khoitao.KetQuaMsv());

    }

    public boolean KetQuaMsv(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap msv");
        String msv = sc.nextLine();
        if(msv.length() == 0){
            return false;
        }
        if(msv.startsWith("B170") || msv.startsWith("b170") ){
            try {
                int number = Integer.parseInt(msv.substring(4));
                if(number >= 0){
                    if(msv.length() == 8){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else {
                    return false;
                }


            }
            catch (Exception exception){
                return false;
            }

        }
        else{
            return false;
        }

    }
}
