import java.util.HashMap;
import java.util.Map;

public class One {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] val = twoSum(nums, target);
        for(int value : val) {
            System.out.println(value);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; ++i) {
            if(numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException();

    }
}
