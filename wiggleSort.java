class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) q.add(num);
        for (int i = 1; i < n; i += 2) nums[i] = q.poll();
        for (int i = 0; i < n; i += 2) nums[i] = q.poll();
    }
}
