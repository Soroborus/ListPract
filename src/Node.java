public class Node {
    Object data;
    Node next;
    public Node(Object dataValue){
        next = null;
        data = dataValue;
    }
    public Node(Object dataValue, Node nextValue){
        next = nextValue;
        data = dataValue;
    }
    public Object getData() { return data; }
    public void setData(Object dataValue) {
        data = dataValue;
    }
    public Node getNext() { return next; }
    public void setNext(Node nextValue) { next = nextValue; }
    @Override
    public String toString() {
        String output ="";
        output = "node data="+data;
        return output;
    }
}
