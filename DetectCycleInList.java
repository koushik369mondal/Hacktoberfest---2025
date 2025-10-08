class ListNode {
    int data;
    ListNode next;
    
    ListNode(int d) {
        data = d;
        next = null;
    }
}

public class DetectCycleInList {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        
        // Creating a cycle
        head.next.next.next.next = head.next;
        
        if (hasCycle(head)) {
            System.out.println("Cycle detected in the linked list");
        } else {
            System.out.println("No cycle detected");
        }
    }
}
