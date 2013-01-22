package com.tischenko.CookBook.data;


import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class CuisineRepository_I {
	List<Cuisine> mList;;
	private String[] Italy;
	private String[] Spain;
	private String[] Ukraine;
	private String[] Russia;
	private String[] France;
	private String[] Germany;
	private String[] Portugal;
	Cursor cursor;
// 	rawQuery - запрос Ѕƒ,query
	SQLiteDatabase db;

	CuisineRepository_I (long id) {	
	Cursor c1 = db.rawQuery("gotov",Italy);
	Cursor c2 = db.rawQuery("gotov",Spain);	
	Cursor c3 = db.rawQuery("gotov",Ukraine);
	Cursor c4 = db.rawQuery("gotov",Russia);
	Cursor c5 = db.rawQuery("gotov",France);
	Cursor c6 = db.rawQuery("gotov",Germany);
	Cursor c7 = db.rawQuery("gotov",Portugal);
	return;
	}
//добавл€ю их в колекцию
	
//	List <Cuisine> getCuisines() {
//		List<Cuisine> mList;
//		mList.add(Italy);
//		mList.add(Germany);
//		mList.add(Spain);
//		mList.add(Ukraine);
//		mList.add(Russia);
//		mList.add(France);
//		mList.put(Portugal);
//		return null;
//		 }	
}


