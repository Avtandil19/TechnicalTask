import java.util.Arrays;

/*
 * 3. მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. დაწერეთ ფუნქცია რომელსაც
 * გადაეცემა ეს მასივი და აბრუნებს მინიმალურ მთელ რიცხვს, რომელიც 0-ზე მეტია და ამ მასივში
 * არ შედის. Int notContains(Int[] array);
 */
public class MinNumber {
    public static void main(String[] args) {
    }

    public static int notContains(int[] array) {
        Arrays.sort(array);
        int min = 1;

        for (int i = 0; i < array.length; i++) {
            int n = array[i];

            if (n <= 0) {
                continue;
            }

            if (n == min) {
                min += 1;
            } else {
                break;
            }
        }

        return min;
    }
}
