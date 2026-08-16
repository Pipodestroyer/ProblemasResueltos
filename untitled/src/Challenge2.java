public static int countDigitOne(int n) {
    int contadorfinal = 0;
    int numero = n;
    do {
        for(int i = 0;  i <= String.valueOf(Math.abs(numero)).length()-1; i++){
            int[] toscan = String.valueOf(numero)
                        .chars()
                        .map(c -> c - '0')
                        .toArray();

            if (i != toscan.length) {
                if(toscan[i] == 1){
                    contadorfinal++;
                }
            }
        }
        numero--;
    } while (numero != 0);
    return contadorfinal;

}

void main(){

    int result = countDigitOne(13);

    IO.println(result);
}