public class PersonagemMago extends Personagem {

    public String verificarResultado() {
        if (this.calcularResultadoBase() >= 3.0f) {
            return "Vitória";
        } else {
            return "Derrota";
        }
    }

    @Override
    public String getTipo() {
        return "Mago";
    }
}