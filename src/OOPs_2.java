
class Square {


    int side;

    int squareSide() {
        return side * side;
    }

    int perimeter() {
        return 4 * side;
    }
}

    public class OOPs_2 {
    public static void main(String[] args) {
        Square sq =new Square();
        sq.side=4;
        System.out.println(sq.squareSide());
        System.out.println(sq.perimeter());


    }
}
