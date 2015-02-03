package crm.gobelins.takenote.notes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import crm.gobelins.takenote.R;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class NoteAdapter extends ArrayAdapter<Note> {

    private final LayoutInflater mInflater;

    public NoteAdapter(Context context, List<Note> datas) {
        super(context, R.layout.row_note, datas);
        mInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // On crée la vue pour une note dans la liste
        View view = mInflater.inflate(R.layout.row_note, parent, false);

        // On récupère la note correspondant à la position actuelle dans la liste
        Note note = getItem(position);

        // On affiche les valeurs de la note dans la vue
        TextView title = (TextView) view.findViewById(R.id.note_title);
        TextView text = (TextView) view.findViewById(R.id.note_text);

        title.setText(note.getTitle());
        text.setText(note.getText());

        return view;
    }
}
