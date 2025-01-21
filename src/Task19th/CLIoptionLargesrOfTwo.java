package Task19th;

public class CLIoptionLargesrOfTwo {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        String result = (a > b) ? "a is largest" : "b is largest";
        System.out.println(result);

    }
}
