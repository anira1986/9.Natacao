/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */

package br.edu.fateczl.natacao.model;

public class JuvenilNadador extends Nadador {

    private int tempoExperiencia;

    public int getTempoExperiencia() {
        return tempoExperiencia;
    }

    public void setTempoExperiencia(int tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }

    @Override
    public String toString() {
        return "JuvenilNadador{" +
                "nomeCompleto='" + getNomeCompleto() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                ", localidade='" + getLocalidade() + '\'' +
                ", tempoExperiencia=" + tempoExperiencia +
                '}';
    }
}
