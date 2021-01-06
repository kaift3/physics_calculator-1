package com.protexcreative.physicscalapp.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.protexcreative.physicscalapp.Adapter.FormulaAdapter;
import com.protexcreative.physicscalapp.Model.Formula;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String FORMULA_TABLE = "FORMULA_TABLE";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "formula.db", null, 1);
    }

    //    This method is called the 1st time we try to access the DB.
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + FORMULA_TABLE + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, fid TEXT,fcat TEXT, fname TEXT, fdesc TEXT, fimg TEXT, isFav BOOL, isNew BOOL)";
        db.execSQL(createTableStatement);
        Formula formula1 = new Formula("f1", "Motion", "Speed Formula",  "Description", "", false, true);
        this.addOneCreate(formula1, db);
        Formula formula2 = new Formula("f2", "Motion", "1st Law of Motion",  "Description", "", false, true);
        this.addOneCreate(formula2, db);
        Formula formula3 = new Formula("f3", "Motion", "2nd Law of Motion",  "Description", "", false, true);
        this.addOneCreate(formula3, db);
        Formula formula4 = new Formula("f4", "Motion", "3rd Law of Motion",  "Description", "", false, true);
        this.addOneCreate(formula4, db);
        Formula formula5 = new Formula("f5", "Work and Energy", "Work Formula",  "Description", "", false, true);
        this.addOneCreate(formula5, db);
        Formula formula6 = new Formula("f6", "Optics", "Lens Maker's Formula",  "Description", "", false, true);
        this.addOneCreate(formula6, db);
        Formula formula7 = new Formula("f7", "Optics", "Refractive Index Formula",  "Description", "", false, true);
        this.addOneCreate(formula7, db);
        Formula formula8 = new Formula("f8", "Thermodynamics", "Air Fuel Formula",  "Description", "", false, true);
        this.addOneCreate(formula8, db);
        Formula formula9 = new Formula("f9", "Thermodynamics", "Compressibility Factor Formula",  "Description", "", false, true);
        this.addOneCreate(formula9, db);
    }

//    This will be called when DB version is changed. (Forward/Backward Compatibility)
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void dropTable(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS '" + "FORMULA_TABLE" + "'");
    }

    public Boolean addOneCreate(Formula formula, SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put("fid", formula.getFid());
        cv.put("fcat", formula.getFcat());
        cv.put("fname", formula.getFname());
        cv.put("fdesc", formula.getFdesc());
        cv.put("fimg", formula.getFimg());
        cv.put("isFav", formula.getFav());
        cv.put("isNew", formula.getNew());

        long insert = db.insert("FORMULA_TABLE", null, cv);
        if(insert == -1){
            return false;
        }else{
            return true;
        }
    }

    public Boolean addOne(Formula formula) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("fid", formula.getFid());
        cv.put("fcat", formula.getFcat());
        cv.put("fname", formula.getFname());
        cv.put("fdesc", formula.getFdesc());
        cv.put("fimg", formula.getFimg());
        cv.put("isFav", formula.getFav());
        cv.put("isNew", formula.getNew());

        long insert = db.insert("FORMULA_TABLE", null, cv);
        if(insert == -1){
            return false;
        }else{
            return true;
        }
    }

    public Boolean deleteAll(){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("FORMULA_TABLE", null, null) > 0;
    }

    public Boolean deleteOne(String fid){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("FORMULA_TABLE", "id " + "= " + 0, null) > 0;
    }

    public List<Formula> getAllFormulas(){
        List<Formula> returnList = new ArrayList<>();

        String queryString = "SELECT * from FORMULA_TABLE";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()){
            do{
                String fid = cursor.getString(1);
                String fcat = cursor.getString(2);
                String fname = cursor.getString(3);
                String fdesc = cursor.getString(4);
                String fimg = cursor.getString(5);
                Boolean isFav = cursor.getInt(6) == 1 ? true : false;
                Boolean isNew = cursor.getInt(7) == 1 ? true : false;

                Formula formula = new Formula(fid, fcat, fname, fdesc, fimg, isFav, isNew);
                returnList.add(formula);
            }while(cursor.moveToNext());
        }else{

        }
        cursor.close();
        db.close();

        return returnList;
    }

    public List<Formula> getAllFavourites(){
        List<Formula> returnList = new ArrayList<>();

        String queryString = "SELECT * from FORMULA_TABLE WHERE isFav = 1";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()){
            do{
                String fid = cursor.getString(1);
                String fcat = cursor.getString(2);
                String fname = cursor.getString(3);
                String fdesc = cursor.getString(4);
                String fimg = cursor.getString(5);
                Boolean isFav = cursor.getInt(6) == 1 ? true : false;
                Boolean isNew = cursor.getInt(7) == 1 ? true : false;

                Formula formula = new Formula(fid, fcat, fname, fdesc, fimg, isFav, isNew);
                returnList.add(formula);
            }while(cursor.moveToNext());
        }else{

        }
        cursor.close();
        db.close();

        return returnList;
    }

    public List<Formula> getAllCatFormulas(String category){
        List<Formula> returnList = new ArrayList<>();

        String queryString = "SELECT * from FORMULA_TABLE WHERE fcat = \"" + category + "\"";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()){
            do{
                String fid = cursor.getString(1);
                String fcat = cursor.getString(2);
                String fname = cursor.getString(3);
                String fdesc = cursor.getString(4);
                String fimg = cursor.getString(5);
                Boolean isFav = cursor.getInt(6) == 1 ? true : false;
                Boolean isNew = cursor.getInt(7) == 1 ? true : false;

                Formula formula = new Formula(fid, fcat, fname, fdesc, fimg, isFav, isNew);
                returnList.add(formula);
            }while(cursor.moveToNext());
        }else{

        }
        cursor.close();
        db.close();

        return returnList;
    }

    public Boolean checkFav(String fid){
        SQLiteDatabase db = this.getReadableDatabase();
        String queryString = "SELECT isFav from FORMULA_TABLE where fid = \"" + fid + "\"";
        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()){
            do{
                Boolean isFav = cursor.getInt(0) == 1 ? true : false;
                return isFav;
            }while(cursor.moveToNext());
        }else{
            return false;
        }
    }

    public void setFav(Boolean val, String fid){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("isFav", val);
        db.update("FORMULA_TABLE", cv, "fid = \"" + fid + "\"", null);
    }

    public List<Formula> searchFormula(String fname_s){
        List<Formula> returnList = new ArrayList<>();

        String queryString = "SELECT * from FORMULA_TABLE WHERE fname = \""+ fname_s + "\"";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()){
            do{
                String fid = cursor.getString(1);
                String fcat = cursor.getString(2);
                String fname = cursor.getString(3);
                String fdesc = cursor.getString(4);
                String fimg = cursor.getString(5);
                Boolean isFav = cursor.getInt(6) == 1 ? true : false;
                Boolean isNew = cursor.getInt(7) == 1 ? true : false;

                Formula formula = new Formula(fid, fcat, fname, fdesc, fimg, isFav, isNew);
                returnList.add(formula);
            }while(cursor.moveToNext());
        }else{

        }
        cursor.close();
        db.close();

        return returnList;
    }

    public String checkCat(String fid){
        SQLiteDatabase db = this.getReadableDatabase();
        String queryString = "SELECT category from FORMULA_TABLE where fid = \"" + fid + "\"";
        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()){
            do{
                String cat = cursor.getString(0);
                return cat;
            }while(cursor.moveToNext());
        }else{
            return "";
        }
    }

}
