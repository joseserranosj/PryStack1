import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Url {
    private int codigo;
    private  String ruta;
    private LocalDate fecha;

    public Url(int codigo, String ruta) {
        this.codigo = codigo;
        this.ruta = ruta;
        fecha=LocalDate.now();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yy");
        return "Url:" +
                "codigo:" + codigo +
                ", ruta:" + ruta +
                ", fecha:" + fecha.format(formato);
    }
}
