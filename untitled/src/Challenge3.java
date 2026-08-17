public static String shortestPalindrome(String s) {
    s = s.toLowerCase();
    String[] letras = s.split("");
    int largo = letras.length;
    String[] dividido = s.split("(?=.$)");
    String[] listatotal = dividido[0].split("");
    int largoTotal = listatotal.length - 1;
    for (int i = 0; i <= letras.length - 1; i++) {
        if (letras[i].equals(letras[largo - 1])) {
            if (largo - 1 == 0) {
                return s;
            }
            largo = largo - 1;
        } else {
            break;
        }
    }
    for (int i = 0; i <= listatotal.length - 1; i++) {
        if (listatotal.length % 2 == 0 && listatotal.length / 2 == i) {
            break;
        } else if (listatotal.length - 1 == i){
            break;
        }
        String temp = listatotal[i];
        String temp2 = listatotal[largoTotal];
        listatotal[largoTotal] = temp;
        listatotal[i] = temp2;
        largoTotal = largoTotal - 1;
    }
    return s + String.join("", listatotal);
}
void main(){
    String result = shortestPalindrome("abb");
    IO.println(result);
}