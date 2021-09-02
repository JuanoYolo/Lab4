import org.junit.*;
import hangman.model.*;
/*
 Clases de Equivalencia:
    Clase 1: Puntaje correcto
    Clase 2: Puntaje >= 0
    Clase 3: 0 < puntaje <= 500
 */
public class GameScoreTest {
    OriginalScore original = new OriginalScore();
    BonusScore bonus = new BonusScore();
    PowerScore power = new PowerScore();

    @Test
    public void ValidarPuntajeFinalOriginal(){
        int resul = original.calculateScore(4,2);
        Assert.assertEquals(80, resul);
    }

    @Test
    public void ValidarPuntajeFinalBonus(){
        int resul = bonus.calculateScore(4,2);
        Assert.assertEquals(30, resul);
    }

    @Test
    public void ValidarPuntajeFinalPower(){
        int resul = power.calculateScore(4,20);
        Assert.assertEquals(465, resul);
    }

    @Test
    public void ValidarPuntajeMinimoOriginal(){
        int resul = original.calculateScore(0,10);
        Assert.assertEquals(0,resul);
    }

    @Test
    public void ValidarPuntajeMinimoBonus(){
        int resul = bonus.calculateScore(6,15);
        Assert.assertEquals(0,resul);
    }

    @Test
    public void ValidarPuntajeMinimoPower(){
        int resul = power.calculateScore(1,11);
        Assert.assertEquals(0,resul);
    }

    @Test
    public void ValidarPuntajeMaximoPower(){
        int resul = power.calculateScore(4,15);
        Assert.assertEquals(500,resul);
    }
}

