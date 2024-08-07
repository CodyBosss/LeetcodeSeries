package SandyBoss;

public class NameSumQueryImmutable {
	public static void main(String[] args) {
		int nums[] = { -2, 0, 3, -5, 2, -1 };
		NameSumQueryImmutable obj = new NameSumQueryImmutable(nums);
		System.out.println(obj.sumRange(0, 2));
		System.out.println(obj.sumRange(2, 5));
		System.out.println(obj.sumRange(0, 5));
	}

	int sums[];

	public NameSumQueryImmutable(int[] nums) {
		if (nums.length == 0)
			return;
		sums = new int[nums.length];
		sums[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sums[i] = sums[i - 1] + nums[i];
		}
	}

	public int sumRange(int left, int right) {
		if (left == 0) {
			return sums[right];
		} else {
			return sums[right] - sums[left - 1];
		}
	}
}
