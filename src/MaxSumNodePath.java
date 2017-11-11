import java.util.ArrayList;

public class MaxSumNodePath {

    public int maxSum(TreeNode root) {
        ArrayList<ArrayList<Integer>> allPaths = new FindAllPath().collectAllPath(root);
        int max = 0;
        for (ArrayList<Integer> path : allPaths) {
            int sum = 0;
            for (Integer nodeValue : path) {
                sum += nodeValue;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }


    private class FindAllPath {
        private ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
        private ArrayList<Integer> onePath = new ArrayList<>();

        public ArrayList<ArrayList<Integer>> collectAllPath(TreeNode root) {
            if (root == null) {
                return allPaths;
            }
            onePath.add(root.getValue());
            if (root.getLeft() == null && root.getRight() == null) {
                allPaths.add(new ArrayList<>(onePath));
            }
            collectAllPath(root.getLeft());
            collectAllPath(root.getRight());
            onePath.remove(onePath.size() - 1);
            return allPaths;
        }
    }


}
