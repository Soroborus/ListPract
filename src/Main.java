public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        System.out.println(myLinkedList);
        Node current=myLinkedList.head;
        while (current.next!=null){
            System.out.println(myLinkedList);

        }

    }
}