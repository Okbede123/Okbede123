public class DemoDoWhite {
    public static void main(String[] args) {
        DemoDoWhite khoitao = new DemoDoWhite();
        khoitao.Setnumber(1);
    }

    public int Setnumber(int num){
        do{
            num++;
        }while (num < 20);
        System.out.println("num bay h la " +num);
        return num;
    }
}
