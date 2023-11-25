package GuessGame;

public class Player {
    //Attributes
    String name;
    int guess;

    //Methods
    Player(String name){
        this.name = name;
    }
    void makeGuess(){
        this.guess = (int)(Math.random()*9) + 1;
        System.out.println(this.name + " guessed "+this.guess);
    }

}
