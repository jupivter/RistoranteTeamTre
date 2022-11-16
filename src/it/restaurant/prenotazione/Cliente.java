package it.restaurant.prenotazione;

import it.restaurant.classes.portate.ClienteTypesEnum;

public class Cliente {

    private String nome;
    private String cognome;
    private ClienteTypesEnum tipologia;

    public Cliente(String nome, String cognome, ClienteTypesEnum tipologia){
        this.nome = nome;
        this.cognome = cognome;
        this.tipologia = tipologia;
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

    public ClienteTypesEnum getTipologia() {
        return tipologia;
    }

    public void setTipologia(ClienteTypesEnum tipologia) {
        this.tipologia = tipologia;
    }
}