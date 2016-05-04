package br.com.fiap.olimpiadas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class HomeActivity extends AppCompatActivity {

    private EditText edNome;
    private EditText edIdade;
    private Spinner spnModalidade;
    private RadioGroup rgPeriodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        edNome = (EditText) findViewById(R.id.edNome_confirm);
        edIdade = (EditText) findViewById(R.id.edIdade_confirm);
        spnModalidade = (Spinner) findViewById(R.id.spnModalidade);
        rgPeriodo = (RadioGroup) findViewById(R.id.rgPeriodo);
    }

    public void btnReservarOnClick(View view) {
        //Toast.makeText(HomeActivity.this, "Reservar", Toast.LENGTH_SHORT).show();
        //Chamar a activity pela classe diretamente.. ou via manifest com action name
        //Intent intencao = new Intent(this, ConfirmActivity.class);
        Intent intencao = new Intent("confirmacao");
        intencao.putExtra("nome", edNome.getText());
        intencao.putExtra("idade", edIdade.getText());
        intencao.putExtra("modalidade", spnModalidade.getSelectedItem().toString());
        RadioButton rb = ((RadioButton) findViewById(rgPeriodo.getCheckedRadioButtonId()));
        String speriodo = "";
        if (rb != null)
            speriodo = rb.getText().toString();
        intencao.putExtra("periodo", speriodo);
        startActivity(intencao);

    }

}
