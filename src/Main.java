class Animal {

    //Animal papa = new Poisson();

    int kaser;

    public Animal (int kaser) {
        this.kaser = kaser-6;

    }

    public void kaser () {
        System.out.println(kaser);
    }

    public static void main(String[] args) {
        Animal chien = new Chien(12);
        System.out.println(chien.kaser); // 6
        chien.kaser(); // 6
        ((Chien) chien).kaserrr(); // 19 et 6
        System.out.println(((Chien) chien).kaser); // 19
        //(chien).kaser();
        //System.out.println(((Chien) chien).kaser);
    }

}

class Chien extends Animal {

    //Animal papa = new Chat();
    int kaser = 12;

    public Chien(int kaser) {
        super(kaser);
        this.kaser=19;
    }

    public void kaserrr() {
        System.out.println(kaser); //
        System.out.println(super.kaser);
    }

}