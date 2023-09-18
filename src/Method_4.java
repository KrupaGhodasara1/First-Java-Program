public class Method_4 {
    static void myMethod4(int age){
        if (age<18){
            System.out.println("Hey you are now child");
        }else if (age==35){
            System.out.println("Hey you are now adult");

        }else{
            System.out.println("Hey you take rest now");
        }
    }

    public static void main(String[] args) {
        myMethod4(10);
        myMethod4(39);
        myMethod4(70);
    }
}
