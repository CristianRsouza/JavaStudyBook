package BinaryTree;

public class Tree<TYPE extends Comparable> {
  private Element<TYPE> root;

  public Tree() {
    this.root = null;
  }

  public void createElement(TYPE value) {
    Element<TYPE> newElement = new Element<TYPE>(value);
    if (this.root == null) {
      this.root = newElement;
    } else {
      Element<TYPE> current = this.root;
      while (true) {
        if (newElement.getValue().compareTo(current.getValue()) == -1) {
          if (current.getLeft() != null) {
            current = current.getLeft();
          } else {
            current.setLeft(newElement);
            break;
          }
        } else {
            if(current.getRigth() != null ) {
              current = current.getRigth();
            } else {
              current.setRight(newElement);
              break;
          }
        }
       
      }
    }

  }
}
