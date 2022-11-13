public class MyLinkedList {
    protected final Node head;
    private int listCount;
    public MyLinkedList() {
        head = new Node(null);
        listCount = 0;
    }

    public void add(Object data){
        Node tmp = new Node(data);
        Node current = head;
        for (int i=0;i<listCount;i++) {
            current = current.getNext();
        }
        current.setNext(tmp);   //HEAD IS ASSIGNED TO BE NEXT AFTER NEW TAIL IS MADE
        tmp.setNext(head);     //head is basically a pointer for an entry point in list, head is never used for anything else
        listCount++;
    }

    public Object get(int index){
        if (index <= 0) return null;
        Node current = head.getNext();
        for (int i = 1; i < index; i++){
            if (current.getNext() == null) return null;
            current = current.getNext();
        }
        return current.getData();
    }
    public boolean remove(int index){
        if (index < 1 && index > size()) return false;
        Node current = head;
        for (int i =1; i < index; i++){
            if (current.getNext() == null) return false;
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }
    public int size(){ return listCount; }
    @Override
    public String toString() {
        Node current = head.getNext();
        String output = "";
        for (int i=0;i<listCount;i++){
            output+="["+current.getData().toString()+"]";
            current = current.getNext(); }
        return output;
    }
}
