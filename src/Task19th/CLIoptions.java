package Task19th;

public class CLIoptions {
    public static void main(String[] args) {
        String name= args[0];
        int age= Integer.parseInt(args[1]);
        int salary= Integer.parseInt(args[2]);

       System.out.println("Name, age, salary is : " +name +" " +age+ " " +salary);
    }
}
