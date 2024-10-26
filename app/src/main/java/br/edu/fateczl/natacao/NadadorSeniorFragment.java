/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */

package br.edu.fateczl.natacao;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import br.edu.fateczl.natacao.model.NadadorSenior;

public class NadadorSeniorFragment extends Fragment {

    private View view;
    private EditText inputNomeSenior;
    private EditText inputDataNascimentoSenior;
    private EditText inputResidenciaSenior;
    private CheckBox checkSaudeSenior;
    private Button btnRegistrarSenior;

    public NadadorSeniorFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_senior, container, false);
        inputNomeSenior = view.findViewById(R.id.inputNomeSenior);
        inputDataNascimentoSenior = view.findViewById(R.id.inputDataNascimentoSenior);
        inputResidenciaSenior = view.findViewById(R.id.inputResidenciaSenior);
        checkSaudeSenior = view.findViewById(R.id.checkSaudeSenior);
        checkSaudeSenior.setChecked(false);
        btnRegistrarSenior = view.findViewById(R.id.btnRegistrarSenior);

        btnRegistrarSenior.setOnClickListener(op -> cadastro());
        return view;
    }

    private void cadastro() {
        NadadorSenior senior = new NadadorSenior();
        senior.setNomeCompleto(inputNomeSenior.getText().toString());
        senior.setDataNascimento(inputDataNascimentoSenior.getText().toString());
        senior.setLocalidade(inputResidenciaSenior.getText().toString());
        senior.setStatusCardiovascular(checkSaudeSenior.isChecked());

        Toast.makeText(view.getContext(), senior.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        inputNomeSenior.setText("");
        inputDataNascimentoSenior.setText("");
        inputResidenciaSenior.setText("");
        checkSaudeSenior.setChecked(false);
    }
}
