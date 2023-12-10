class Dauphin {
    int age = 10;

    public void printAge() {
        System.out.println(age);
    }
}

class BebeDauphin extends Dauphin {
    int age = 0;

    @Override
    public void printAge() {
        System.out.println(super.age);
        super.printAge(); // this is better, especially if age is private
    }
}

public class NewHeritageChelou {

    public static void main(String[] args) {
        BebeDauphin dauphin = new BebeDauphin();
        dauphin.printAge();
    }

}
