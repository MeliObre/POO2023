public class Libro {
    private String titulo;
    private String autor;
    private int ejemPrestados;
    private int paginas;
    private int ejemplares;

    public Libro (String titulo, String autor, int paginas, int ejemplares){
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
        this.ejemplares=ejemplares;
        this.ejemPrestados= 0;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getPaginas(){
        return paginas;
    }
    public int getEjemplares(){
        return ejemplares;
    }
    public int getEjemPrestados(){
        return ejemPrestados;
    }
    public void prestar(){
        if (ejemplares > ejemPrestados){
            ejemPrestados++;
        }else {
            System.out.print(" No hay ejemplares disponibles para prestar");
        }
    }
    public void devolver(){
        if (ejemPrestados>0){
            ejemPrestados--;
        }else {
            System.out.print(" No hay ejemplares prestados para devolver");
        }
    }
    public String toString() {
        return "Libro: '" + titulo + "' escrito por el autor '" + autor + "' tiene " + paginas +
                " páginas, quedan " + (ejemplares - ejemPrestados) + " disponibles y se prestaron "
                + ejemPrestados + ".\n";
    }
}
