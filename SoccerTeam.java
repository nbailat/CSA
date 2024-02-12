public class SoccerTeam {
    private int Ws;
    private int Ls;
    private int ties;

    public static int gamesplayed;
    public static int totalgoalsscored;
    
    public static void main(String [] args){
        SoccerTeam Arsenal = new SoccerTeam();
        SoccerTeam ManchesterCity = new SoccerTeam();
        SoccerTeam Liverpool = new SoccerTeam();
        SoccerTeam ManchesterUnited = new SoccerTeam();
        
        Arsenal.starttourney();
        Liverpool.played(ManchesterUnited, 3, 2);
        ManchesterCity.played(Arsenal, 1, 7);
        ManchesterUnited.played(Arsenal, 3, 4);
        Liverpool.played(ManchesterCity, 2, 0);
        ManchesterUnited.played(ManchesterCity, 0, 0);
        
        System.out.println("Arsenal : " + Arsenal.points());
        System.out.println("Manchester United : " + ManchesterUnited.points());
        System.out.println("Liverpool : " + Liverpool.points());
        System.out.println("Manchester City : " + ManchesterCity.points());
        System.out.println("Total number of games played : " + SoccerTeam.getgamesplayed());
        System.out.println("Total number of goals scored : " + SoccerTeam.gettotalgoalsscored());
        
        System.out.println();
        
        Arsenal.reset();
        ManchesterUnited.reset();
        ManchesterCity.reset();
        Liverpool.reset();
        
        Liverpool.starttourney();
        Liverpool.played(ManchesterCity, 1, 1);
        Arsenal.played(ManchesterUnited, 2, 1);
        Liverpool.played(Arsenal, 2, 4);
        ManchesterUnited.played(ManchesterCity, 3, 1);
        ManchesterCity.played(Arsenal, 0, 6);
        
        System.out.println("Arsenal : " + Arsenal.points());
        System.out.println("Manchester United : " + ManchesterUnited.points());
        System.out.println("Liverpool : " + Liverpool.points());
        System.out.println("Manchester City : " + ManchesterCity.points());
        System.out.println("Total number of games played : " + SoccerTeam.getgamesplayed());
        System.out.println("Total number of goals scored : " + SoccerTeam.gettotalgoalsscored());
    }
    
    public void played(SoccerTeam other, int myScore, int otherScore){
        gamesplayed++;
        totalgoalsscored += myScore + otherScore;

        if (myScore>otherScore){
            this.Ws++;
            other.Ls++;
        }
        else if (myScore == otherScore){
            this.ties++;
            other.ties++;
        }
        else if (myScore<otherScore){
            this.Ls++;
            other.Ws++;
        }
    }

    public int points(){
        return Ws*3 + ties;
    }
    
     public void reset(){
        this.Ws = 0;
        this.ties = 0;
        this.Ls = 0;
    }
    
    public static int getgamesplayed(){
        return gamesplayed;
    }

    public static int gettotalgoalsscored(){
        return totalgoalsscored;
    }
    
    public void starttourney(){
        SoccerTeam.gamesplayed = 0;
        SoccerTeam.totalgoalsscored = 0;
    }
    
}
