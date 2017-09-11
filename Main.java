package GumBall;

public class Main {
    public static void main(String[] args) {
        GumballMachineOneQuarter gumballMachineOneQuarter = new GumballMachineOneQuarter(5);
        System.out.println(gumballMachineOneQuarter);

        gumballMachineOneQuarter.insertQuarter( 25 );
        gumballMachineOneQuarter.turnCrank();

        System.out.println(gumballMachineOneQuarter);

        GumballMachineTwoQuarter gumballMachineTwoQuarter = new GumballMachineTwoQuarter(5);
        System.out.println(gumballMachineTwoQuarter);

        gumballMachineTwoQuarter.insertQuarter( 25 );
        gumballMachineTwoQuarter.turnCrank();
        gumballMachineTwoQuarter.insertQuarter( 25 );
        gumballMachineTwoQuarter.turnCrank();

        System.out.println(gumballMachineOneQuarter);

        GumballMachineAll gumballMachineAll = new GumballMachineAll(5);
        System.out.println(gumballMachineAll);

        gumballMachineAll.insertCoin(10);
        gumballMachineAll.turnCrank();
        gumballMachineAll.insertCoin(25);
        gumballMachineAll.turnCrank();
        gumballMachineAll.insertCoin(10);
        gumballMachineAll.insertCoin(5);
        gumballMachineAll.turnCrank();

        System.out.println(gumballMachineAll);
    }
}
