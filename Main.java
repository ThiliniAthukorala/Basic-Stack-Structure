public class Main {
    public static void main(String[] args) {
        Stack s=new Stack();

        s.push(1);
        s.push(3);
        s.push(34);
        s.push(0);

        s.display();
        s.pop();
        s.display();
        s.peek();

    }
}
