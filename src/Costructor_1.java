class student{
    int id;
    String name;
    student(int id,String name){
        this.id=id;
        this.name=name;


    }
    public void method(){
        System.out.println(id+"  "+name);
    }
}
public class Costructor_1 {
    public static void main(String[] args) {
        student s = new student(1,"krupa");
        s.method();
    }
}
