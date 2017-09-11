package GumBall;

public class GumballMachineAll implements GumballMachine {
    private int num_gumballs;
    private boolean has50Cents;
    private int coin;

    public GumballMachineAll(int size ) {
        // initialise instance variables
        this.num_gumballs = size;
        this.has50Cents = false;
        this.coin = 0;
    }

    public void insertCoin(int coin) {
        if (!this.has50Cents) {
            this.coin += coin;
            if (this.coin >= 50) {
                this.has50Cents = true;
            }
        } else {
            System.out.println("You've already inserted 50 cents");
        }
    }

    @Override
    public void turnCrank() {
        if (this.has50Cents) {
            if (this.num_gumballs > 0) {
                this.num_gumballs--;
                this.has50Cents = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            } else {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        } else {
            System.out.println( "Please insert more coins" ) ;
        }
    }
}
