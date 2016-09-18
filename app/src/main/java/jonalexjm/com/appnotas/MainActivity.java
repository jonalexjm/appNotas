package jonalexjm.com.appnotas;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

import jonalexjm.com.appnotas.adaptador.NotaAdaptador;
import jonalexjm.com.appnotas.adaptador.PageAdaptador;
import jonalexjm.com.appnotas.fragment.NotaFragment;
import jonalexjm.com.appnotas.fragment.NotasRecyclerViewFragment;
import jonalexjm.com.appnotas.pojo.Nota;

public class MainActivity extends AppCompatActivity {

    ArrayList<Nota> notas;
    private RecyclerView rvNota;
    public NotaAdaptador adaptador;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        seUpViewPager();





        if(toolbar != null){
            setSupportActionBar(toolbar);
        }
    }

    private ArrayList<Fragment> agregarFragment(){//agregar los fragment al arreglo
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new NotasRecyclerViewFragment());
        fragments.add(new NotaFragment());

        return fragments;
    }

    private void seUpViewPager(){//pone en orbita los fragments
        viewPager.setAdapter(new PageAdaptador(getSupportFragmentManager(), agregarFragment()));
        tabLayout.setupWithViewPager(viewPager);

       tabLayout.getTabAt(0).setIcon(R.drawable.verlista);//agregar imagenes al tap
        tabLayout.getTabAt(1).setIcon(R.drawable.vertodos);

    }





}
