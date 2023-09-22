/*
 * 5. გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით. დაწერეთ
 * ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას. Int countVariants(Int stearsCount);
 */
public class Stairs {
    public static void main(String[] args) {
    }

    public static int countVariants(int stearsCount) {
        if (stearsCount <= 0) {
            return 0;
        } else if (stearsCount == 1) {
            return 1;
        } else if (stearsCount == 2) {
            return 2;
        }

        return countVariants(stearsCount - 1) + countVariants(stearsCount - 2);
    }
}
