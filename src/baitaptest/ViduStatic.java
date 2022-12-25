package baitaptest;

public class ViduStatic {
    static int  count = 0; // sẽ lấy bộ nhớ khi instance được tạo ra

    ViduStatic() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {

        ViduStatic c1 = new ViduStatic();
        ViduStatic c2 = new ViduStatic();
        ViduStatic c3 = new ViduStatic();

    }
}