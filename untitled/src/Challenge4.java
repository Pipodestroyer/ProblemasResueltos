/**
 * Solución a Leetcode problema #29.
 *
 * @MrN0bo Daniel Rodriguez <daniel.rodriguezt@ustavillavo.edu.co>
 * @Pipodestroyer Juan Galindo (Code Review)
 */
public int dividir(int dividend, int divisor) {
    int quotient = 0;
    int divide = Math.abs(divisor);
    int u = 1;

    while (quotient == 0 && divisor != 0 && dividend != 0) {
        int total = 0;
        for (int i = 0; i < divide; i++) {
            total = total + u;
        }
        for (int i = 0; i < divide; i++) {
            if (total+i==dividend){
                quotient=u;
            }
        }
        u++;
    }
    if ((divisor < 0 && dividend > 0) || (divisor>0 && dividend<0)) {
        return -quotient;
    } else if (divisor > 0 && dividend >= 0) {
        return quotient;
    } else {
        IO.print("Cannot divide by ");
        return 0;
    }
}

void main() {
    int resultado = dividir(11, 2);
    IO.print(resultado);
}