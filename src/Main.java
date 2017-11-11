public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new TreeNode(5));
        binaryTree.getRoot().setLeft(new TreeNode(-22));
        binaryTree.getRoot().setRight(new TreeNode(11));
        binaryTree.getRoot().getLeft().setLeft(new TreeNode(9));
        binaryTree.getRoot().getLeft().setRight(new TreeNode(50));
        binaryTree.getRoot().getRight().setLeft(new TreeNode(9));
        binaryTree.getRoot().getRight().setRight(new TreeNode(2));

        MaxNodeValue maxNodeValue = new MaxNodeValue();
        System.out.println(maxNodeValue.findMax(binaryTree.getRoot()));
    }


}
