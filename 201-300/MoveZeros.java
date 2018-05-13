class MoveZeros {
    public void moveZeroes(int[] nums) {
        for (int i = 1; i < nums.length;i++) {
            int pointer = i;
            while(pointer > 0 && nums[pointer - 1] == 0){
                if(nums[pointer - 1] == 0){
                    int temp = nums[pointer - 1];
                    nums[pointer - 1] = nums[pointer];
                    nums[pointer] = temp;
                    pointer--;
                }else{
                    break;
                }
            }
        }    
    }
}