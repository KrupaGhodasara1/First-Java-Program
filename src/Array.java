import javax.lang.model.element.Element;

public class Array {
    public static void main(String[] args) {
        int[] marks = {96, 86, 78, 45, 74};
        String[] name ={"kur","ank","jig","jeel","hbhja","bhvbjh"};
        System.out.println(marks[4]);
        System.out.println(name[2]);
        System.out.println(name.length);
        System.out.println(marks.length);
        for(int i=0;i<5;i++){
            System.out.println(marks.length);
        }
    }
}
