import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Account {

    private Client owner;
    private double balance;
    private int ID;
    private float limit;
    private String agency;

    private Operation[] operations;

    private int operationCounter;

    public static int totAccounts=0;

    public Account(Client owner, double balance, int ID, float limit, String agency) {
        this.owner = owner;
        this.balance = balance;
        this.ID = ID;
        this.limit = limit;
        this.agency = agency;
        this.operations = new Operation[1000];
        this.operationCounter = 0;
        totAccounts++;
    }


    boolean deposit(float value) {
        if (value > 0.0) {
            this.balance += value;
            this.operations[operationCounter] = new DepositOperation(value);
            this.operationCounter++;
            return true;
        } else {
            return false;
        }
    }


    boolean withdraw(float value) {
        if (value > 0.0 && value <= this.balance) {
            this.balance -= value;
            this.operations[operationCounter] = new WithdrawOperation(value);
            this.operationCounter++;
            return true;
        } else {
            return false;
        }
    }


    boolean transfer(Account destineAccount, float value) {
        boolean withdrawMade = this.withdraw(value);
        if (withdrawMade) {
            boolean deposit = destineAccount.deposit(value);
            return deposit;
        } else {
            return false;
        }
    }


    void printOut() {
        System.out.println("Nome do dono da conta: " + this.owner.getName());
        System.out.println("Número da conta: " + this.ID);
        System.out.println("Saldo atual: " + this.balance);
        System.out.println("Limite: " + this.limit);
    }

    void printStatemant() {
        for (int i = 0; i < this.operationCounter; i++) {
            System.out.print(this.operations[i].getDate() + "  ");
            System.out.print(this.operations[i].getType() + "   ");
            System.out.println("R$ " + this.operations[i].getAmount());
        }
    }


    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOperationCounter(){
        return operationCounter;
    }
}