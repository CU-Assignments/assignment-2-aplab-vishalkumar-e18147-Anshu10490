class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length-1);
    }
    static int partition(int []nums, int si, int ei){
        int pivot= ei;
        int i= si-1;
        for(int j= si; j<= ei; j++){
            if(nums[j]<= nums[pivot]){
                i++;
                int temp= nums[i];
                nums[i]= nums[j];
                nums[j]= temp;
            }
        }
        return i;
    }
    static void quickSort(int []nums, int si, int ei){
        if(si< ei){
            int pivot= partition(nums, si, ei);
            quickSort(nums, si, pivot-1);
            quickSort(nums, pivot, ei);
        }
    }
}
