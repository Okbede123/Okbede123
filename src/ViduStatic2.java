public class ViduStatic2 {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";

    String nonstatic = "this is nonstatic";

    public void changetest(){
        college = "truong tieu hoc";
        nonstatic = "nonstatic";
    }

    public void changetest2(){
        college = "truong tieu hoc 1";
    }

    public void changetest3(){
        college = "truong tieu hoc 2";
    }

    public void changetest4(){
        college = "truong tieu hoc 4";
    }

    static void change() {
        // Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)
        college = "Đại Học Công Nghệ";

    }

    ViduStatic2(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }

    public static void main(String args[]) {
        //ViduStatic2.change();

        ViduStatic2 s1 = new ViduStatic2(111, "Thông");
        s1.changetest();
        ViduStatic2 s2 = new ViduStatic2(222, "Minh");
        //s2.changetest2();
        ViduStatic2 s3 = new ViduStatic2(333, "Anh");
        //s3.changetest4();

        s1.display();
        s2.display();
        s3.display();
    }
}