class AChien {

    private String name;
    private PatteDeChien[] pattes = new PatteDeChien[4];

    public AChien(String name) {
        this.name = name;
        this.pattes[0] = new PatteDeChien();
        this.pattes[1] = new PatteDeChien();
        this.pattes[2] = new PatteDeChien();
        this.pattes[3] = new PatteDeChien();

        this.pattes[0].afficheStatutBoitage();

    }

    private class PatteDeChien {

        private void afficheStatutBoitage () {
            System.out.println("Patte de " + AChien.this.name + ": boitage OK");
        }

    }
}

class Test {
    public static void main(String[] args) {
        AChien chien = new AChien("Francis");
    }
}