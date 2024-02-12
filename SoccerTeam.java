public class SoccerTeam {
    private int dubs;
    private int ls;
    private int ties;

    public static int gamesplayed;
    public static int totalgoalsscored;
    
    public void played(SoccerTeam other, int myScore, int otherScore){
        gamesplayed++;
        totalgoalsscored++;

        if (myScore>otherScore){
            this.dubs++;
            other.ls++;
        }
        else if (myScore == otherScore){
            this.ties++;
            other.ties++;
        }
        else if (myScore<otherScore){
            this.ls++;
            other.dubs++;
        }
    }

    public int points(){
        return dubs*3 + ties;
    }

}
