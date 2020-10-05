package data.structure;

public class Stack {
    Node head;
    Node tail;
    int size;
    public Stack(){
        head=tail=null;
        size =0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void push (Object data){
        Node node =new Node(data);
        if(isEmpty()){
            head = node;
        }else{
        tail.setLink(node);
        }
        tail = node;
        size++;
    }
    public void pop(){
        Node aux= new Node(head);
        int i=1;
        while(i<size-1){
        head=head.getLink();
        i++;
        }
        size--;
        tail=head;
        tail.setLink(null);
        head=aux;
    }
    public String toString(){
        return "List={head={"+head+"},tail={"+tail+"},size={"+size+"}}";
    }
}
