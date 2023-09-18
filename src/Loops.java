public class Loops {
    public static void main(String[] args) {
        /*int i = 100; //while loop
        while (i <= 200) {
         System.out.println(i);
        i++;
        }

       // do while loop

       int b =0;
        do {
            System.out.println(b);
            b++;
        }while (b<5);

        //for loop

        for (int i = 0; i < 10; i++) {
            System.out.println(2*i);
        }*/

        // break and continue

       for (int i =0; i<10; i++) {
           System.out.println(i);
           if (i == 8) {
               System.out.println("Iam five");
               continue;
           }
       }

        // sum of first five even number

        /*int sum=0;
        for (int i = 0; i < 5; i++) {
            sum = sum + (2*i);
        }
            System.out.println(sum);*/

        /*int value=5;
        for (int i =1; i<=10; i++) {
            int table=value*i;
            System.out.println(table);
        }*/

        /*int value=6;
        for (int i=1; i<=10; i++){
            int table=value*i;
            System.out.println("6 * 1 = " + table);
        }*/
        int mul = 4;
        int total =0;

        for (int i = 0; i < 5; i++) {
            total = mul * (2 * i);
            System.out.println(total);
        }
        System.out.println(total);


    }
}
