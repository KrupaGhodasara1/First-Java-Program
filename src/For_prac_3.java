import java.util.Scanner;
public class For_prac_3 {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks in physics");
        m1 = sc.nextInt();
        System.out.println("Enter your marks in chemistry");
        m2 = sc.nextInt();
        System.out.println("Enter your marks in maths");
        m3 = sc.nextInt();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("your avrage is : "+avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congartulastion,you are a selected");
        }else {
            System.out.println("sorry,you are not selected");
        }



    }
}
