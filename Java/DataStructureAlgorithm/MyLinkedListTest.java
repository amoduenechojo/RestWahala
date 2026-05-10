import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    public void testThatListIsEmpty() {
        MyLinkedList list = new MyLinkedList();

        assertNotNull(list.isEmpty());
    }

    @Test
    public void testThatSizeOfANewListIsZero() {
        MyLinkedList list = new MyLinkedList();

        list.isEmpty();

        assertEquals(0, list.sizeOfLinkedList());
    }

    @Test
    public void testThatAnEmptyListExists_ListIsAdded(){
        MyLinkedList list = new MyLinkedList();

        list.isEmpty();
        list.addFirst("Tigh");

        assertEquals()
    }
}