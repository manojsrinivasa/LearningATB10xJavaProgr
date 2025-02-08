package Functions;

public class WithPrameters_WithReturnType {
    public static void main(String[] args) {

        int sum = main(20, 30);
        System.out.println(sum);
        String concat = greet("Manoj ", "Ks");
        System.out.println(concat);

    }

        static int main(int a , int b){
        return a + b;
        }

        static String greet(String a, String b){
        return (a + b);
        }
}
