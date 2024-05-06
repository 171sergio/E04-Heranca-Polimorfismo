import java.util.Date;

public class Individual extends Client {
    private int age;
    private char sex;
    private String CPF;

    public Individual(String adress, String name, int age, char sex, String CPF) {
        super(adress, name);
        this.age = age;
        this.sex = sex;
        this.CPF = CPF;

    }

    public void print(){
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Nome: " + this.getName());
        System.out.println("Endereço: " + this.getAdress());
        System.out.println("Idade: " + this.getAge());
        System.out.println("Sexo: " + this.getSex());
        System.out.println("Data de criação: " + this.getDate());
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}
