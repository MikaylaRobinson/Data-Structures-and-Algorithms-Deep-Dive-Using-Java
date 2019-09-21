import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    // Add item to the top of the stack
    public void push(Employee employee) {
        stack.push(employee);
    }

    // Remove the top item on the stack
    public Employee pop() {
        return stack.pop();
    }

    // View the top item on the stack
    public Employee peek() {
        return stack.peek();
    }

    // Checking if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}