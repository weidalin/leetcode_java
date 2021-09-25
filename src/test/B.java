package test;

/**
 * @author linweida
 * 2021/8/26 8:21 下午
 */


class B extends A{
    int value = 0;
//class B {
    static {
        System.out.println("b static block");
    }
    {
        System.out.println("b block");
    }
    public void a(){
        System.out.println("b method invoke");
    }
    public B(){
//        super();

        System.out.println("b construct");
    }

    public static void main(String[] args) {
        final B b = new B();
//        final A b = new B();
//        final A b = new A();
        func(b);
        System.out.println("----------");
        b.a();
        System.out.println("----------");

    }

    private static void func(B b) {
        b.value = 1;
    }

}
 class A{
    static {
        System.out.println("a static block");
    }

    {
        System.out.println("a block");
    }

    public A() {
        System.out.println("a construct");
    }
    public void a(){
        System.out.println("a method invoke");
    }
}

