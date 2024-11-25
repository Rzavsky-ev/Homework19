import java.util.*;

public class Manipulations {
    public List<Integer> removeEvenNumbers(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
                i--;
            }
        }
        return nums;
    }

    public List<Integer> makeEvenOrdered(List<Integer> nums) {

        Set<Integer> numsSet = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                numsSet.add(num);
            }
        }
        nums.clear();
        for (Integer num : numsSet) {
            nums.add(num);
        }
        Collections.sort(nums);
        return nums;
    }

    public Set<String> removeDuplicates(List<String> strings) {
        Set<String> stringsSet = new HashSet<>();
        for (String string : strings) {
            stringsSet.add(string);
        }
        return stringsSet;
    }

    public List<Integer> countNumberOfOccurrences(List<String> strings) {
        List<Integer> num = new ArrayList<>();
        while (!strings.isEmpty()) {
            num.add(Collections.frequency(strings, strings.get(0)));
            String s = strings.get(0);
            for (int i = 0; i < strings.size(); i++) {
                if (strings.get(i).equals(s)) {
                    strings.remove(i);
                    i--;
                }
            }
        }
        return num;
    }
}
