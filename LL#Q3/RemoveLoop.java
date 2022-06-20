

// class Node
// {
//     int data;
//     Node next;
//     boolean flag;
// }


class RemoveLoop
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        HashSet<Node> hs = new HashSet<Node>();
        while(head!=null){
            if(hs.contains(head.next)){
                head.next = null;
                break;
            }
            hs.add(head);
            head = head.next;
        }
    }
}