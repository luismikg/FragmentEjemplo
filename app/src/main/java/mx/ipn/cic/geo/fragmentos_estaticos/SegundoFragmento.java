package mx.ipn.cic.geo.fragmentos_estaticos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SegundoFragmento extends Fragment {
    public static SegundoFragmento newInstance()
    {
        return new SegundoFragmento();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_segundo_fragmento, container, false);
    }
}
