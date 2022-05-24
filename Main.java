
public class Main {

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        System.out.printf("Stack empty? [%b]\n", stk.isEmpty()); // [true]

        stk.push(14);
        stk.push(28);
        stk.push(35);
        stk.printStack(); // Top -> [35] -> [28] -> [14] <- Tail

        System.out.printf("Popped -> [%s]\n", stk.pop()); // [35]
        System.out.printf("Stack empty? [%b]\n", stk.isEmpty()); // [false]
        stk.printStack(); // Top -> [28] -> [14] <- Tail
        System.out.printf("Peeked -> [%s]\n", stk.peek()); // [28]
        System.out.printf("Stack empty? [%b]\n", stk.isEmpty()); // [false]
        stk.printStack(); // Top -> [28] -> [14] <- Tail
        System.out.printf("Popped -> [%s]\n", stk.pop()); // 28
        System.out.printf("Popped -> [%s]\n", stk.pop()); // 14
        System.out.printf("Popped -> [%s]\n", stk.pop()); // exception here
    }
    
}