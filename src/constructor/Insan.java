package constructor;

public class Insan {

    int boy;

    int kilo;

    int yas;

    public Insan() {
        this.boy = 150;
        System.out.println("Merhaba ben bos consturctor");
    }



    public Insan(int boy, int kilo, int yas) {
        System.out.println("Merhaba ben dolu consturctor");
        this.boy = boy;
        this.kilo = kilo;
        this.yas = yas;
    }

    public Insan(int kilo, int yas) {
        this.kilo = kilo;
        this.yas = yas;
    }
}
