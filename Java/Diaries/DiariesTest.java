import CustomException.DuplicateEntryException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiariesTest {

    @Test
    public void testThatDiariesExist() {
        Diaries diaries = new Diaries();

        assertNotNull(diaries);
    }

    @Test
    public void testThatDiariesIsEmpty() {
        Diaries diaries = new Diaries();

        assertNotNull(diaries);
    }


    @Test
    public void testThatDiaryCanBeAdded(){

        Diaries diaries = new Diaries();
        diaries.addDiary("Enechojo", "2356");

        assertEquals(1, diaries.getNumberOfEntry());
    }

    @Test
    public void testThatAddedDiaryCannotBeAddedTwice(){

        Diaries diaries = new Diaries();
        diaries.addDiary("Enechojo", "2356");
        diaries.addDiary("Enechojo", "2356");


        assertThrows(DuplicateEntryException.class, ()-> diaries.addDiary("Enechojo", "2356"));

    }
}
