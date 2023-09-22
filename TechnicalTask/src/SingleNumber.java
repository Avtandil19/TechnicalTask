import java.util.HashMap;
import java.util.Map;

/*
 * 1. გვაქვს მთელი რიცხვების ჩამონათვალი სადაც ერთის გარდა ყველა რიცხვი მეორდება, იპოვეთ
 * ის რიცხვი რომელიც არ მეორდება.int singleNumber(int[] nums)
 */
public class SingleNumber {
    public static void main(String[] args) {
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                int quantity = map.get(num);
                quantity += 1;
                map.put(num, quantity);
            } else {
                map.put(num, 1);
            }
        }

        int res = 0;

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                res = key;
                break;
            }
        }

        return res;
    }
}
