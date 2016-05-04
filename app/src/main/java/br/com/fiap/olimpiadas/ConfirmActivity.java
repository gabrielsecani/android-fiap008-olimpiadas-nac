package br.com.fiap.olimpiadas;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity {

    private TextView edNome_confirm;
    private TextView edIdade_confirm;
    private TextView spnModalidade_confirm;
    private TextView rgPeriodo_confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_layout);
        edNome_confirm = (TextView) findViewById(R.id.edNome_confirm);
        edIdade_confirm = (TextView) findViewById(R.id.edIdade_confirm);
        spnModalidade_confirm = (TextView) findViewById(R.id.spnModalidade_confirm);
        rgPeriodo_confirm = (TextView) findViewById(R.id.rgPeriodo_confirm);

        Bundle bdl = getIntent().getExtras();
        edNome_confirm.setText(bdl.getString("nome"));
        edIdade_confirm.setText(bdl.getString("idade"));
        spnModalidade_confirm.setText(bdl.getString("modalidade"));
        rgPeriodo_confirm.setText(bdl.getString("periodo"));

    }

    public void btnConfirmarOnClick(View v) {
        //Toast.makeText(ConfirmActivity.this, "Confirmação", Toast.LENGTH_SHORT).show();
        AlertDialog.Builder d = new AlertDialog.Builder(this)
                .setTitle("Confirmação")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setMessage("Confirmado!");
        d.create().show();
    }
}
