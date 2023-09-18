import javax.lang.model.element.Name;
import java.sql.SQLOutput;

class Employe {
   int id;
   String name;

      int getint(){
          return id;
      }

      String getString(){
          return name;
      }
      public void setName(String N){
          name = N;
      }
}

    public class OOPs {

    public static void main(String []args) {
       System.out.println("my first class");

        Employe kelly =new Employe();
        kelly.id=2;
        kelly.name="kk";


        System.out.println(kelly.id);
        System.out.println(kelly.name);






    }
}
