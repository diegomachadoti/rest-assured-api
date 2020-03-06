package api.bean;

import java.util.Objects;

public class Member {

    private int id;
    private String nome;
    private String empresa;
    private String funcao;

    public Member() {}

    public Member(int id, String nome, String empresa, String funcao) {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
        this.funcao = funcao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id == member.id &&
                Objects.equals(nome, member.nome) &&
                Objects.equals(empresa, member.empresa) &&
                Objects.equals(funcao, member.funcao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, empresa, funcao);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", empresa='" + empresa + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }
}
