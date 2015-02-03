package crm.gobelins.takenote.notes;

import java.util.ArrayList;
import java.util.List;

public class NotesManager {
    private static NotesManager sInstance;
    private List<Note> mNotes;

    private NotesManager() {
        mNotes = new ArrayList<>();
        for (int i = 0; i < 255; i += 1) {
            mNotes.add(new Note(i, "title " + i, "text " + i));
        }
    }

    public static NotesManager getInstance() {
        if (null == sInstance) {
            sInstance = new NotesManager();
        }
        return sInstance;
    }

    public List<Note> getAllNotes() {
        return mNotes;
    }
}
