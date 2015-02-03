package crm.gobelins.takenote.notes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import crm.gobelins.takenote.R;

public class NotesActivity extends ActionBarActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On récupère le layout et l'utilise comme vue de l'activity
        setContentView(R.layout.activity_notes);

        // On récupère un tableau de données en dur
        List<Note> datas = NotesManager.getInstance().getAllNotes();
        // On créé l'adapter pour notre listView
        final ArrayAdapter<Note> listAdapter = new NoteAdapter(this, datas);

        // On récupère une référence vers notre listView
        ListView list = (ListView) findViewById(R.id.list_notes);
        // On lie l'adapter avec la liste
        list.setAdapter(listAdapter);

        // on ajoute l'écouteur pour les click sur les items de la liste
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Note note = listAdapter.getItem(position);
                Log.i(TAG, String.valueOf(note.getID()));

                Intent intent = new Intent(NotesActivity.this, NoteDetailsActivity.class);
                intent.putExtra(NoteDetailsActivity.NOTE_ID, note.getID());

                startActivity(intent);
            }
        });
    }
}
