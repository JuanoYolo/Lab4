package hangman.model;

public class BonusScore implements GameScore{
    /*
    @pre El juego inicia con 100 puntos
    @pos return=100+correctcount * 10
    @pos debe retornar la puntuacion con un valor >= 0
    @pos return=100-incorrectcount * 5
    */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
