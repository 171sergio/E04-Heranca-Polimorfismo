import java.util.Date;

public class JuridicalPerson extends Client{

    private String sector;
    private int numFuncionarios;
    private String CNPJ;


    public JuridicalPerson(String adress, String name, String sector, int numFuncionarios, String CNPJ) {
        super(adress, name);
        this.sector = sector;
        this.numFuncionarios = numFuncionarios;
        this.CNPJ = CNPJ;
    }

    public void print(){
        System.out.println("CNPJ: " + this.getCNPJ());
        System.out.println("Nome: " + this.getName());
        System.out.println("Endereço: " + this.getAdress());
        System.out.println("Número de funcionários: " + this.numFuncionarios);
        System.out.println("Setor: " + this.getSector());
        System.out.println("Data de criação: " + this.getDate());
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        sector = sector;
    }
}
