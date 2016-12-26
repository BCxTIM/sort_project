package Task1.BinaryTreeSort;

import Task1.Array.Array;

/**
 * Created by tmoiseev on 11/29/2016.
 */
public class BinaryTreeSort extends Array {

    public static void main(String[] args) {
        generateArray();
        showArray();

        BinaryTree binaryTree = new BinaryTree(array[0]);

        for (int i = 1; i <= array.length - 1; i ++) {
            binaryTree.add(new BinaryTree(array[i]));
        }

        binaryTree.move(new BinaryShow());

    }
}
