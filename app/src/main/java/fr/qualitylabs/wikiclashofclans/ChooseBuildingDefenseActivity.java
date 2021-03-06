package fr.qualitylabs.wikiclashofclans;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class ChooseBuildingDefenseActivity extends ActionBarActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    Building building = new Building();

    CardView cannon;
    CardView archerTower;
    CardView mortar;
    CardView airDefense;
    CardView wizardTower;
    CardView hiddenTesla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_building_defense);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cannon = (CardView) findViewById(R.id.cannon);
        archerTower = (CardView) findViewById(R.id.archer_tower);
        mortar = (CardView) findViewById(R.id.mortar);
        airDefense = (CardView) findViewById(R.id.air_defense);
        wizardTower = (CardView) findViewById(R.id.wizard_tower);
        hiddenTesla = (CardView) findViewById(R.id.hidden_tesla);

        cannon.setOnClickListener(cannonListener);
        archerTower.setOnClickListener(archerTowerListener);
        mortar.setOnClickListener(mortarListener);
        airDefense.setOnClickListener(airDefenseListener);
        wizardTower.setOnClickListener(wizardTowerListener);
        hiddenTesla.setOnClickListener(hiddenTeslaListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_building_defense, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    //    Ouverture de l'activité DescribeTroopActivity pour décrire chaque personnage
    private View.OnClickListener cannonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingDefenseActivity.class);
            building = new Cannon();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener archerTowerListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingDefenseActivity.class);
            building = new ArcherTower();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener mortarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingDefenseActivity.class);
            building = new Mortar();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener airDefenseListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingDefenseActivity.class);
            building = new AirDefense();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener wizardTowerListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingDefenseActivity.class);
            building = new WizardTower();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener hiddenTeslaListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingDefenseActivity.class);
            building = new HiddenTesla();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };
}
