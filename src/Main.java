public class Main {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new TreeNode(17));
        binaryTree.getRoot().setLeft(new TreeNode(3));
        binaryTree.getRoot().setRight(new TreeNode(-10));
        binaryTree.getRoot().getLeft().setLeft(new TreeNode(2));
        binaryTree.getRoot().getRight().setLeft(new TreeNode(16));
        binaryTree.getRoot().getRight().setRight(new TreeNode(1));
        binaryTree.getRoot().getRight().getRight().setRight(new TreeNode(13));

        MaxNodeValue maxNodeValue = new MaxNodeValue();
        System.out.println(maxNodeValue.findMax(binaryTree.getRoot()));
        System.out.println(maxNodeValue.findMax(binaryTree.getRoot().getRight()));

        BinaryTree binaryTree02 = new BinaryTree();
        binaryTree02.setRoot(new TreeNode(10));
        binaryTree02.getRoot().setLeft(new TreeNode(-2));
        binaryTree02.getRoot().setRight(new TreeNode(7));
        binaryTree02.getRoot().getLeft().setLeft(new TreeNode(8));
        binaryTree02.getRoot().getLeft().setRight(new TreeNode(-4));

        System.out.println(maxNodeValue.findMax(binaryTree02.getRoot()));
        System.out.println(maxNodeValue.findMax(binaryTree02.getRoot().getLeft()));

        MaxSumNodePath maxSumNodePath = new MaxSumNodePath();
        System.out.println("#1 binary, from root: " + maxSumNodePath.maxSum(binaryTree.getRoot()));
        System.out.println("#2 binary, from root: " + maxSumNodePath.maxSum(binaryTree02.getRoot()));
        System.out.println("#1 binary, from node -10: " + maxSumNodePath.maxSum(binaryTree.getRoot().getRight()));
        System.out.println("#2 binary, from node -2: " + maxSumNodePath.maxSum(binaryTree02.getRoot().getLeft()));

        ArrayToTree arrayToTree = new ArrayToTree();
        System.out.println(arrayToTree.arrayToTree(new int[]{17, 0, -4, 3, 15}));
    }


}
