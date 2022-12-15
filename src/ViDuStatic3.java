public class ViDuStatic3 {
    String name;
    static int soconbo = 0;

    ViDuStatic3(String thename){
        name = thename;
        soconbo++;
        System.out.println("so con bo la "+ soconbo);
    }

    public static void main(String[] args) {
        ViDuStatic3 c1 = new ViDuStatic3("bo 1");
        ViDuStatic3 c2 = new ViDuStatic3("bo 2");
        ViDuStatic3 c3 = new ViDuStatic3("bo 3");
    }
}
