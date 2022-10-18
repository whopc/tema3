public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma( 10,20,30);
        System.out.println(resultado);
        Coche toyotaMatrix = new Coche();
        toyotaMatrix.numPuertas();
        toyotaMatrix.numPuertas();
        System.out.println(toyotaMatrix.puertas);

    }
    public static int suma(int a, int b, int c)
    {
        return a + b + c;

    }
    static class Coche {
        public int puertas=0;
        public void numPuertas()
        {
            this.puertas++;
        }
    }
}


