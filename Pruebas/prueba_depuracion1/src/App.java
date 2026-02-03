public class App {
    public static void main(String[] args) throws Exception {

        int a = 5 ;
        int b = 10; 
        int suma = 0; 

        //Bucle que recorre mis dos numeros. Fix: i<b. Hemos arreglado la variable b debido a que no contempla el numero 10
        for (int i = a; i <= b; i++){
            suma += i; 
        }
        System.out.print("La suma es: " + suma);

    


    }
}
