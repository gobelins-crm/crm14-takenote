package crm.gobelins.takenote.notes;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import crm.gobelins.takenote.R;

public class NotesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On récupère le layout et l'utilise comme vue de l'activity
        setContentView(R.layout.activity_notes);

        // On récupère une référence vers notre listView
        ListView list = (ListView) findViewById(R.id.list_notes);

        // On récupère un tableau de données en dur
        List<Note> datas = NotesManager.getInstance().getAllNotes();

        // On créé l'adapter pour notre listView
        ArrayAdapter<Note> listAdapter = new NoteAdapter(this, datas);

        // On lie l'adapter avec la liste
        list.setAdapter(listAdapter);
    }
}
