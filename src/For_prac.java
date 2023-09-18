import javax.lang.model.element.Element;

public class For_prac {
    public static void main(String[] args) {
        /*int i =0;
        while (i<10) {
            System.out.println(i);
            if(i==3){
                System.out.println("i am three");
                }
                i++;
            }*/

        /*float total=0;
        float sum = 0;
        float [] marks = {53.6f,89.6f,95.2f,56.3f};
        for (float Elements : marks) {
            sum = sum + Elements;
            //System.out.println(sum);
        }
        System.out.println(sum);
*/
        // question number : 2

        /*float [] marks = {53.6f,89.6f,95.2f,56.3f};
        float num = 99.2f;
        boolean Isinarray = false;

        for (float Elements : marks) {
            if (num==Elements){
                Isinarray = true;
            }
        }
        if(Isinarray) {
            System.out.println("this is valid");
        }

        else{
            System.out.println("is this is not valid");
        }*/
       // question number : 3
        float sum = 0;
        float [] marks = {53.6f,89.6f,95.2f,56.3f};
        for (float Elements : marks) {
            sum = sum + Elements;
            //System.out.println(sum);
        }
        System.out.println("the value of average mark is   " +sum /marks.length);
      }
    }

