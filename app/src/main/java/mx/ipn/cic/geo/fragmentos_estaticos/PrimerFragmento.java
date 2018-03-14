package mx.ipn.cic.geo.fragmentos_estaticos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PrimerFragmento extends Fragment {
    public static PrimerFragmento newInstance()
    {
        return new PrimerFragmento();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_primer_fragmento, container, false);
    }
}
