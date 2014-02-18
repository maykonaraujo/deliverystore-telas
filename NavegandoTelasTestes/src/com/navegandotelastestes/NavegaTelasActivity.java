package com.navegandotelastestes;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class NavegaTelasActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_navega_telas);
		/*Uri uriPaginaWeb = Uri.parse("http://www.agendataxi.com/");
		Intent IpaginaWeb = new Intent(Intent.ACTION_VIEW,uriPaginaWeb);
		startActivity(IpaginaWeb);*/
		Button btCadastro = (Button) findViewById(R.id.btCadastro);
		final EditText etUsuario = (EditText) findViewById(R.id.etUsuario);
		final Button btPaginaWeb = (Button) findViewById(R.id.btPaginaWeb);
		final Button btListaPizzarias = (Button) findViewById(R.id.btListaPizzarias);
		final Button btAutoComplete = (Button) findViewById(R.id.btAutoComplete);
		btAutoComplete.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(NavegaTelasActivity.this,AutoCompletePizzarias.class));
			}
		});
		btListaPizzarias.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try{
					startActivity(new Intent(NavegaTelasActivity.this,ListadePizzarias.class));
				}catch(Exception erro){
					System.out.println("Erro = " + erro);
				}
			}
		});
		btPaginaWeb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try{
				Uri uriPaginaWeb = Uri.parse("http://127.0.0.1:8080/");
				Intent IpaginaWeb = new Intent(Intent.ACTION_VIEW,uriPaginaWeb);
				startActivity(IpaginaWeb);
				}catch(Exception erro){
					System.out.println("Erro = "+erro);
				}
			}
		});
		btCadastro.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String usuario = etUsuario.getText().toString();
				Intent iTelaPrincipal = new Intent(NavegaTelasActivity.this,TelaCadastro.class);
				iTelaPrincipal.putExtra("usuario",usuario);
				startActivity(iTelaPrincipal);				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.navega_telas, menu);
		return true;
	}

}
