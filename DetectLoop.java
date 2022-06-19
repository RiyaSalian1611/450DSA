class DetectLoop {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Node slow_ptr = head;
        Node fast_ptr = head;
        
        while(slow_ptr!=null && fast_ptr!=null && fast_ptr.next!=null){
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
            if(slow_ptr == fast_ptr)
                return true;
        }
        return false;
    }
}