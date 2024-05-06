import sun.util.calendar.CalendarSystem;

public class Main {

    public static void main(String[] args) {

        Client pessoa1 = new Individual("Rua XYZ, 123", "Jhonatan Bruno", 30, 'M', "123456789");
        Client empresa1 = new JuridicalPerson("R. Rio Pomba" , "Primo's Barber", "Beleza", 3, "12345678901234");
        Account contapf = new Account( pessoa1,1000.0, 123456, 500.0F, "001");
        Account contapj = new Account(empresa1,10000.0, 5789, 200000.0F, "002");

        empresa1.print();
        pessoa1.print();

        contapf.deposit(900);
        contapf.withdraw(100);

        contapf.printStatemant();

        contapj.deposit(900);
        contapj.withdraw(100);

        contapj.printStatemant();

    }
}