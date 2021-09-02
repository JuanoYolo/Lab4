package hangman.model;

public class PowerScore implements GameScore{
    /*
    @pre se inicia con 0 puntos
    @pos debe retornar la puntuacion con un valor >= 0, valor maximo puntos = 500
    @pos return= incorrectCount*8
    @pos return = 5^correctCount
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
