class Solution {

    public int largest(int[] n) {
        int max = n[0];
        int idx = 0;

        for (int i = 1; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
                idx = i;
            }
        }
        return idx;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) return null;

        int lg = largest(nums);

        TreeNode root = new TreeNode(nums[lg]);

        root.left = constructMaximumBinaryTree(
            Arrays.copyOfRange(nums, 0, lg)
        );

        root.right = constructMaximumBinaryTree(
            Arrays.copyOfRange(nums, lg + 1, nums.length)
        );

        return root;
    }
}