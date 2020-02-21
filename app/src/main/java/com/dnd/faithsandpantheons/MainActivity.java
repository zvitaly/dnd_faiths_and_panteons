package com.dnd.faithsandpantheons;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.dnd.faithsandpantheons.adapters.FaithsAndPantheonsAdapter;
import com.dnd.faithsandpantheons.items.FaithsAndPantheonsItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView faithsAndPantheonsList;
    private FaithsAndPantheonsAdapter faithsAndPantheonsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        faithsAndPantheonsList = findViewById(R.id.faiths_and_pantheons_list);
        FaithsAndPantheonsAdapter faithsAndPantheonsAdapter = new FaithsAndPantheonsAdapter(initData());
        faithsAndPantheonsList.setAdapter(faithsAndPantheonsAdapter);
        faithsAndPantheonsList.setHasFixedSize(false);
        faithsAndPantheonsList.setLayoutManager(new LinearLayoutManager(this));
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
        switch (id) {
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, getString(R.string.action_settings), Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<FaithsAndPantheonsItem> initData(){
        List<FaithsAndPantheonsItem> list = new ArrayList<FaithsAndPantheonsItem>();

        list.add(new FaithsAndPantheonsItem("Азут (Azuth)","Законно-нейтральное"));
        list.add(new FaithsAndPantheonsItem("Бэйн (Bane)","Законно-злое"));
        list.add(new FaithsAndPantheonsItem("Чонти (Chauntea)","Нейтрально-доброе"));
        list.add(new FaithsAndPantheonsItem("Цирик (Cyric)","Хаотично-злое"));
        list.add(new FaithsAndPantheonsItem("Илистри (Eilistraee)","Хаотично-доброе"));

        return list;
    }
}
