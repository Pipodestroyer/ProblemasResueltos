
public static double myPow(double x, int n){

    double respuesta = 1;
    int ciclos = Math.abs(n);

    if ( x < -100 || x > 100 || x == 0 && n < 0){
        return 0;
    }

    for (int i = 1; i<= ciclos; i++){
        if (0 > n) {
            respuesta = respuesta/x;
        } else {
            respuesta = respuesta * x;
        }
    }

    return respuesta;

}

 void main(){

    double result = myPow(2, -2);

    IO.println(result);
}
