import customException.EmptyStackException;

public class MyStack {

        private boolean isEmpty;
        private int top = 0;
        private int bottom = 0;

        int[] stack = new int[10];


    public boolean IsEmpty() {
       return top == 0;
    }

    public int push(int element){
        stack[top] = element;
        top++;
       return element;
    }



    public int getSizeOfStack() {
            return top;
    }


    public int pop() {
        if(IsEmpty()){
            throw new EmptyStackException("Stack is Empty");
        }
            return stack[top--];

    }

    public int peek() {
        return stack[--top];
    }


    public boolean search(int element){
        for(int count = 0; count < top; count++){
            if(stack[count] == element){
                return true;
            }
        }
        return false;
    }
}