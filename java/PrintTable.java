class PrintTable extends Thread {
    private int tableNumber;

    public PrintTable(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public void run() {
        System.out.println("Table of " + tableNumber + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNumber + " * " + i + " = " + (tableNumber * i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PrintTable tableOfFive = new PrintTable(5);
        PrintTable tableOfSeven = new PrintTable(7);
        PrintTable tableOfThirteen = new PrintTable(13);

        tableOfFive.start();
        tableOfSeven.start();
        tableOfThirteen.start();
    }
}
