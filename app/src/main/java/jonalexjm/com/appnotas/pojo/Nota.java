package jonalexjm.com.appnotas.pojo;

/**
 * Created by andrea on 13/09/2016.
 */
public class Nota {

    private String id;
    private String titulo;
    private String contenido;
    private int diaNota;
    private int mesNota;
    private int annoNota;
    private int horaNota;
    private int minutoNota;


    public Nota() {
    }

    public Nota(String contenido, String titulo, int diaNota, int horaNota) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.diaNota = diaNota;
        this.horaNota = horaNota;
    }

    public Nota(String id, String titulo, String contenido, int diaNota, int mesNota, int annoNota, int minutoNota, int horaNota) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.diaNota = diaNota;
        this.mesNota = mesNota;
        this.annoNota = annoNota;
        this.minutoNota = minutoNota;
        this.horaNota = horaNota;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getDiaNota() {
        return diaNota;
    }

    public void setDiaNota(int diaNota) {
        this.diaNota = diaNota;
    }

    public int getMesNota() {
        return mesNota;
    }

    public void setMesNota(int mesNota) {
        this.mesNota = mesNota;
    }

    public int getAnnoNota() {
        return annoNota;
    }

    public void setAnnoNota(int annoNota) {
        this.annoNota = annoNota;
    }

    public int getHoraNota() {
        return horaNota;
    }

    public void setHoraNota(int horaNota) {
        this.horaNota = horaNota;
    }

    public int getMinutoNota() {
        return minutoNota;
    }

    public void setMinutoNota(int minutoNota) {
        this.minutoNota = minutoNota;
    }
}
