package algorithm.datastructure;

public class ListNode<T> {
    public T val;
    public ListNode<T> next;

    public ListNode(T val) {
        this.val = val;
        this.next = null;
    }

    public static <T> ListNode<T> getListNode(T[] list){
        if(list.length == 0){
            return null;
        }
        
        ListNode<T> head = new ListNode(-1);
        ListNode<T> curr = head;
        for(int i = 0; i < list.length; i++){
            curr.next = new ListNode<T>(list[i]);
            curr = curr.next;
        }
        return head.next;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        ListNode curr = this;
        while(curr != null){
            sb.append(curr.val + " ");
            curr = curr.next;
        }
        sb.append("null");
        return sb.toString();
    }
}