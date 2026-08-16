public class Main {
    public static double myPow(double x, int n){
        double base = x;
        double respuesta = 1;
        for (int i = 1; i<=n; i++){
            if ( base < -100 || base > 100){
                break;
            }
            respuesta = respuesta * base;
        }

        return respuesta;
    }

    public static void main(String[] args){
        double result = myPow(102, 64);

        IO.println(result);
    }
}