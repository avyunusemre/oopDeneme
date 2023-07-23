package constructor;

public class Test {

    public static void main(String[] args) {
        Insan veli =  new Insan();
        veli.kilo = 70;
        veli.yas = 22;

        System.out.println("veli : " + veli.boy);

        Insan yunus = new Insan(170, 65, 30);

        System.out.println("yunus : " + yunus.boy);

        Insan yasin = new Insan(80,32);


    }
}
