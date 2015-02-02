package crm.gobelins.takenote.appinfo;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import crm.gobelins.takenote.BuildConfig;
import crm.gobelins.takenote.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AppInfoFragment extends Fragment {


    public AppInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_app_info, container, false);

        if (null == savedInstanceState) {
            TextView versionTv = (TextView) view.findViewById(R.id.app_version);
            String versionInfo = getActivity().getString(R.string.app_version, BuildConfig.VERSION_NAME, BuildConfig.VERSION_CODE);
            versionTv.setText(versionInfo);
        }

        return view;
    }


}
