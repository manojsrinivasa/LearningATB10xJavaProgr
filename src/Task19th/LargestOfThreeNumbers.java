package Task19th;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a =30;
        int b= 10;
        int c= 20;

        String result = (a>b) ? (a>c) ? "a is largert" : "a is not largest" : (b>c) ? "b is largest": "c is largest";
        System.out.println(result);
    }
}
