package Task1.BinaryTreeSort;

/**
 * Created by tmoiseev on 11/29/2016.
 */
public class BinaryTree {
    private BinaryTree left;
    private BinaryTree rigth;
    public int key;

    public BinaryTree(int k) {
        key = k;
    }

    public void add(BinaryTree binaryTree) {
        if(binaryTree.key < key) {
            if(left != null) {
                left.add(binaryTree);
            } else {
                left = binaryTree;
            }
        } else if(rigth != null) {
            rigth.add(binaryTree);
        } else {
            rigth = binaryTree;
        }
    }

    public void move(BinaryShow binaryShow) {
        if(left != null) {
            left.move(binaryShow);
        }

        binaryShow.show(this);

        if (rigth != null) {
            rigth.move(binaryShow);
        }
    }
}
