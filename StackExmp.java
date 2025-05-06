import java.util.Scanner;
import java.util.Stack;

public class StackExmp {

    Stack<Integer> intStack = new Stack<>();

    // a. Push elements onto the stack
    void pushElement(int value) {
        intStack.push(value);
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // b. Pop elements from the stack
    void popElement() {
        if (!intStack.isEmpty()) {
            int poppedValue = intStack.pop();
            System.out.println("Popped " + poppedValue + " from the stack.");
        } else {
            System.out.println("Stack is empty. Nothing to pop.");
        }
    }

    // c. Check if the stack is empty
    void checkIfEmpty() {
        if (intStack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is NOT empty.");
        }
    }

    public static void main(String[] args) {
        StackExmp obj = new StackExmp();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Check if stack is empty");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to push: ");
                    int value = sc.nextInt();
                    obj.pushElement(value);
                    break;
                case 2:
                    obj.popElement();
                    break;
                case 3:
                    obj.checkIfEmpty();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
