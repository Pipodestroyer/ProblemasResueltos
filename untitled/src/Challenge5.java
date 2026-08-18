/**
 * Solución a Leetcode problema #41.
 *
 * @MrN0bo Daniel Rodriguez <daniel.rodriguezt@ustavillavo.edu.co>
 * @Pipodestroyer Juan Galindo (Code Review)
 */
import java.util.Arrays;
public static int fMP(int[] nums) {
    Arrays.sort(nums);
    int step = 1;

    for (int num : nums) {
        if (step == num) {
            step++;
        }
    }
    return step;
}

void main() {
    int[] array =  {-3,9,4,5,-4,9,2,1,-1,7,2,-7,2,5,-6,1,3,-4};
    int pasos = fMP(array);
    IO.println(pasos);
}