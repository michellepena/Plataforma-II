package com.example.michelle.listview;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lblEtiqueta;
    private ListView lstOpciones;
    private Titular[] datos=
            new Titular[]{
                    new Titular ("Titulo 1", "Subtitulo largo 1"),
                    new Titular ("Titulo 2", "Subtitulo largo 2"),
                    new Titular ("Titulo 3", "Subtitulo largo 3"),
                    new Titular ("Titulo 4", "Subtitulo largo 4"),
                    new Titular ("Titulo 5", "Subtitulo largo 5"),
                    new Titular ("Titulo 6", "Subtitulo largo 6"),
                    new Titular ("Titulo 7", "Subtitulo largo 7"),
                    new Titular ("Titulo 8", "Subtitulo largo 8"),
                    new Titular ("Titulo 9", "Subtitulo largo 9"),
                    new Titular ("Titulo 10", "Subtitulo largo 10"),
                    new Titular ("Titulo 11", "Subtitulo largo 11"),
                    new Titular ("Titulo 12", "Subtitulo largo 12"),
                    new Titular ("Titulo 13", "Subtitulo largo 13"),
                    new Titular ("Titulo 14", "Subtitulo largo 14"),
                    new Titular ("Titulo 15", "Subtitulo largo 15"),


            };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        lblEtiqueta=(TextView) findViewById(R.id.lblEtiqueta);
        lstOpciones = (ListView)findViewById(R.id.lstOpciones);

        class AdaptadorTitulares extends ArrayAdapter<MainActivity.Titular>{
            AdaptadorTitulares(Context context, MainActivity.Titular[] datos){
                super(context, R.layout.second_activity,datos);
            }
            public View getView(int position, View convertView, ViewGroup parent){
                View item = convertView;
                ViewHolder holder;
                if (item==null){
                    LayoutInflater inflater = LayoutInflater.from(getContext());
                    item= inflater.inflate(android.R.layout.second_activity, null);
                    holder=new ViewHolder();
                    holder.titulo=(TextView)item.findViewById(R.id.lblTitulo);
                    holder.subtitulo = (TextView)item.findViewById(R.id.lblSubtitulo);
                    item.setTag(holder);
                }
                else{
                    holder=(RecyclerView.ViewHolder)item.getTag();

                }
                holder.titulo
            }
        }
    }
    public class Titular{
        private String titulo;
        private String subtitulo;

        public Titular(String tit, String sub){
            titulo=tit;
            subtitulo= sub;
        }
        public String getTitulo(){
            return titulo;
        }
        public String getSubtitulo(){

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

