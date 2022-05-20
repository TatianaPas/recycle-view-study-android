package com.example.learnmaoriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Testing dictionary

//        Map<Integer, String> words = GetMaoriDigits();
//        String text="";
//        for(Integer key: words.keySet())
//        {
//            text+=String.valueOf(key)+":"+words.get(key)+"\n";
//        }
//
//        TextView temp = (TextView) findViewById(R.id.temp);
//        temp.setText(text);

    Map<Integer,String> wordsDict = GetMaoriDigits();
        List<String> words = new ArrayList<String>(wordsDict.values());
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }

    private Map<Integer,String> GetMaoriDigits(){
        Map<Integer, String> words  = new LinkedHashMap<Integer, String>();
        words.put(1,"Tahi");
        words.put(2,"Rua");
        words.put(3,"Toru");
        words.put(4,"Wha");
        words.put(5,"Rima");
        words.put(6,"Ono");
        words.put(7,"Whitu");
        words.put(8,"Waru");
        words.put(9,"Iwa");
        return words;
        }


//        List<Number>GetNumbers() {
//        List<Number>numbersList = new ArrayList<Number>();
//        Map <Integer,String>words = GetMaoriDigits();
//        for (Integer key: words.keySet())
//        {
//            int digit=key;
//            String maoriTranslation = words.get(key);
//            String icon = "icon";
//            Number n = new Number(digit,icon, maoriTranslation);
//            numbersList.add(n);
//        }
//        return numbersList;
//        }

}