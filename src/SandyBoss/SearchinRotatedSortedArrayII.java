package SandyBoss;

public class SearchinRotatedSortedArrayII {
	public static void main(String[] args) {
		int nums[] = { 2, 2, 2, 0, 0, 1, 3 };
		int target = 4;
		System.out.println(findTerget(nums, target));
	}

	static boolean findTerget(int nums[], int target) {
		int l = 0, r = nums.length - 1;
		while (l < r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] > target) {
				return true;
			} else if (nums[mid] < target) { // 0 0 1 2 2 2 3
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return false;
	}
}
