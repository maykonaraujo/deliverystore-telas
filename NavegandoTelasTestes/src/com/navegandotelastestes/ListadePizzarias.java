package com.navegandotelastestes;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;


import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListadePizzarias extends ListActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] pizzarias = new String[]{"Pizzaria A","Pizzaria B","Pizzaria C"};
		ArrayAdapter<String> aaPizarias = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pizzarias);
		setListAdapter(aaPizarias);
	}
	protected void onListItemClick(ListView l, View v, int position , long id){
		super.onListItemClick(l, v, position, id);
		Object objetoSelecionado = this.getListAdapter().getItem(position);
		String nomePizzaria = objetoSelecionado.toString();
		mensagem("Pizarria selecionada : "+nomePizzaria);
		
		
	}
	public void mensagem(String texto){
		AlertDialog.Builder mensagem = new AlertDialog.Builder(ListadePizzarias.this);
		mensagem.setTitle("Informa");
		mensagem.setMessage(texto);
		mensagem.setNeutralButton("OK", null);
		mensagem.show();
	}
	
	}

