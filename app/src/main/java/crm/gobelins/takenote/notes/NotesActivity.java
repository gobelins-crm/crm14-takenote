package crm.gobelins.takenote.notes;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import crm.gobelins.takenote.R;

public class NotesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On récupère le layout et l'utilise comme vue de l'activity
        setContentView(R.layout.activity_notes);

        // On récupère une référence vers notre listView
        ListView list = (ListView) findViewById(R.id.list_notes);

        // On créé un tableau de données en dur
        ArrayList<String> datas = new ArrayList<>();
        for (int i = 0; i < 255; i += 1) {
            datas.add("Note: " + i);
        }

        // On créé l'adapter pour notre listView
        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(
                this, // le contexte
                R.layout.note, // le layout pour chaque item de la liste
                R.id.note_title, // l'id de l'élément qui reçoit les données
                datas // les données de l'adapter
        );

        // On lie l'adapter avec la liste
        list.setAdapter(listAdapter);
    }
}
