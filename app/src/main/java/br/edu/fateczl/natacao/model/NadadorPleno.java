/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */
package br.edu.fateczl.natacao.model;

public class NadadorPleno extends Nadador {

    private String instituicaoTreino;
    private double melhorTempo;

    public NadadorPleno() {
        super();
    }

    public String getInstituicaoTreino() {
        return instituicaoTreino;
    }

    public void setInstituicaoTreino(String instituicaoTreino) {
        this.instituicaoTreino = instituicaoTreino;
    }

    public double getMelhorTempo() {
        return melhorTempo;
    }

    public void setMelhorTempo(double melhorTempo) {
        this.melhorTempo = melhorTempo;
    }

    @Override
    public String toString() {
        return "NadadorPleno{" +
                "nomeCompleto='" + getNomeCompleto() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                ", localidade='" + getLocalidade() + '\'' +
                ", instituicaoTreino='" + instituicaoTreino + '\'' +
                ", melhorTempo=" + melhorTempo +
                '}';
    }
}
