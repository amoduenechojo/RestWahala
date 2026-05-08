import org.junit.jupiter.api.Test;

//import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {


    @Test
    public void testThatStackExists(){
        MyStack myStack = new MyStack();

        assertNotNull(myStack);
    }


    @Test
    public void testThatStackIsEmpty(){
        MyStack myStack = new MyStack();
        assertTrue(myStack.IsEmpty());
    }



    @Test
    public void testThatStackCanPushElements(){
        MyStack myStack = new MyStack();
        myStack.push(2);
        assertFalse(myStack.IsEmpty());

        assertEquals(1, myStack.getSizeOfStack());
    }


    @Test
    public void testThatWhenMyStackIsEmpty_myStackCanAddElementsInIt(){
        MyStack myStack = new MyStack();
        myStack.IsEmpty();

        myStack.push(4);

        assertFalse(myStack.IsEmpty());
        assertEquals(1, myStack.getSizeOfStack());
    }



    @Test
    public void testThatWhenMyStackIsEmpty_itCannotRemoveElementsInTheStack(){
        MyStack myStack = new MyStack();
        myStack.IsEmpty();

        myStack.push(2);
        myStack.pop();

        assertEquals(0, myStack.getSizeOfStack());
    }


    @Test
    public void testThaMyStack_canLookIntoTheFirstElement_inTheStack() {
        MyStack myStack = new MyStack();
        assertTrue(myStack.IsEmpty());

        myStack.push(8);
        assertEquals(8, myStack.peek());
//        assertEquals(1, myStack.getSizeOfStack());
    }

    @Test
    public void testPeekReturnsTopWithoutRemoving() {
        MyStack myStack = new MyStack();
        assertTrue(myStack.IsEmpty());

        myStack.push(6);


        assertEquals(6,  myStack.peek());

    }

    @Test
    public void testThatMyStackCanBeSearched(){

        MyStack myStack = new MyStack();
        assertTrue(myStack.IsEmpty());

        myStack.push(10);
        myStack.push(8);
        myStack.push(5);

        assertTrue(myStack.search(8));
    }

    @Test
    public void testThatMyStackCannotSearchAStackThatIsNOtExisting(){

        MyStack myStack = new MyStack();


        myStack.push(10);
        myStack.push(20);
        myStack.push(8);
        myStack.push(4);


        assertTrue(myStack.search(20));
    }
}