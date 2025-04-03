public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int puntuacionJ1, int puntuacionJ2) {

        StringBuilder puntosStringFinal = new StringBuilder();

        if (puntuacionJ1 == puntuacionJ2) {
            puntosStringFinal = new StringBuilder(switch (puntuacionJ1) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                case 3 -> "Forty-All";
                default -> "Deuce";
            });

        } else if (puntuacionJ1 >=4 || puntuacionJ2 >=4) {
            int minusResult = puntuacionJ1-puntuacionJ2;

            if (minusResult==1) {
                puntosStringFinal = new StringBuilder("Advantage player1");
            }
            else if (minusResult ==-1) {
                puntosStringFinal = new StringBuilder("Advantage player2");
            }
            else if (minusResult>=2) {
                puntosStringFinal = new StringBuilder("Win for player1");
            }
            else {
                puntosStringFinal = new StringBuilder("Win for player2");
            }
        } else {
            int tempScore;

            for (int i=1; i<3; i++) {
                if (i==1) {
                    tempScore = puntuacionJ1;
                } else {
                    puntosStringFinal.append("-");
                    tempScore = puntuacionJ2;
                }

                switch(tempScore) {
                    case 0:
                        puntosStringFinal.append("Love");
                        break;
                    case 1:
                        puntosStringFinal.append("Fifteen");
                        break;
                    case 2:
                        puntosStringFinal.append("Thirty");
                        break;
                    case 3:
                        puntosStringFinal.append("Forty");
                        break;
                }
            }
        }

    return puntosStringFinal.toString();

    }
}