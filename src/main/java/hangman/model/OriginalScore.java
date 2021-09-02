package hangman.model;

public class OriginalScore implements GameScore{
    /*
    @pre se inicia con 100 puntos
    @pos debe retornar la puntuacion con un valor >= 0
    @pos return=100-incorrectcount * 10
    */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int resultado = 100 - incorrectCount *10;
        if(resultado <= 0){
            resultado = 0;
        }
        return resultado;
    }

}
