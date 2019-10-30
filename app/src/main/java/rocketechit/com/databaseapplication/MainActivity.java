package rocketechit.com.databaseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(this);
//        databaseAccess.open();
        String name  = databaseAccess.getAddress("Tamim");
        Toast.makeText(this, ""+name, Toast.LENGTH_SHORT).show();

    }
}
