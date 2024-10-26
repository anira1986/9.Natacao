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
import android.widget.EditText;
import android.widget.Toast;
import br.edu.fateczl.natacao.model.NadadorPleno;

public class NadadorPlenoFragment extends Fragment {

    private View view;
    private EditText inputNomePleno;
    private EditText inputDataNascimentoPleno;
    private EditText inputResidenciaPleno;
    private EditText inputInstituicaoPleno;
    private EditText inputMelhorTempoPleno;
    private Button btnRegistrarPleno;

    public NadadorPlenoFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pleno, container, false);
        inputNomePleno = view.findViewById(R.id.inputNomePleno);
        inputDataNascimentoPleno = view.findViewById(R.id.inputDataNascimentoPleno);
        inputResidenciaPleno = view.findViewById(R.id.inputResidenciaPleno);
        inputInstituicaoPleno = view.findViewById(R.id.inputInstituicaoPleno);
        inputMelhorTempoPleno = view.findViewById(R.id.inputTempoPleno);
        btnRegistrarPleno = view.findViewById(R.id.btnRegistrarPleno);

        btnRegistrarPleno.setOnClickListener(op -> cadastro());
        return view;
    }

    private void cadastro() {
        NadadorPleno pleno = new NadadorPleno();
        pleno.setNomeCompleto(inputNomePleno.getText().toString());
        pleno.setDataNascimento(inputDataNascimentoPleno.getText().toString());
        pleno.setLocalidade(inputResidenciaPleno.getText().toString());
        pleno.setInstituicaoTreino(inputInstituicaoPleno.getText().toString());

        try {
            pleno.setMelhorTempo(Double.parseDouble(inputMelhorTempoPleno.getText().toString()));
        } catch (NumberFormatException e) {
            Toast.makeText(view.getContext(), "Por favor, insira um valor válido para o tempo.", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(view.getContext(), pleno.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        inputNomePleno.setText("");
        inputDataNascimentoPleno.setText("");
        inputResidenciaPleno.setText("");
        inputInstituicaoPleno.setText("");
        inputMelhorTempoPleno.setText("");
    }
}
