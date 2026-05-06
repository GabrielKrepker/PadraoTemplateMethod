public class PersonagemGuerreiro extends Personagem {

    public String verificarResultado() {
        if (this.calcularResultadoBase() >= 5.0f) {
            return "Vitória";
        } else {
            return "Derrota";
        }
    }

    @Override
    public String getTipo() {
        return "Guerreiro";
    }
}