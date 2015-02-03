package crm.gobelins.takenote.notes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NotesManager {
    private static NotesManager sInstance;
    private List<Note> mNotes;
    private HashMap<Integer, Note> mNotesByID;

    private NotesManager() {
        mNotes = new ArrayList<>();
        mNotesByID = new HashMap<>();

        for (int i = 0; i < 255; i += 1) {
            Note note = new Note(i, "title " + i, "text " + i);
            mNotes.add(note);
            mNotesByID.put(i, note);
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

    public Note getNoteById(int ID) {
        return mNotesByID.get(ID);
    }
}
