package api.bean;

import java.util.Objects;

public class Palestra {

    private int id;
    private int slot;
    private int ordem;
    private String titulo;
    private String descricao;
    private int tipo;
    private String horario;

    public Palestra() {}

    public Palestra(int id, int slot, int ordem, String titulo, String descricao, int tipo, String horario) {
        this.id = id;
        this.slot = slot;
        this.ordem = ordem;
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palestra palestra = (Palestra) o;
        return id == palestra.id &&
                slot == palestra.slot &&
                ordem == palestra.ordem &&
                tipo == palestra.tipo &&
                Objects.equals(titulo, palestra.titulo) &&
                Objects.equals(descricao, palestra.descricao) &&
                Objects.equals(horario, palestra.horario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, slot, ordem, titulo, descricao, tipo, horario);
    }

    @Override
    public String toString() {
        return "Palestra{" +
                "id=" + id +
                ", slot=" + slot +
                ", ordem=" + ordem +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                ", horario='" + horario + '\'' +
                '}';
    }
}
