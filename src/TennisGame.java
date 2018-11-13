public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        boolean isSameScore = scorePlayer1 == scorePlayer2;
        if (isSameScore)
        {
            score = getResultSameScore(scorePlayer1);
        }
        else {
            boolean isGreaterThan4 = scorePlayer1 >=4 || scorePlayer2 >=4;
            if (isGreaterThan4)
            {
              score = getAdvantage(scorePlayer1,scorePlayer2);
            }
            else
            {
               score = getCurentScore(scorePlayer1,scorePlayer2);
            }
        }
        return score;
    }

    private static String getResultSameScore(int scorePlayer1) {
        String score;
        switch (scorePlayer1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    private static String getAdvantage(int score1, int score2){
        String score = "";
            int minusResult = score1-score2;
            boolean player1GetScore = minusResult == 1;
            if (player1GetScore){
                score ="Advantage player1";
            }
            else {
                boolean player2GetScore = minusResult == -1;
                if (player2GetScore){
                    score ="Advantage player2";
                }
                else {
                    boolean player1GetSoreAgain = minusResult >= 2;
                    if (player1GetSoreAgain) {
                        score = "Win for player1";
                    }
                    else{
                        score ="Win for player2";
                    }
                }
            }
        return score;
    }

    private static String getCurentScore(int score1,int score2){
        String score = "";
        int tempScore = 0;
        for (int i=1; i<3; i++)
        {
            boolean firstLoop = i == 1;
            if (firstLoop){
                tempScore = score1;
            }
            else {
                score+="-";
                tempScore = score2;
            }
            switch(tempScore)
            {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }
}
