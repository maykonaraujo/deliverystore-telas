package com.navegandotelastestes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class TelaCadastro extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cadastro);
		Button btMenuPrincipal = (Button)findViewById(R.id.btMenuPrincipal);
		TextView tvUsuario = (TextView) findViewById(R.id.etUsuarioCadastro);
		final Intent iTelaCadastro = new Intent(TelaCadastro.this,NavegaTelasActivity.class);
		Intent IdadosRecebidos = getIntent();
		if(IdadosRecebidos != null){
			String dadosRecebidos = IdadosRecebidos.getStringExtra("usuario");
			if(dadosRecebidos != null){
				Log.i("Dados recebidos","Dados recebidos: "+ dadosRecebidos);
				tvUsuario.setText(dadosRecebidos);
				
			}
		}
		btMenuPrincipal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(iTelaCadastro);
				finish();
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