class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        System.arraycopy(temp, 0, nums, k, nums.length - k);
        System.arraycopy(temp, nums.length - k, nums, 0, k);
    }
}