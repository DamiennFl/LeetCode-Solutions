import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
    Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

    List<List<Integer>> answer = new ArrayList<List<Integer>>();
    List<Integer> nums1List = new ArrayList<Integer>();
    List<Integer> nums2List = new ArrayList<Integer>();

    for(Integer n : nums1Set) {
        if(!(nums2Set.contains(n))) {
            nums1List.add(n);
        }
    }

    for(Integer n : nums2Set) {
        if(!(nums1Set.contains(n))) {
            nums2List.add(n);
        }
    }
    answer.add(nums1List);
    answer.add(nums2List);
    return answer;
}
}