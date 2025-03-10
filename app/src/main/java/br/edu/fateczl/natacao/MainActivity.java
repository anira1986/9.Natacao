/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */

package br.edu.fateczl.natacao;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layout_principal), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            carregaFragment(bundle);
        }
    }

    private void carregaFragment(Bundle bundle) {
        String tipoAtleta = bundle.getString("tipoAtleta");
        switch (tipoAtleta) {
            case "Juvenil":
                fragment = new JuvenilNadadorFragment();
                break;
            case "Senior":
                fragment = new NadadorSeniorFragment();
                break;
            case "Pleno":
                fragment = new NadadorPlenoFragment();
                break;
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.conteudo_fragmento, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Bundle bundle = new Bundle();
        Intent i = new Intent(this, MainActivity.class);

        if (id == R.id.item_juvenil) {
            bundle.putString("tipoAtleta", "Juvenil");
            i.putExtras(bundle);
            startActivity(i);
            finish();
            return true;
        }
        if (id == R.id.item_senior) {
            bundle.putString("tipoAtleta", "Senior");
            i.putExtras(bundle);
            startActivity(i);
            finish();
            return true;
        }
        if (id == R.id.item_diversos) {
            bundle.putString("tipoAtleta", "Pleno");
            i.putExtras(bundle);
            startActivity(i);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
