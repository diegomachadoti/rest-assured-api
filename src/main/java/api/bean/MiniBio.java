package api.bean;

import java.util.Objects;

public class MiniBio {

    private int id;
    private String chave;
    private String texto;
    private String urlFoto;
    private String urlTwitter;
    private String urlTFacebook;
    private String urlBlog1;
    private String urlLinkedin;
    private String urlSite;
    private String urlRepositorio;
    private String urlOutro;

    public MiniBio() {}

    public MiniBio(int id, String chave, String texto, String urlFoto, String urlTwitter, String urlTFacebook, String urlBlog1, String urlLinkedin, String urlSite, String urlRepositorio, String urlOutro) {
        this.id = id;
        this.chave = chave;
        this.texto = texto;
        this.urlFoto = urlFoto;
        this.urlTwitter = urlTwitter;
        this.urlTFacebook = urlTFacebook;
        this.urlBlog1 = urlBlog1;
        this.urlLinkedin = urlLinkedin;
        this.urlSite = urlSite;
        this.urlRepositorio = urlRepositorio;
        this.urlOutro = urlOutro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getUrlTwitter() {
        return urlTwitter;
    }

    public void setUrlTwitter(String urlTwitter) {
        this.urlTwitter = urlTwitter;
    }

    public String getUrlTFacebook() {
        return urlTFacebook;
    }

    public void setUrlTFacebook(String urlTFacebook) {
        this.urlTFacebook = urlTFacebook;
    }

    public String getUrlBlog1() {
        return urlBlog1;
    }

    public void setUrlBlog1(String urlBlog1) {
        this.urlBlog1 = urlBlog1;
    }

    public String getUrlLinkedin() {
        return urlLinkedin;
    }

    public void setUrlLinkedin(String urlLinkedin) {
        this.urlLinkedin = urlLinkedin;
    }

    public String getUrlSite() {
        return urlSite;
    }

    public void setUrlSite(String urlSite) {
        this.urlSite = urlSite;
    }

    public String getUrlRepositorio() {
        return urlRepositorio;
    }

    public void setUrlRepositorio(String urlRepositorio) {
        this.urlRepositorio = urlRepositorio;
    }

    public String getUrlOutro() {
        return urlOutro;
    }

    public void setUrlOutro(String urlOutro) {
        this.urlOutro = urlOutro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MiniBio miniBio = (MiniBio) o;
        return id == miniBio.id &&
                Objects.equals(chave, miniBio.chave) &&
                Objects.equals(texto, miniBio.texto) &&
                Objects.equals(urlFoto, miniBio.urlFoto) &&
                Objects.equals(urlTwitter, miniBio.urlTwitter) &&
                Objects.equals(urlTFacebook, miniBio.urlTFacebook) &&
                Objects.equals(urlBlog1, miniBio.urlBlog1) &&
                Objects.equals(urlLinkedin, miniBio.urlLinkedin) &&
                Objects.equals(urlSite, miniBio.urlSite) &&
                Objects.equals(urlRepositorio, miniBio.urlRepositorio) &&
                Objects.equals(urlOutro, miniBio.urlOutro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chave, texto, urlFoto, urlTwitter, urlTFacebook, urlBlog1, urlLinkedin, urlSite, urlRepositorio, urlOutro);
    }

    @Override
    public String toString() {
        return "MiniBio{" +
                "id=" + id +
                ", chave='" + chave + '\'' +
                ", texto='" + texto + '\'' +
                ", urlFoto='" + urlFoto + '\'' +
                ", urlTwitter='" + urlTwitter + '\'' +
                ", urlTFacebook='" + urlTFacebook + '\'' +
                ", urlBlog1='" + urlBlog1 + '\'' +
                ", urlLinkedin='" + urlLinkedin + '\'' +
                ", urlSite='" + urlSite + '\'' +
                ", urlRepositorio='" + urlRepositorio + '\'' +
                ", urlOutro='" + urlOutro + '\'' +
                '}';
    }
}
