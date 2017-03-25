package com.example.allen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.meun_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.next:
            Intent intent = new Intent();
                intent.setClass(MainActivity.this, Activity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", "backtext".toString());
                intent.putExtras(bundle);
                startActivityForResult(intent,0);
                Toast.makeText(this, "切換為Activity2，成功！！", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        switch(resultCode){
            case RESULT_OK:
                Bundle bundle = data.getExtras();
                break;
            default:
                break;

        }
    }
}
