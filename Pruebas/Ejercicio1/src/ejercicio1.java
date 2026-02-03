public class ejercicio1 {
    public static void main(String[] args) throws Exception {

        //int resultado = multiplicar(4, 3);
        System.out.println("El resultado es: " + multiplicar(4, 3));
    }

    public static int multiplicar (int a, int b){
        int producto = 0;
        for (int i = 0; i < b; i++) {
            producto += a;
        }
        return producto;

    }
    
}
