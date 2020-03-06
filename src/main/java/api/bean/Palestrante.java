package api.bean;

import java.util.List;
import java.util.Objects;

public class Palestrante {

    private int id;
    private List<Member> member;
    private List<MiniBio> minibio;

    public Palestrante() {}

    public Palestrante(int id, List<Member> member, List<MiniBio> minibio) {
        this.id = id;
        this.member = member;
        this.minibio = minibio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }

    public List<MiniBio> getMinibio() {
        return minibio;
    }

    public void setMinibio(List<MiniBio> minibio) {
        this.minibio = minibio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palestrante that = (Palestrante) o;
        return id == that.id &&
                Objects.equals(member, that.member) &&
                Objects.equals(minibio, that.minibio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, member, minibio);
    }

    @Override
    public String toString() {
        return "Palestrante{" +
                "id=" + id +
                ", member=" + member +
                ", minibio=" + minibio +
                '}';
    }
}
