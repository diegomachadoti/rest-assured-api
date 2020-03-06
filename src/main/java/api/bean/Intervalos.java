package api.bean;

import java.util.Objects;

public class Intervalos {

    private String horario;
    private String titulo;
    private String descricao;
    private int duracao;

    public Intervalos() {}

    public Intervalos(String horario, String titulo, String descricao, int duracao) {
        this.horario = horario;
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Intervalos that = (Intervalos) o;
        return duracao == that.duracao &&
                Objects.equals(horario, that.horario) &&
                Objects.equals(titulo, that.titulo) &&
                Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horario, titulo, descricao, duracao);
    }
}
