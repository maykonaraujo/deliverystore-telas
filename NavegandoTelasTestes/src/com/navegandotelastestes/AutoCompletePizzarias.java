package com.navegandotelastestes;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;

public class AutoCompletePizzarias extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.autocomplete);
		super.onCreate(savedInstanceState);
		String[] pizzarias = new String[]{"Pizzaria A","Pizzaria B","Pizzaria C"};
		ArrayAdapter<String> aaPizarias = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,pizzarias);
		AutoCompleteTextView autoCompletar = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		autoCompletar.setAdapter(aaPizarias);
		
		MultiAutoCompleteTextView variosAutoCompletar = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);
		variosAutoCompletar.setAdapter(aaPizarias);
		variosAutoCompletar.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
	

	}
}

