/*
 * 4.მოცემულია ორი binary string a და b, დააბრუნეთ მათი ჯამი, როგორც binary string.
 * მაგ: a = &quot;1010&quot; b = &quot;1011&quot; , მათი ჯამი იქნება &quot;10101&quot;
 */
public class BinarySum {
    public static void main(String[] args) {
    }

    public static String sumBinaryStrings(String a, String b) {
        String res = "";

        int tmp = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (true) {
            if (i < 0 && j < 0) break;

            int aNum = 0;
            int bNum = 0;

            if (i >= 0) {
                aNum = a.charAt(i) - '0';
            }

            if (j >= 0) {
                bNum = b.charAt(j) - '0';
            }

            int sum = aNum + bNum + tmp;
            switch (sum) {
                case 0 -> {
                    res = '0' + res;
                    tmp = 0;
                }
                case 1 -> {
                    res = '1' + res;
                    tmp = 0;
                }
                case 2 -> {
                    res = '0' + res;
                    tmp = 1;
                }
                case 3 -> {
                    res = '1' + res;
                    tmp = 1;
                }
            }

            i--;
            j--;
        }

        if (tmp != 0) {
            res = tmp + res;
        }

        return res;
    }
}
