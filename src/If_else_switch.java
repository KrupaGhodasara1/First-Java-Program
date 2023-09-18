import java.util.Scanner;

public class If_else_switch {
    public static void main(String[] args) {
        int age;
        System.out.println("getting from user");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        /*if (age < 18) { // if....else
            System.out.println("you are child"); // obviously
        } else if (age == 18){
            System.out.println("You are adult");
        } else if (age>50){
            System.out.println("you have rest now");
        } else{
            System.out.println("you have enjoyed your life");
        }*/


        //java switch
        switch (age) {
            case 18-> System.out.println("you are now adult");
            case  25-> System.out.println("you are going to job");
            case 83 -> System.out.println("you take a rest");
            default -> System.out.println("enjoyed your life");
        }
    }
}
