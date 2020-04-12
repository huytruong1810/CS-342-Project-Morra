import java.io.Serializable;

public class MorraInfo implements Serializable {

    int p1Points, p2Points;
    int p1Plays, p2Plays;
    int p1Guess, p2Guess;
    int numPlayers;
    boolean pl; 
    boolean p2; 
    MorraInfo() {
    	
    }
    
    MorraInfo (int p1Points, int p2Points, int p1Plays, int p2Plays, int p1Guess, int p2Guess, int numPlayers) {

        this.p1Points = p1Points;
        this.p2Points = p2Points;
        this.p1Plays = p1Plays;
        this.p2Plays = p2Plays;
        this.p1Guess = p1Guess;
        this.p2Guess = p2Guess;
        this.numPlayers = numPlayers;

    }

    void setP1Plays(int p1Plays) {
        this.p1Plays = p1Plays;
    }

    void setP2Plays(int p2Plays) {
        this.p2Plays = p2Plays;
    }

    void setP1Guess(int p1Guess) {
        this.p1Guess = p1Guess;
    }

    void setP2Guess(int p2Guess) {
        this.p2Guess = p2Guess;
    }

    int getP1Points() {
        return this.p1Points;
    }

    int getP2Points() {
        return this.p2Points;
    }

    int getP1Plays() {
        return this.p1Plays;
    }

    int getP2Plays() {
        return this.p2Plays;
    }

    int getP1Guess() {
        return this.p1Guess;
    }

    int getP2Guess() {
        return this.p2Guess;
    }

    int getNumPlayers() {
        return this.numPlayers;
    }

}