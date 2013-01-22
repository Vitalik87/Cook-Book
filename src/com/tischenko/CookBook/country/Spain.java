package com.tischenko.CookBook.country;

import com.tichenko.prepare.R;
import com.tischenko.CookBook.main.Recipe;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Spain extends Activity implements OnClickListener { 
	Button recipei;
	public Spain(){
	
		setContentView(R.layout.recipe);
	
	Button RecipeI = (Button) findViewById(R.id.main_recipe);
	RecipeI.setOnClickListener((OnClickListener) this);
	 
 }	

	 public void onClick(View v) {
		   Intent intent2 = new Intent(Spain.this, Recipe.class);
		   startActivity(intent2);
	 }

	public static void setOnClickListener(OnClickListener onClickListener) {
		// TODO Auto-generated method stub
		
	}
	}
