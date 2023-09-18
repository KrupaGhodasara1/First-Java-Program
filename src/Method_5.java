public class Method_5 {
    static int myMethod5(int x,int y){
        return 5*(x+y);
    }
    static double myMethod5(double a,double b){
        return 5.5*(a+b);
    }

    public static void main(String[] args) {
        /*myMethod5(10, 10);
        myMethod5(10.5,10.5);*/
        System.out.println(myMethod5(10, 10));
        System.out.println(myMethod5(10.5,10.5));

    }
}
