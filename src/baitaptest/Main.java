package baitaptest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main nhapso = new Main();
        nhapso.GetNumber();

    }

    public void GetNumber(){
        Scanner so = new Scanner(System.in);
        System.out.println("nhap so ");

        int sonhap = so.nextInt();
        if (sonhap >= 0){
            System.out.println("day la so chan " + sonhap);
        }
        else{
            System.out.println("day la so le" + sonhap);
        }

    }
}