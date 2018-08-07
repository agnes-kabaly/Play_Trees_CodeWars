import java.util.LinkedList;
import java.util.Queue;

public class ArrayToTree {

    public TreeNode arrayToTree(int[] array) {
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        TreeNode root = null;
        for (int i = 0; i < array.length; i++) {
            if (root == null) {
                root = new TreeNode(array[i]);
                nodeQueue.add(root);
            } else {
                TreeNode node = nodeQueue.remove();
                for (int j = 0; j < 2 && i < array.length; j++) {
                    if (j == 0) {
                        node.setLeft(new TreeNode(array[i++]));
                        nodeQueue.add(node.getLeft());
                    } else {
                        node.setRight(new TreeNode(array[i]));
                        nodeQueue.add(node.getRight());
                    }
                }
            }
        }
        return root;
    }

}
