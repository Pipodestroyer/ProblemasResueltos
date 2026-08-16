public class Main {
    public static double myPow(double x, int n){
        double respuesta = 1;
        for (int i = 1; i<=n; i++){
            if ( x < -100 || x > 100 || n != 0 || x != 0){
                break;
            }
            if ( n < 0 )
            respuesta = respuesta * x;
        }

        return respuesta;
    }

    public static void main(String[] args){
        double result = myPow(102, 64);

        IO.println(result);
    }
}