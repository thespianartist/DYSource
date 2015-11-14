package platzi.com.miprimeraaplicacion;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        Toolbar barritadearriba = (Toolbar) findViewById(R.id.barrita);
        setSupportActionBar(barritadearriba);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        Button boton = (Button) findViewById(R.id.button);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "HOLAAAAAA", Snackbar.LENGTH_LONG).show();
            }
        });

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Boton2", Snackbar.LENGTH_LONG).show();
            }
        });

    }

}
