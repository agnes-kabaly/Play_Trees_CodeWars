import java.util.LinkedList;
import java.util.Queue;

public class MaxNodeValue {

    public int findMax(TreeNode root) {
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        int max = root.getValue();
        TreeNode p;
        if (root == null) {
            return 0;
        } else {
            nodeQueue.add(root);
        }
        while (!nodeQueue.isEmpty()) {
            p = nodeQueue.remove();
            if (p.getValue() > max) {
                max = p.getValue();
            }
            if (p.getLeft() != null) {
                nodeQueue.add(p.getLeft());
            }
            if (p.getRight() != null) {
                nodeQueue.add(p.getRight());
            }
        }
        return max;
    }
}
