package com.tischenko.CookBook.country;

import com.tichenko.prepare.R;
import com.tischenko.CookBook.main.Recipe;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class France extends Activity implements OnClickListener { 
	Button recipe;
	public France(){
	
		setContentView(R.layout.recipe);
	
	Button Recipe = (Button) findViewById(R.id.main_recipe);
	Recipe.setOnClickListener((OnClickListener) this);
	 
 }	

	 public void onClick(View v) {
		   Intent intent2 = new Intent(France.this, Recipe.class);
		   startActivity(intent2);
	 }

	public static void setOnClickListener(OnClickListener onClickListener) {
		// TODO Auto-generated method stub
		
	}
	}
