public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public EmployeeDoublyLinkedList() {
    }

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (this.head == null) {
            this.tail = node;
        } else {
            this.head.setPrevious(node);
            node.setNext(this.head);
        }

        this.head = node;
        ++this.size;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (this.tail == null) {
            this.head = node;
        } else {
            this.tail.setNext(node);
            node.setPrevious(this.tail);
        }

        this.tail = node;
        ++this.size;
    }

    public EmployeeNode removeFromFront() {
        if (this.isEmpty()) {
            return null;
        } else {
            EmployeeNode removedNode = this.head;
            if (this.head.getNext() == null) {
                this.tail = null;
            } else {
                this.head.getNext().setPrevious((EmployeeNode)null);
            }

            this.head = this.head.getNext();
            --this.size;
            removedNode.setNext((EmployeeNode)null);
            return removedNode;
        }
    }

    public EmployeeNode removeFromEnd() {
        if (this.isEmpty()) {
            return null;
        } else {
            EmployeeNode removedNode = this.tail;
            if (this.tail.getPrevious() == null) {
                this.head = null;
            } else {
                this.tail.getPrevious().setNext((EmployeeNode)null);
            }

            this.tail = this.tail.getPrevious();
            --this.size;
            removedNode.setPrevious((EmployeeNode)null);
            return removedNode;
        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void printList() {
        EmployeeNode current = this.head;
        System.out.print("HEAD -> ");

        while(current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }

        System.out.println("null");
    }
}
