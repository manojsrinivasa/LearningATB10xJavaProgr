package Functions;

public class WithoutPrameters_ReturnType {

    public static void main(String[] args) {
        main();
        greeta();

        String s = greeta();
        System.out.println(s);
        String q = main();
        System.out.println(q);

    }

    static String main(){
        return "hello";
    }
    static String greeta(){
        return "all";
    }


}
