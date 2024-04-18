package ejercicios10_10;

import java.time.LocalDate;

public class Media {

    private int iD;
    private String titulo;
    private String artistaPrincipal;
    private String productora;
    private LocalDate fechaPublicacion;
    private TipoMedio tipo;

    public Media(int iD, String titulo, String artistaPrincipal, String productora, LocalDate fechaPublicacion, TipoMedio tipoMedio) {
        this.iD = iD;
        this.titulo = titulo;
        this.artistaPrincipal = artistaPrincipal;
        this.productora = productora;
        this.fechaPublicacion = fechaPublicacion;
        this.tipo = tipoMedio;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public void setArtistaPrincipal(String artistaPrincipal) {
        this.artistaPrincipal = artistaPrincipal;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public TipoMedio getTipo() {
        return tipo;
    }

    public void setTipo(TipoMedio tipoMedio) {
        this.tipo = tipoMedio;
    }
}
