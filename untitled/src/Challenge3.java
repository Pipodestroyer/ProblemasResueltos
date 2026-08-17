public static String shortestPalindrome(String s) {

    s = s.toLowerCase();
    String[] dividido = s.split("(?=.$)");
    String[] listatotal = dividido[0].split("");
    int largoTotal = listatotal.length-1;

    for (int i = 0; i <= listatotal.length-1; i++) {

        if(listatotal.length % 2 == 0) {

            if (listatotal.length / 2 == i) {
                break;
            }

        } else {

            if (listatotal.length-1 == i) {
                break;
            }

        }

        String temp = listatotal[i];
        String temp2 = listatotal[largoTotal];

        listatotal[largoTotal] = temp;
        listatotal[i] = temp2;
        largoTotal = largoTotal-1;

    }

    return s + String.join("", listatotal);

}

void main(){

    String result = shortestPalindrome("abBc");

    IO.println(result);

}