

class classA{
    public void add(){
        int a=10;
        int b=20;
        System.out.println("i am from class a");
        System.out.println(b-a);
    }
}
class classb extends classA{
    public void sub(){
        int a=10;
        int b=20;
        System.out.println("i am from class b");
        System.out.println(b+a);
    }
}

class classc extends classb{
    public void multi(){
        int a=10;
        int b=20;
        System.out.println("i am from class c");
        System.out.println(b*a);
    }
}
public class For_prac_4 {
    public static void main(String[] args) {
        classc c =new classc();
        c.add();
        c.sub();
        c.multi();

        classb b=new classb();
        b.add();
        b.sub();

        classA a =new classA();
        a.add();

    }
}
