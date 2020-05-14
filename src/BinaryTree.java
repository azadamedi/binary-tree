import org.w3c.dom.ls.LSOutput;

public class BinaryTree {

    Node root;
    public Node createnewNode(int key){
        Node newNode= new Node(key);
        return newNode ;
    }

    public void addNode(int key) {



        Node newNode =createnewNode(key);



        if (root == null) {

            root = newNode;

        } else {



            Node focusNode = root;



            Node parent;

            while (true) {



                parent = focusNode;

                // Check if the new node should go on
                // the left side of the parent node

                if (key < focusNode.key) {



                    focusNode = focusNode.leftChild;



                    if (focusNode == null) {



                        parent.leftChild = newNode;
                        return; // All Done

                    }

                } else {

                    focusNode = focusNode.rightChild;



                    if (focusNode == null) {



                        parent.rightChild = newNode;
                        return; // All Done

                    }

                }

            }
        }

    }



    public void inOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            // Traverse the left node

            inOrderTraverseTree(focusNode.leftChild);

            // Visit the currently focused on node

            System.out.println(focusNode.key);

            // Traverse the right node

            inOrderTraverseTree(focusNode.rightChild);

        }

    }




    public Node findNode(int key) {



        Node focusNode = root;



        while (focusNode.key != key) {



            if (key < focusNode.key) {



                focusNode = focusNode.leftChild;

            } else {



                focusNode = focusNode.rightChild;

            }



            if (focusNode == null)
                return null;

        }
        System.out.println("The element " +  key+ " is found! ");
        return focusNode;

    }

    public static void main(String[] args) {

        BinaryTree theTree = new BinaryTree();

        theTree.addNode(50);

        theTree.addNode(25);

        theTree.addNode(15);

        theTree.addNode(30);

        theTree.addNode(75);

        theTree.addNode(85);




        theTree.inOrderTraverseTree(theTree.root);

        theTree.findNode(75);

    }
}

class Node {

    int key;


    Node leftChild;
    Node rightChild;

    Node(int key) {

        this.key = key;


    }


}
