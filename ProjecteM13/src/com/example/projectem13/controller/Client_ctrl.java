package com.example.projectem13.controller;

import com.example.projectem13.R;
import com.example.projectem13.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class Client_ctrl extends Fragment {

	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	 
	    }
	 
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                             Bundle savedInstanceState) {
	        View rootView = inflater.inflate(R.layout.client_view, container, false);
	 
	 
	        // Inflate the layout for this fragment
	        return rootView;
	    }
}
