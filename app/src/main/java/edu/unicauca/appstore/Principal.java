
package edu.unicauca.appstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {
    FragmentTransaction transaction;


    Fragment fragInicio, fragPromo, fragFav, fragPago, fragMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        fragInicio = new InicioFragment();
        fragPromo = new PromoFragment();
        fragFav = new FavoritoFragment();
        fragPago = new PagoFragment();
        fragMenu = new MenuFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragment, fragInicio).commit();

    }

    public void OnClick(View view) {
        transaction=getSupportFragmentManager().beginTransaction();
        switch (view.getId())
        {
            case R.id.cardPromos: transaction.replace(R.id.contenedorFragment,fragInicio);
                transaction.addToBackStack(null);
                break;
            case R.id.cardFav: transaction.replace(R.id.contenedorFragment,fragFav);
                transaction.addToBackStack(null);
                break;
            case R.id.cardPago: transaction.replace(R.id.contenedorFragment,fragPago);
                transaction.addToBackStack(null);
                break;
            case R.id.cardMenu: transaction.replace(R.id.contenedorFragment,fragMenu);
                transaction.addToBackStack(null);
                break;
        }

        transaction.commit();







    }





}