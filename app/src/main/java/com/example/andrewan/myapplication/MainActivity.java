package com.example.andrewan.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.main_fab)
    FloatingActionButton mMainFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_trending:
                confirmExit();
                return true;
            case R.id.action_notifiable:
                Toast.makeText(MainActivity.this, "action_notifiable", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void confirmExit() {
        Snackbar.make(mMainFab, getString(R.string.tips_exit), Snackbar.LENGTH_SHORT).setAction(getString(R.string.tips_yes), new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }).show();


    }

    @OnClick(R.id.main_fab)
    public void onClick() {
        confirmExit();
    }
}
