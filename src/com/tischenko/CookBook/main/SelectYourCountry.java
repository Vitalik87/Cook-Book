package com.tischenko.CookBook.main;

import com.tichenko.prepare.R;
import com.tischenko.CookBook.country.France;
import com.tischenko.CookBook.country.Germany;
import com.tischenko.CookBook.country.Greece;
import com.tischenko.CookBook.country.Italy;
import com.tischenko.CookBook.country.Portugal;
import com.tischenko.CookBook.country.Russia;
import com.tischenko.CookBook.country.Spain;
import com.tischenko.CookBook.country.Ukraine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SelectYourCountry extends Activity implements OnClickListener {  
	
	Button btnFrance;
	Button btnItaly;
	Button btnGermany;
	Button btnSpain;
	Button btnUkraine;
	Button btnRussia;
	Button btnGreece;
	Button btnPortugal;     
	 protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState); 
	     setContentView(R.layout.activity_main);     
	 
	   btnFrance = (Button)findViewById(R.id.france_main);
	   btnFrance.setOnClickListener(this);
	   btnPortugal = (Button)findViewById(R.id.portugal_main);
	   btnPortugal.setOnClickListener(this);
	   btnSpain = (Button)findViewById(R.id.spain_main);
	   btnSpain.setOnClickListener(this);
	   btnGermany = (Button)findViewById(R.id.germany_main);
	   btnGermany.setOnClickListener(this);
	   btnGreece = (Button)findViewById(R.id.greece_main);
	   btnGreece.setOnClickListener(this);
	   btnUkraine = (Button)findViewById(R.id.ukraine_main);
	   btnUkraine.setOnClickListener(this);
	   btnRussia = (Button)findViewById(R.id.russia_main);
	   btnRussia.setOnClickListener(this);
	   btnItaly = (Button)findViewById(R.id.italy_main);
	   btnItaly.setOnClickListener(this);	  
} 	
	   public void onClick(View v) {
		   Intent France = new Intent(SelectYourCountry.this, France.class);
		   startActivity(France);	 
		   Intent Portugal = new Intent(SelectYourCountry.this, Portugal.class);
		   startActivity(Portugal);
		   Intent Spain = new Intent(SelectYourCountry.this, Spain.class);
		   startActivity(Spain);
		   Intent Germany = new Intent(SelectYourCountry.this, Germany.class);
		   startActivity(Germany);
		   Intent Greece = new Intent(SelectYourCountry.this, Greece.class);
		   startActivity(Greece);
		   Intent Ukraine = new Intent(SelectYourCountry.this, Ukraine.class);
		   startActivity(Ukraine);
		   Intent Russia = new Intent(SelectYourCountry.this, Russia.class);
		   startActivity(Russia);
		   Intent Italy = new Intent(SelectYourCountry.this, Italy.class);
		   startActivity(Italy);
	   }
	 }