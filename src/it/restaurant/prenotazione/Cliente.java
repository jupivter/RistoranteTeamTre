package it.restaurant.prenotazione;



public class Cliente {

    private String nome;
    private String cognome;
    private ClienteTypesEnum tipologia;


    public int numeroDiCellulare;

    public Cliente(String nome, String cognome, ClienteTypesEnum tipologia, int numeroDiCellulare) {
        this.nome = nome;
        this.cognome = cognome;
        this.tipologia = tipologia;
        this.numeroDiCellulare = numeroDiCellulare;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getNumeroDiCellulare() {
        return numeroDiCellulare;
    }

    public void setNumeroDiCellulare(int numeroDiCellulare) {
        this.numeroDiCellulare = numeroDiCellulare;
    }

    public ClienteTypesEnum getTipologia() {
        return tipologia;
    }

    public void setTipologia(ClienteTypesEnum tipologia) {
        this.tipologia = tipologia;
    }

    public String datiCliente() {
        return "Cliente: " + this.nome + " - " + this.cognome + " - " + this.numeroDiCellulare + " - " + this.tipologia;
    }

    public void prenota(Cliente cliente, Tavolo tavolo) {
        System.out.println("Il "+ cliente.datiCliente()+ "\n" +"ha prenotato il "+  tavolo.infoTavolo());
    }

}