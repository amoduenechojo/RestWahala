import CustomException.EntryNotFoundException;

import java.util.ArrayList;


public class Diary {

    private final String username;
    private final String password;
    private boolean isLocked;

    ArrayList<Entry> myEntries = new ArrayList<>();


    public Diary(String username, String password) {

        this.username = username;
        this.password = password;
    }


    public boolean isLocked() {
        return isLocked;
    }


    public void lockDiary(){
        isLocked = true;

    }



    public void unlockDiary(String password){

        if(password.equals("1234")){
            isLocked = true;
        }
    }

    public void createEntry(String title, String body) {
        int id = 1;

        Entry myEntry = new Entry(id++, title, body);
        myEntries.add(myEntry);
    }


    public int getNumberOfEntry() {
        return myEntries.size();
    }


    public void deleteEntry(int id) {

        for (Entry myEntry : myEntries){
            if (myEntry.getId() == id) {
                myEntries.remove(myEntry);
            }
            throw new EntryNotFoundException("Invalid entry.");

        }
    }




    public Entry findEntryById(int id) {
        for(Entry myEntry : myEntries){
            if(myEntry.getId() == id){
                return myEntry;
            }
        }

        return null;
    }


    public void updateEntry(int id, String title, String body) {

        for(Entry myEntry : myEntries){
            if(myEntry.getId() == id){

                myEntry.setTitle(title);
                myEntry.setBody(body);
            }
        }

    }
}



