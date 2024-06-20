package BinaryTree;

public class Element<TYPE> {
    private TYPE value;
    private Element<TYPE> left;
    private Element<TYPE> rigth;

    public Element(TYPE newValue) {
      this.value = newValue;
      this.left = null;
      this.rigth = null;
    }

    public TYPE getValue() {
      return value;
    }

    public void setValue(TYPE value) {
      this.value = value;
    }

    public Element<TYPE> getLeft() {
      return left;
    }

    public void setLeft(Element<TYPE> left) {
      this.left = left;
    }

    public Element<TYPE> getRigth() {
      return rigth;
    }

    public void setRight(Element<TYPE> rigth) {
      this.rigth = rigth;
    }
    
    
}
