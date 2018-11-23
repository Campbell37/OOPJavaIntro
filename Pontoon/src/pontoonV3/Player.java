package pontoonV3;

public class Player 
{

    private Hand playHand;

    public Player()
    {
        playHand = new Hand();

    }

    public void setPlayHand(Hand playerHand) 
    {
        this.playHand = playerHand;
    }

    public Hand getPlayHand()
    {
        return playHand;
    }

//    public void twist(Hand handInPlay, Card twistCard)
//    {
//        handInPlay.addCard(handInPlay, twistCard);
//        setPlayHand(handInPlay);
//    }

}
