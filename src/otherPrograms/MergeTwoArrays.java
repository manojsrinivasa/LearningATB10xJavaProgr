package otherPrograms;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int a[] = {10, 20, 30};
        int b[] = {30, 40, 50, 60, 70};
        int c_leng = a.length + b.length;
        int c[] = new int[c_leng];

        for (int i=0; i<a.length; i++){
            c[i] = a[i];
        }

        for (int i=0; i<b.length; i++){
            c[a.length+i] = b[i];
        }

        for(int i=0; i<c_leng; i++){
            System.out.println(c[i]);
        }





    }

}
