import java.util.ArrayList;

public class Diaries {
    private ArrayList<Diary> diaries = new ArrayList<>();


    public void addDiary(String username, String password) {

        Diary newDiary = new Diary(username, password);
        diaries.add(new Diary("Enechojo", "2356"));

    }

    public int getNumberOfEntry() {
        return diaries.size();
    }


}
