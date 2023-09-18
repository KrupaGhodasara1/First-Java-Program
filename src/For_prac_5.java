

abstract class Animal{
    public  void walk(){
        System.out.println("wallk with in 4 legs");
    }
    public  void eat(){
        System.out.println("eat with teeth");
    }
}

class Horse extends Animal{
    public void run() {
        System.out.println("Run with 4 legs");
    }

}

class Madaniyu extends Horse{
    public void baby(){
        System.out.println("i am tiny baby of horse".toUpperCase());
        System.out.println();
    }

}


public class For_prac_5 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
        h.run();



        Madaniyu M = new Madaniyu();
        M.baby();


    }
}