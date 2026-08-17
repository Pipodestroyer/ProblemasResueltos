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
    List<String> list = new ArrayList<>(Arrays.asList(listatotal));
    for (int i = 0; i <= listatotal.length-1; i++){
        if(list.get(largoTotal).equals(dividido[1])){
            list.remove(largoTotal);
            largoTotal--;
        } else {
            break;
        }
    }
    String[] listafinal = list.toArray(new String[0]);
    largoTotal = listafinal.length-1;
    for (int i = 0; i <= listafinal.length - 1; i++) {
        if (listafinal.length % 2 == 0 && listafinal.length / 2 == i) {
            break;
        } else if (listafinal.length - 1 == i){
            break;
        }
        String temp = listafinal[i];
        String temp2 = listafinal[largoTotal];
        listafinal[largoTotal] = temp;
        listafinal[i] = temp2;
        largoTotal--;
    }
    return s + String.join("", listafinal);
}
void main(){
    String result = shortestPalindrome("abb");
    IO.println(result);
}