import java.io.Serializable;

public class MorraInfo implements Serializable {

    int p1Points, p2Points;
    int p1Plays, p2Plays;
    int p1Guess, p2Guess;
    int numPlayers;

    MorraInfo (int p1Points, int p2Points, int p1Plays, int p2Plays, int p1Guess, int p2Guess, int numPlayers) {

        this.p1Points = p1Points;
        this.p2Points = p2Points;
        this.p1Plays = p1Plays;
        this.p2Plays = p2Plays;
        this.p1Guess = p1Guess;
        this.p2Guess = p2Guess;
        this.numPlayers = numPlayers;

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
