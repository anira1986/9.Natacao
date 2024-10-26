/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */

package br.edu.fateczl.natacao.model;

public class NadadorSenior extends Nadador {

    private boolean statusCardiovascular;

    public NadadorSenior() {
        super();
    }

    public boolean isStatusCardiovascular() {
        return statusCardiovascular;
    }

    public void setStatusCardiovascular(boolean statusCardiovascular) {
        this.statusCardiovascular = statusCardiovascular;
    }

    @Override
    public String toString() {
        return "NadadorSenior{" +
                "nomeCompleto='" + getNomeCompleto() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                ", localidade='" + getLocalidade() + '\'' +
                ", statusCardiovascular=" + statusCardiovascular +
                '}';
    }
}
