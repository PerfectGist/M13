package com.example.projectem13.controller;

import com.example.projectem13.R;
import com.example.projectem13.R.layout;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Login_ctrl extends Activity {
	EditText etUser,etPass;
	Button btLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);
        
        btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				//if(login()){				 	
				 	Intent intent = new Intent(getBaseContext(),Principal_ctrl.class);
				 	startActivity(intent);
				//}
				
			}});
        
    }
    public boolean login (){
		return true;    	
    }
}
