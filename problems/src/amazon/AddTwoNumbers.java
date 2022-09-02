package amazon;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode dummyHead  = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while(l1 != null || l2 != null || carry >0 ){
           int x  = (l1!=null) ? l1.val : 0;
           int y = (l2!=null) ? l2.val : 0;

           int sum  = x + y + carry ;


           carry  = sum/10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }




    public static void main(String[] args) {

        ListNode l1 = new ListNode(3,null);
        ListNode l2 = new ListNode(4,l1);
        ListNode l3 = new ListNode(2,l2);
        ListNode l4 = new ListNode(4,null);
        ListNode l5 = new ListNode(6,l4);
        ListNode l6 = new ListNode(5,l5);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l3,l6);
        System.out.println(result.val);

    }
}
