package org.example;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}
public class Tree {
    TreeNode root;

    public Tree() {
        root = null;
    }
    public String recursivePreOrder(TreeNode node) {
        StringBuilder result = new StringBuilder();
        recursivePreOrderHelper(node, result);
        return result.toString().trim();
    }
    private void recursivePreOrderHelper(TreeNode node, StringBuilder result) {
        if (node != null) {
            result.append(node.data).append(" ");
            recursivePreOrderHelper(node.left, result);
            recursivePreOrderHelper(node.right, result);
        }
    }
    public String recursiveLevelOrder() {
        if (root == null)
            return ""; // Return an empty string or handle the null case as appropriate.
        StringBuilder result = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            result.append(tempNode.data).append(" ");
            if (tempNode.left != null)
                queue.add(tempNode.left);
            if (tempNode.right != null)
                queue.add(tempNode.right);
        }
        return result.toString().trim();
    }
    public String iterativePreOrder() {
        if (root == null)
            return "";
        StringBuilder result = new StringBuilder();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tempNode = stack.pop();
            result.append(tempNode.data).append(" ");
            if (tempNode.right != null)
                stack.push(tempNode.right);
            if (tempNode.left != null)
                stack.push(tempNode.left);
        }
        return result.toString().trim();
    }
    public String iterativeInOrder() {
        if (root == null)
            return "";
        StringBuilder result = new StringBuilder();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.append(current.data).append(" ");
            current = current.right;
        }
        return result.toString().trim();
    }
    public String iterativePostOrder() {
        if (root == null)
            return "";
        StringBuilder result = new StringBuilder();
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> outputStack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tempNode = stack.pop();
            outputStack.push(tempNode);
            if (tempNode.left != null)
                stack.push(tempNode.left);
            if (tempNode.right != null)
                stack.push(tempNode.right);
        }
        while (!outputStack.isEmpty()) {
            result.append(outputStack.pop().data).append(" ");
        }
        return result.toString().trim();
    }
}
