package api.bean;

import java.util.Objects;

public class Evento {

    private int id;
    private String descricao;
    private String chave;
    private boolean ativo;
    private boolean gratuito;
    private int dias;
    private boolean online;
    private String dataInicio;
    private String dataTermino;

    public Evento() {}

    public Evento(int id, String descricao, int dias) {
        this.id = id;
        this.descricao = descricao;
        this.dias = dias;
    }

    public Evento(int id, String descricao, String chave, int dias, String dataInicio, String dataTermino) {
        this.id = id;
        this.descricao = descricao;
        this.chave = chave;
        this.dias = dias;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return id == evento.id &&
                ativo == evento.ativo &&
                gratuito == evento.gratuito &&
                dias == evento.dias &&
                online == evento.online &&
                Objects.equals(descricao, evento.descricao) &&
                Objects.equals(chave, evento.chave) &&
                Objects.equals(dataInicio, evento.dataInicio) &&
                Objects.equals(dataTermino, evento.dataTermino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, chave, ativo, gratuito, dias, online, dataInicio, dataTermino);
    }
}
