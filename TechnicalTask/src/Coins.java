/*
 * გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხა
 * (თეთრებში) და აბრუნებს მონეტების მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა
 * დავახურდაოთ. Int minSplit(Int amount);
 */
public class Coins {
    public static void main(String[] args) {
    }

    public static int minSplit(int amount) {
        int res = 0;
        int[] arr = {1, 5, 10, 20, 50};

        for (int i = arr.length - 1; i >= 0; i--) {
            int coin = arr[i];

            if (amount >= coin) {
                int remainder = amount % coin;
                res += amount / coin;
                amount = remainder;

                if (remainder == 0) {
                    break;
                }
            }
        }

        return res;
    }
}
