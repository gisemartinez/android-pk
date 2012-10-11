package com.example.parking.gise;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	//agrego esto del ejemplo connect mysql y php
	Button btnService;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buttons
        btnService= (Button) findViewById(R.id.btnService);
        //lo que ocurre al hacer click
        btnService.setOnClickListener(new View.OnClickListener() {
        	
			
			@Override
			public void onClick(View v) {
				// copiado derecho del ejemplo,modificar para q coincida con un servicio
				//es decir ,tengo q hacer un activity q muestre lo de esa clase
				Intent i= new Intent(getApplicationContext(),ServiceActivity.class);
				startActivity(i);
			}
		});
              
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
