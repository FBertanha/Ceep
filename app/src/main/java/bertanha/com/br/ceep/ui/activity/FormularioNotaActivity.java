package bertanha.com.br.ceep.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import bertanha.com.br.ceep.R;
import bertanha.com.br.ceep.model.Nota;

public class FormularioNotaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_nota);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_formulario_nota_salva, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_formulario_nota_salva) {
            EditText titulo = findViewById(R.id.formulario_nota_titulo);
            EditText descricao = findViewById(R.id.formulario_nota_descricao);

            Nota notaCriada = new Nota(titulo.getText().toString(), descricao.getText().toString());

            Intent resultadoInsercao = new Intent();
            resultadoInsercao.putExtra("nota", notaCriada);
            setResult(2, resultadoInsercao);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
