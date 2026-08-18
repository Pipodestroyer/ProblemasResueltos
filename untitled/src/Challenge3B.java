/**
 * Solución a Leetcode problema #214 con busqueda de lado mas eficiente.
 *
 * @Pipodestroyer Juan Galindo <juan.galindo@ustavillavo.edu.co>
 * @MrN0bo Daniel Rodriguez <daniel.rodriguezt@ustavillavo.edu.co>
 */
public static String shortestPalindrome(String s) {
    s = s.toLowerCase();
    String[] letras = s.split("");
    int largo = letras.length;
    String[] dividido = s.split("(?=.$)");
    String[] listatotal = dividido[0].split("");
    String[] divididor = s.split("(?<=^.)");
    String[] listatotalr = divididor[1].split("");
    int largoTotal = listatotal.length - 1;
    int coinsl = 0;
    int coinsr = 0;
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
            coinsl++;
        } else {
            break;
        }
    }
    for (int i = 0; i <= listatotalr.length-1; i++){
        if(listatotalr[i].equals(divididor[0])){
            listatotalr[i]="";
            coinsr++;
        } else {
            break;
        }
    }
    String record = String.join("", listatotalr);
    listatotalr = record.split("");
    if(coinsl > coinsr || coinsl == coinsr){
        String[] listafinal = list.toArray(new String[0]);
        largoTotal = listafinal.length-1;
        for (int i = 0; i <= listafinal.length - 1; i++) {
            if (listafinal.length % 2 == 0 && listafinal.length / 2 == i) {
                break;
            } else if (largoTotal == i){
                break;
            }
            String temp = listafinal[i];
            String temp2 = listafinal[largoTotal];
            listafinal[largoTotal] = temp;
            listafinal[i] = temp2;
            largoTotal--;
        }
        return s + String.join("", listafinal);
    } else {
        largoTotal = listatotalr.length-1;
        for (int i = 0; i <= listatotalr.length - 1; i++) {
            if (listatotalr.length % 2 == 0 && listatotalr.length / 2 == i) {
                break;
            } else if (largoTotal == i){
                break;
            }
            String temp = listatotalr[i];
            String temp2 = listatotalr[largoTotal];
            listatotalr[largoTotal] = temp;
            listatotalr[i] = temp2;
            largoTotal--;
        }
        return String.join("", listatotalr) + s;
    }
}
void main(){
    String result = shortestPalindrome("wwxyzwzwww");
    IO.println(result);
}