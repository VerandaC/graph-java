package data.structure;

public class Queue {
    Node head;
    Node tail;
    int size;
    public Queue(){
        head=tail=null;
        size =0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void enqueue(Object data){
        Node node =new Node(data);
        if(isEmpty()){
            head = node;
        }else{
        tail.setLink(node);
        }
        tail = node;
        size++;
    }
    public void dequeue(){
        head=head.getLink();
        size--;
    }
    public String toString(){
        return "List={head={"+head+"},tail={"+tail+"},size={"+size+"}}";
    }
}
