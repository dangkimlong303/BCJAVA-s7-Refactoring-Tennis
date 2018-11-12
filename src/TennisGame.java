public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore=0;
        boolean isSameScore = scorePlayer1 == scorePlayer2;
        if (isSameScore)
        {
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
        }
        else {
            boolean firstGreaterThan4 = scorePlayer1 >= 4;
            boolean seconeGreaterThan4 = scorePlayer2 >= 4;
            if (firstGreaterThan4 || seconeGreaterThan4)
            {
                int minusResult = scorePlayer1-scorePlayer2;
                boolean player1GetScore = minusResult == 1;
                if (player1GetScore) score ="Advantage player1";
                else {
                    boolean player2GetScore = minusResult == -1;
                    if (player2GetScore) score ="Advantage player2";
                    else {
                        boolean player1GetSoreAgain = minusResult >= 2;
                        if (player1GetSoreAgain) score = "Win for player1";
                        else score ="Win for player2";
                    }
                }
            }
            else
            {
                for (int i=1; i<3; i++)
                {
                    boolean firstLoop = i == 1;
                    if (firstLoop) tempScore = scorePlayer1;
                    else { score+="-"; tempScore = scorePlayer2;}
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
            }
        }
        return score;
    }
}
