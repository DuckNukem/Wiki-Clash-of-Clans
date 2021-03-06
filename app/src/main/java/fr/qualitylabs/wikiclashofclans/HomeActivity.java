package fr.qualitylabs.wikiclashofclans;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class HomeActivity extends ActionBarActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    RelativeLayout troop;
    RelativeLayout batiments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        //        Initialisation et définition du Drawer
        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer); // Initialisation du Drawer
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar); // Définit les actions, paramètres, méthodes... du Drawer

        troop = (RelativeLayout) findViewById(R.id.troop);
        batiments = (RelativeLayout) findViewById(R.id.batiments_bouton);

        troop.setOnClickListener(troopListener);
        batiments.setOnClickListener(batimentsListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            startActivity(new Intent(this, AboutActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    private View.OnClickListener troopListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseTroopTypeActivity.class));
        }
    };

    private View.OnClickListener batimentsListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseBuildingTypeActivity.class));
        }

    };
}
