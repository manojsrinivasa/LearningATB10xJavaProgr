package Task19th;

public class letterGradeProgram {
    public static void main(String[] args) {
        int marks = 91;

        String result = (marks >=90 && marks <= 100) ? " A Grade" :
                        (marks >=80 && marks <= 89) ? " B Grade":
                        (marks >=70 && marks <= 79) ? " C Grade" :
                                (marks >=60 && marks <= 69) ? " D Grade":
                                (marks >=0 && marks <= 59) ? " F Grade" :"Enter Input";

        System.out.println(result);
    }
}
