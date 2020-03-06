package api.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Modalidade {

    private int id;
    private String descricao;
    private String urlSite;
    private boolean ativo;
    private int posicaoNoEvento;
    private String slogan;
    private String descricaoDetalhada;
    private String publicoAlvo;
    private String topicos;
    private String preRequisitos;
    private String data;
    private String dataTermino;
    private String tipo;
    private boolean gratuito;
    private boolean publicarNoSite;
    private List<Intervalos> intervalos;


    public Modalidade() {}

    public Modalidade(int id, String descricao, String urlSite, boolean ativo, int posicaoNoEvento, String slogan, String descricaoDetalhada, String publicoAlvo, String data, String dataTermino, String tipo, boolean gratuito, boolean publicarNoSite, List<Intervalos> intervalos) {
        this.id = id;
        this.descricao = descricao;
        this.urlSite = urlSite;
        this.ativo = ativo;
        this.posicaoNoEvento = posicaoNoEvento;
        this.slogan = slogan;
        this.descricaoDetalhada = descricaoDetalhada;
        this.publicoAlvo = publicoAlvo;
        this.data = data;
        this.dataTermino = dataTermino;
        this.tipo = tipo;
        this.gratuito = gratuito;
        this.publicarNoSite = publicarNoSite;
        this.intervalos = intervalos;
    }

    public Modalidade(int id, String descricao, String urlSite, boolean ativo, int posicaoNoEvento, String slogan, String descricaoDetalhada, String publicoAlvo, String topicos, String data, String dataTermino, String tipo, boolean gratuito, boolean publicarNoSite, List<Intervalos> intervalos) {
        this.id = id;
        this.descricao = descricao;
        this.urlSite = urlSite;
        this.ativo = ativo;
        this.posicaoNoEvento = posicaoNoEvento;
        this.slogan = slogan;
        this.descricaoDetalhada = descricaoDetalhada;
        this.publicoAlvo = publicoAlvo;
        this.topicos = topicos;
        this.data = data;
        this.dataTermino = dataTermino;
        this.tipo = tipo;
        this.gratuito = gratuito;
        this.publicarNoSite = publicarNoSite;
        this.intervalos = intervalos;
    }

    public Modalidade(int id, String descricao, String urlSite, boolean ativo, int posicaoNoEvento, String slogan, String descricaoDetalhada, String publicoAlvo, String topicos, String preRequisitos, String data, String dataTermino, String tipo, boolean gratuito, boolean publicarNoSite, List<Intervalos> intervalos) {
        this.id = id;
        this.descricao = descricao;
        this.urlSite = urlSite;
        this.ativo = ativo;
        this.posicaoNoEvento = posicaoNoEvento;
        this.slogan = slogan;
        this.descricaoDetalhada = descricaoDetalhada;
        this.publicoAlvo = publicoAlvo;
        this.topicos = topicos;
        this.preRequisitos = preRequisitos;
        this.data = data;
        this.dataTermino = dataTermino;
        this.tipo = tipo;
        this.gratuito = gratuito;
        this.publicarNoSite = publicarNoSite;
        this.intervalos = intervalos;
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

    public String getUrlSite() {
        return urlSite;
    }

    public void setUrlSite(String urlSite) {
        this.urlSite = urlSite;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getPosicaoNoEvento() {
        return posicaoNoEvento;
    }

    public void setPosicaoNoEvento(int posicaoNoEvento) {
        this.posicaoNoEvento = posicaoNoEvento;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    public String getTopicos() {
        return topicos;
    }

    public void setTopicos(String topicos) {
        this.topicos = topicos;
    }

    public String getPreRequisitos() {
        return preRequisitos;
    }

    public void setPreRequisitos(String preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public boolean isPublicarNoSite() {
        return publicarNoSite;
    }

    public void setPublicarNoSite(boolean publicarNoSite) {
        this.publicarNoSite = publicarNoSite;
    }

    public List<Intervalos> getIntervalos() {
        return intervalos;
    }

    public void setIntervalos(List<Intervalos> intervalos) {
        this.intervalos = intervalos;
    }

}
