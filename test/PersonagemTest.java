import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveRetornarGuerreiroVitorioso() {
        Personagem personagem = new PersonagemGuerreiro();
        personagem.setId(1);
        personagem.setNome("Kratos");
        personagem.setAtaque(10);
        personagem.setDefesa(3);

        assertEquals("Guerreiro{id=1, nome='Kratos', resultado=Vitória}", personagem.getInfo());
    }

    @Test
    void deveRetornarGuerreiroDerrotado() {
        Personagem personagem = new PersonagemGuerreiro();
        personagem.setId(2);
        personagem.setNome("Thor");
        personagem.setAtaque(6);
        personagem.setDefesa(3);

        assertEquals("Guerreiro{id=2, nome='Thor', resultado=Derrota}", personagem.getInfo());
    }

    @Test
    void deveRetornarMagoVitorioso() {
        Personagem personagem = new PersonagemMago();
        personagem.setId(3);
        personagem.setNome("Merlin");
        personagem.setAtaque(6);
        personagem.setDefesa(2);

        assertEquals("Mago{id=3, nome='Merlin', resultado=Vitória}", personagem.getInfo());
    }

    @Test
    void deveRetornarMagoDerrotado() {
        Personagem personagem = new PersonagemMago();
        personagem.setId(4);
        personagem.setNome("Gandalf");
        personagem.setAtaque(4);
        personagem.setDefesa(3);

        assertEquals("Mago{id=4, nome='Gandalf', resultado=Derrota}", personagem.getInfo());
    }
}