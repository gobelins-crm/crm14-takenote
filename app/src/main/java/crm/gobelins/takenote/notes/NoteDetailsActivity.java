package crm.gobelins.takenote.notes;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import crm.gobelins.takenote.R;

public class NoteDetailsActivity extends ActionBarActivity {
    public static final String NOTE_ID = "noteId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_details_note);

        int noteId = getIntent().getIntExtra(NOTE_ID, 0);
        Note note = NotesManager.getInstance().getNoteById(noteId);

        TextView title = (TextView) findViewById(R.id.note_details_title);
        TextView text = (TextView) findViewById(R.id.note_details_text);

        title.setText(note.getTitle());
        text.setText(note.getText());
    }
}
