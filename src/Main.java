public class Main {
        public static void main(String[] args) {
            Coche miCoche = new Coche();
            miCoche.AgregarPuerta();
            System.out.println(miCoche.puertas);
        }
    }
    class Coche {

        public int puertas = 3;

        public void AgregarPuerta() {

            this.puertas++;
        }
}
