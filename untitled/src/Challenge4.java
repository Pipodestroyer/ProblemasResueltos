/**
 * Leetcode #29: Divide Two Integers
 * Problem Link: https://leetcode.com/problems/divide-two-integers/
 *
 * @MrN0bo Daniel Rodriguez (Original implementation and logic)
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
            if (total+i==Math.abs(dividend)){
                quotient=u;
            }
        }
        u++;
    }
    if ((divisor < 0 && dividend > 0) || (divisor>0 && dividend<0)) {
        return -quotient;
    } else if ((divisor > 0 && dividend >= 0) || (divisor<0 && dividend <=0)) {
        return quotient;
    } else {
        IO.print("Cannot divide by ");
        return 0;
    }
}

void main() {
    int resultado = dividir(15, -4);
    IO.print(resultado);
}