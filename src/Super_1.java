 class Birds {
    String color = "white";
    }

     class parrot extends Birds {
    String color = "green";
        public void voice() {
            System.out.println(color);
            System.out.println(super.color);
        }
    }
         class dove extends parrot{
             public void voice(){
                System.out.println("black");
            }
        }

class Super_1 {
    public static void main(String[] args) {
        parrot p = new parrot();
        p.voice();
        dove d=new dove();
        d.voice();



    }
}