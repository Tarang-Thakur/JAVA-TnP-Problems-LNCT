class Remove_Elements {
    public int removeElement(int[] nums, int val) {
        int rep=0;
        for (int i=0 ; i<nums.length ; i++){
            if(nums[i]!=val){
                nums[rep]=nums[i];
                rep++;
            }
        }
        return rep;
    }
}