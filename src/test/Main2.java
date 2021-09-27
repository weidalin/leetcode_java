package test;

public class Main2 {
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        main2.change(main2.str, main2.ch);
        System.out.println(main2.str + "and " +  main2.ch);
        Boolean b = new Boolean("tRue");
        System.out.println(b);
    }

    private void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'g';
    }

}
