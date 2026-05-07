import CustomException.EntryNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {


    @Test
    public void testThatUserHasADiary(){

        Diary myDiary = new Diary("Deborah", "7745");

        assertNotNull(myDiary);
    }



    @Test
    public void testThatDiaryIsEmpty() {

        Diary myDiary = new Diary("Inikpi", "5678");

        assertNotNull(myDiary);
    }


    @Test
    public void testThatWhenDiaryIsCreated_diaryIsLocked(){

        Diary myDiary = new Diary("Enechojo", "3456");

        assertFalse(myDiary.isLocked());
    }


    @Test
    public void testThatDiaryIsLocked_UnlockDiary_diaryIsUnlocked(){

        Diary myDiary = new Diary("Afor", "1234");

        assertFalse(myDiary.isLocked());
        myDiary.lockDiary();

        myDiary.unlockDiary("1234");
    }


    @Test
    public void testThatDiaryIsLocked_unlockDiary_diaryIsUnlocked(){

        Diary myDiary = new Diary("Afor", "1234");

        assertFalse(myDiary.isLocked());
        myDiary.lockDiary();

        myDiary.unlockDiary("1234");
    }


    @Test
    public void testThatEntryIsCreated(){

        Diary myDiary = new Diary("Ejura", "3451");
        myDiary.createEntry("The Smart Money Woman.", "Being financially broke is a disease!");

        assertEquals(1, myDiary.getNumberOfEntry());

    }


    @Test
    public void testThatDiaryHasOneEntry_addAnotherEntryToTheEntryCreated_sizeOfEntryIsTwo() {

        Diary myDiary = new Diary("Eneojo", "4567");
        Entry myEntry = new Entry(4, "ManCity and Their Wins", "Manchester City has won 1588 cups so far!");

        myDiary.createEntry("Big Head", "Makinde is assumed the head of department because of the shape of his head.");
        myDiary.createEntry("Water bottle", "Water bottle hold water.");


        assertEquals(2, myDiary.getNumberOfEntry());
    }



    @Test
    public void testThatWeCanDeleteEntryById(){

        Diary myDiary = new Diary("Ocheja", "1215");


        myDiary.createEntry("Sad", "The state of not being happy.");
        myDiary.unlockDiary("1234");

        myDiary.deleteEntry(1);

        assertEquals(0, myDiary.getNumberOfEntry());
    }


    @Test
    public void testThatEntryCannotBeDeleted_whenAnEntryDoesNotExist(){

        Diary myDiary = new Diary("Ocheja", "1215");
        myDiary.unlockDiary("1215");

        myDiary.createEntry("Flowers", "They're beautiful");

        assertThrows(EntryNotFoundException.class, ()-> myDiary.deleteEntry(7));
    }


    @Test
    public void testThatExistingEntryCanBeDeleted(){

        Diary myDiary = new Diary("Ocheja", "1215");

        Entry myEntry = new Entry(1, "The Kinsmen", "They are wise.");

        myDiary.unlockDiary("1215");
        myDiary.deleteEntry(1);

        assertEquals(0, myDiary.getNumberOfEntry());
    }





    @Test
    public void testThatSameEntryCannotBeDeletedTwice(){

        Diary myDiary = new Diary("Ocheja", "1215");
        myDiary.createEntry("Hen", "They hatch eggs.");

        myDiary.deleteEntry(1);
        myDiary.deleteEntry(1);

        assertEquals(1, myDiary.getNumberOfEntry());
    }





    @Test
    public void testThatWeCanFindEntryById(){

        Diary myDiary = new Diary("Ladi", "1503");

        myDiary.createEntry("The Education System In Nigeria.",
                "Being financially broke is a disease.");

        myDiary.unlockDiary("1503");
        Entry findEntry = myDiary.findEntryById(1);

        assertEquals("The Education System In Nigeria.", findEntry.getTitle());
    }


    @Test
    public void testOneEntryIsAdded_findANonExistentEntry_assertNullWhen_nonExistentEntryIsNotFound(){

        Diary myDiary = new Diary("Eleojo", "6789");
        myDiary.createEntry("The Education System In Nigeria.", "Being financially broke is a disease.");

        myDiary.unlockDiary("6789");
        Entry findEntry = myDiary.findEntryById(2);
        assertNull(findEntry);

    }




    @Test
    public void testThatEntryCanBeUpdated(){

        Diary myDiary = new Diary("Ladi", "1503");
        Entry myEntry = new Entry(1," Educaion System In Nigeria", "There has been growth in the educational sector, although not massive but minimal.");

        myDiary.createEntry("The Window", "We can see the world throgh the window.");
        myDiary.unlockDiary("1503");

        myDiary.updateEntry(1, "The way of the Girls.", "Girls are designed to multi-task.");
        Entry updateEntry = myDiary.findEntryById(1);


        assertEquals("The way of the Girls.", updateEntry.getTitle());
        assertEquals("Girls are designed to multi-task.", updateEntry.getBody());

    }


    @Test
    public void testThatWhenAnEntryThatIsNotAdded_isUpdated_itShouldNotUpdateAnything() {

        Diary myDiary = new Diary("Ladi", "1503");

        myDiary.unlockDiary("1503");

        myDiary.createEntry("Educaion System In Nigeria", "There has been growth in the educational sector, although not massive but minimal.");

        myDiary.updateEntry(5, "Bread", "THe body is soft");

        Entry foundEntry = myDiary.findEntryById(1);

        assertEquals("Educaion System In Nigeria", foundEntry.getTitle());
        assertEquals("There has been growth in the educational sector, although not massive but minimal.", foundEntry.getBody());
    }

}
