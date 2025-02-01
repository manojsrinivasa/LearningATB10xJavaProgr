package Task26th;

public class PalidromeOfString {
    public static void main(String[] args) {

        String name = "madam";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);

        }
        if (reverse.equalsIgnoreCase(name)){
            System.out.println("its Palidrome");
        } else {
            System.out.println("Its not Palindrome");
        }
    }
}