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
import br.edu.fateczl.natacao.model.JuvenilNadador;

public class JuvenilNadadorFragment extends Fragment {

    private View view;
    private EditText inputNomeJuvenil;
    private EditText inputDataNascimentoJuvenil;
    private EditText inputResidenciaJuvenil;
    private EditText inputExperienciaJuvenil;
    private Button btnRegistrarJuvenil;

    public JuvenilNadadorFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      
        view = inflater.inflate(R.layout.fragment_juvenil, container, false);
        inputNomeJuvenil = view.findViewById(R.id.inputNomeJuvenil);
        inputDataNascimentoJuvenil = view.findViewById(R.id.inputDataNascimentoJuvenil);
        inputResidenciaJuvenil = view.findViewById(R.id.inputResidenciaJuvenil);
        inputExperienciaJuvenil = view.findViewById(R.id.inputExperienciaJuvenil);
        btnRegistrarJuvenil = view.findViewById(R.id.btnRegistrarJuvenil);

        btnRegistrarJuvenil.setOnClickListener(op -> cadastro());
        return view;
    }

    private void cadastro() {
        JuvenilNadador juvenil = new JuvenilNadador();
        juvenil.setNomeCompleto(inputNomeJuvenil.getText().toString());
        juvenil.setDataNascimento(inputDataNascimentoJuvenil.getText().toString());
        juvenil.setLocalidade(inputResidenciaJuvenil.getText().toString());

        try {
            juvenil.setTempoExperiencia(Integer.parseInt(inputExperienciaJuvenil.getText().toString()));
        } catch (NumberFormatException e) {
            Toast.makeText(view.getContext(), "Por favor, insira um valor válido para experiência.", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(view.getContext(), juvenil.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        inputNomeJuvenil.setText("");
        inputDataNascimentoJuvenil.setText("");
        inputResidenciaJuvenil.setText("");
        inputExperienciaJuvenil.setText("");
    }
}
