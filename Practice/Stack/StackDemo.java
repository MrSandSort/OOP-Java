package Practice.Stack;

public class StackDemo {
    public static void main(String[] args) {
        ScratchStack st= new ScratchStack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Top Element: "+ st.peek());
        System.out.println("Popped: "+ st.pop());
        System.out.println("Top Element: "+ st.peek());
        st.displayStack();
    }

}
