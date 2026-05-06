public abstract class Personagem {

    private int id;
    protected String nome;
    private float ataque;
    private float defesa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public float getDefesa() {
        return defesa;
    }

    public void setDefesa(float defesa) {
        this.defesa = defesa;
    }

    // Parte fixa do algoritmo
    public float calcularResultadoBase() {
        return (this.ataque - this.defesa);
    }

    // Parte variável (Template Method)
    public abstract String verificarResultado();

    public String getTipo() {
        return "Personagem";
    }

    // TEMPLATE METHOD
    public String getInfo() {
        return getTipo() + "{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarResultado() +
                '}';
    }
}