package Task19th;

public class TernaryOperator {

    public static void main(String[] args) {
    int age = 70;
    String result = (age <18) ? "Minor" : (age<65) ? "adult" : "Senior";
        System.out.println(result);

    }
}
