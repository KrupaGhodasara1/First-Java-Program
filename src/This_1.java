class A{
    void Method(){
        System.out.println("m");
        this.Method1();

    }
    void Method1(){
        System.out.println("n");
    }
}




class this_1{
    public static void main(String[] args) {
        A k = new A();
        k.Method();

    }
}
