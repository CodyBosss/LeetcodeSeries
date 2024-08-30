package SandyBoss;

import java.util.ArrayList;
import java.util.List;

public class SubsetUsingInteger {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
//		subSet(nums, 0, "");
		System.out.println(subSetList(nums, 0));
	}

	public static void subSet(int nums[], int idx, String curSet) {
		if (idx == nums.length) {
			System.out.println("{" + curSet.trim() + "}");
			return;
		}
		subSet(nums, idx + 1, curSet);
		subSet(nums, idx + 1, curSet + nums[idx] + " ");
	}

	public static List<List<Integer>> subSetList(int nums[], int idx) {
		List<List<Integer>> result = new ArrayList<>();
		if (idx == nums.length) {
			result.add(new ArrayList<>());
			return result;
		}
		result = subSetList(nums, idx + 1);
		int curElement = nums[idx];
		int n = result.size();
		for (int i = 0; i < n; i++) {
			List<Integer> newList = new ArrayList<>(result.get(i));
			newList.add(curElement);
			result.add(newList);
		}
		return result;
	}
}
