package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TreeTest {

    @Test
    public void testTraversals() {
        // Create a sample tree
        Tree tree = createSampleTree();

        // Expected output for the traversals
        String expectedPreOrder = "1 2 4 5 3 ";
        String expectedInOrder = "4 2 5 1 3 ";
        String expectedPostOrder = "4 5 2 3 1 ";
        String expectedLevelOrder = "1 2 3 4 5 ";

        // Testing recursive pre-order traversal
        assertEquals(expectedPreOrder.trim(), tree.recursivePreOrder(tree.root).trim());

        // Testing recursive in-order traversal
//        assertEquals(expectedInOrder.trim(), tree.recursiveInOrder(tree.root).trim());

//        assertEquals(expectedPostOrder.trim(), tree.recursivePostOrder(tree.root).trim());

        // Testing recursive level-order traversal
        assertEquals(expectedLevelOrder.trim(), tree.recursiveLevelOrder().trim());

        // Testing iterative pre-order traversal
        assertEquals(expectedPreOrder.trim(), tree.iterativePreOrder().trim());

        // Testing iterative in-order traversal
        assertEquals(expectedInOrder.trim(), tree.iterativeInOrder().trim());

        // Testing iterative post-order traversal
        assertEquals(expectedPostOrder.trim(), tree.iterativePostOrder().trim());
    }
    @Test
    public void testEmptyTree() {
        Tree emptyTree = new Tree();
        assertEquals("", emptyTree.recursivePreOrder(emptyTree.root).trim());
//        assertEquals("", emptyTree.recursiveInOrder(emptyTree.root).trim());
//        assertEquals("", emptyTree.recursivePostOrder(emptyTree.root).trim());
        assertEquals("", emptyTree.recursiveLevelOrder().trim());
        assertEquals("", emptyTree.iterativePreOrder().trim());
        assertEquals("", emptyTree.iterativeInOrder().trim());
        assertEquals("", emptyTree.iterativePostOrder().trim());
    }

    @Test
    public void testSingleNodeTree() {
        Tree singleNodeTree = new Tree();
        singleNodeTree.root = new TreeNode(1);
        assertEquals("1", singleNodeTree.recursivePreOrder(singleNodeTree.root).trim());
//        assertEquals("1", singleNodeTree.recursiveInOrder(singleNodeTree.root).trim());
//        assertEquals("1", singleNodeTree.recursivePostOrder(singleNodeTree.root).trim());
        assertEquals("1", singleNodeTree.recursiveLevelOrder().trim());
        assertEquals("1", singleNodeTree.iterativePreOrder().trim());
        assertEquals("1", singleNodeTree.iterativeInOrder().trim());
        assertEquals("1", singleNodeTree.iterativePostOrder().trim());
    }

    @Test
    public void testNodesWithNullChildren() {
        Tree treeWithNullChildren = new Tree();
        treeWithNullChildren.root = new TreeNode(1);
        treeWithNullChildren.root.left = null;
        treeWithNullChildren.root.right = null;
        assertEquals("1", treeWithNullChildren.recursivePreOrder(treeWithNullChildren.root).trim());
//        assertEquals("1", treeWithNullChildren.recursiveInOrder(treeWithNullChildren.root).trim());
//        assertEquals("1", treeWithNullChildren.recursivePostOrder(treeWithNullChildren.root).trim());
        assertEquals("1", treeWithNullChildren.recursiveLevelOrder().trim());
        assertEquals("1", treeWithNullChildren.iterativePreOrder().trim());
        assertEquals("1", treeWithNullChildren.iterativeInOrder().trim());
        assertEquals("1", treeWithNullChildren.iterativePostOrder().trim());
    }

    private Tree createSampleTree() {
        Tree tree = new Tree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        return tree;
    }
}
