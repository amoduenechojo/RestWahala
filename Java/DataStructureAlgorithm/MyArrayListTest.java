//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MyArrayListTest {
//
//
//    @Test
//    public void testThatArrayList_isEmpty(){
//
//        MyArrayList list = new MyArrayList();
//
//        assertTrue(list.isEmpty());
//    }
//
//    @Test
//    public void testThatArrayList_isEmpty_sizeIsZero(){
//
//        MyArrayList list = new MyArrayList();
//        list.isEmpty();
//
//        assertEquals(0, list.sizeOfList());
//    }
//
//    @Test
//    public void testThatListHasThreeElements_theSizeIncreases(){
//
//        MyArrayList list = new MyArrayList();
//
//        list.add("Really");
//        list.add("Life");
//        list.add("Bic");
//
//        assertEquals(3, list.sizeOfList());
//    }
//
//    @Test
//    public void testThatElement_canBeAdded_sizeIsOne(){
//        MyArrayList list = new MyArrayList();
//
//        list.add("Jaa");
//        assertEquals(1,list.sizeOfList());
//    }
//
//    @Test
//    public void testThatSizeOfListIsOne_elementIsAdded_sizeOfElementIsTwo(){
//        MyArrayList list = new MyArrayList();
//
//        list.add("Life");
//        list.add("Bic");
//
//        assertEquals(2, list.sizeOfList());
//    }
//
//    @Test
//    public void testThatWhenAnEmptyListIsAdded_itAssertsFalse(){
//        MyArrayList list = new MyArrayList();
//
//        boolean result = list.add("");
//        assertFalse(result);
//    }
//
//
//    @Test
//    public void testThatListContainsAnElement_elementAtTheSpecifiedIndex_isReturned(){
//        MyArrayList list = new MyArrayList();
//
//        list.add("Guitar");
//        list.add("Life");
//        list.add("Bic");
//
//        assertEquals("Guitar", list.getList(0));
//    }
//
//    @Test
//    public void testThatGettingElement_fromEmptyList_throwsException(){
//        MyArrayList list = new MyArrayList();
//
//        assertThrows(IndexOutOfBoundsException.class, ()-> list.getList(0));
//    }
//
//    @Test
//    public void testThatListContainsElement_assertTrue(){
//        MyArrayList list = new MyArrayList();
//
//        list.add("Entry");
//        assertTrue(list.contains("Entry"));
//    }
//
//    @Test
//    public void testThatListContainsElement_assertFalseWhenElementIsNot_theSameAsTheOneContained(){
//        MyArrayList list = new MyArrayList();
//
//        list.add("Entry");
//        assertFalse(list.contains("Nike"));
//    }
//
//    @Test
//    public void testThatElementsInTheListCanBeCleared_sizeOfListIsZero(){
//        MyArrayList list = new MyArrayList();
//
//        list.add("Ties");
//        list.add("Yatch");
//
//        list.clear();
//        assertEquals(0, list.sizeOfList());
//    }
//
//    @Test
//    public void testThatElementsInTheListCanBeCleared_ListIsEmpty(){
//        MyArrayList list = new MyArrayList();
//
//        list.add("Ties");
//        list.add("Yatch");
//
//        list.clear();
//        assertTrue(list.isEmpty());
//    }
//
//    @Test
//    public void testThatElementsInTheListCanBeReplaced(){
//        MyArrayList list = new MyArrayList();
//
//        list.add("Ties");
//        list.setList(0, "Yatch");
//
//        assertEquals("Yatch", list.getList(0));
//    }
//
//
//    @Test
//    public void testThatSetReturnsFalse_whenIndexDoesNOtExist(){
//
//        MyArrayList list = new MyArrayList();
//
//        String result = list.setList(0, "Python");
//
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testThatDuplicateElementIsAllowed_sizeIsIncreased(){
//
//        MyArrayList list = new MyArrayList();
//
//           list.add("Yuri");
//           list.add("Yuri");
//           list.add("Yuri");
//
//           assertEquals(3, list.sizeOfList());
//    }
//
//
//    @Test
//    public void testThatListContainsAnElement_elementCanBeRemoved(){
//
//        MyArrayList list = new MyArrayList();
//
//        list.contains("Java");
//        assertTrue(list.remove("Java"));
//    }
//
//    @Test
//    public void testThatNonExistingElementCannotBeRemoved_returnsFalse(){
//
//            MyArrayList list = new MyArrayList();
//
//            list.add("Java");
//
//            assertFalse(list.remove("Python"));
//
//            assertEquals(1, list.sizeOfList());
//            assertTrue(list.contains("Java"));
//        }
//}
//
