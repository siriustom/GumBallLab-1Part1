package GumBall;

public class GumballMachineTwoQuarter implements GumballMachine {
    private int num_gumballs;
    private boolean hasTwoQuarter;
    private int numOfQuarter;

    public GumballMachineTwoQuarter(int size ) {
        // initialise instance variables
        this.num_gumballs = size;
        this.hasTwoQuarter = false;
        this.numOfQuarter = 0;
    }

    public void insertQuarter(int coin) {
        if ( coin == 25 && numOfQuarter == 0) {
            this.numOfQuarter++;
        } else if (coin == 25 && numOfQuarter == 1) {
            this.hasTwoQuarter = true;
            this.numOfQuarter++;
        } else {
            if (coin != 25) {
                System.out.println("please insert a quarter");
            } else {
                System.out.println("you've already inserted 2 quarters");
            }
        }
    }

    @Override
    public void turnCrank() {
        if (this.hasTwoQuarter) {
            if (this.num_gumballs > 0) {
                this.num_gumballs--;
                this.hasTwoQuarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            } else {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        } else {
            System.out.println( "Please insert a quarter" ) ;
        }
    }
}
