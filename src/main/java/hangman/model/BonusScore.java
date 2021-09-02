package hangman.model;

public class BonusScore implements GameScore{
    /*
    @pre El juego inicia con 0 puntos
    @pos return= correctcount * 10
    @pos debe retornar la puntuacion con un valor >= 0
    @pos return= incorrectcount * 5
    */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int resultado = (10*correctCount) - (5*incorrectCount);
        if(resultado <= 0){
            resultado = 0;
        }
        return resultado;
    }
}
