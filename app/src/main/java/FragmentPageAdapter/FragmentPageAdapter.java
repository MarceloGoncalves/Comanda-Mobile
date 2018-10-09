package FragmentPageAdapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.lucas.comanda_mobile.AgardandoFragment;
import com.example.lucas.comanda_mobile.HistoricoFragment;
import com.example.lucas.comanda_mobile.PedidoFragment;

public class FragmentPageAdapter extends FragmentPagerAdapter {
    private String[] tabTitulos;

    public FragmentPageAdapter(FragmentManager fm, String[] tabTitulos) {
        super(fm);
        this.tabTitulos = tabTitulos;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new PedidoFragment();
            case 1:
                return new AgardandoFragment();
            case 2:
                return new HistoricoFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.tabTitulos.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return this.tabTitulos[position];
    }
}
