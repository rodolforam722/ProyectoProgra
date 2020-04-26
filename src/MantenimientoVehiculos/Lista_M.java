package MantenimientoVehiculos;
public class Lista_M {
    private String listaCarro;
    private String listaMoto;
    private String listaCamioneta;
    private String listaBici;
    private String listaMotocross;
    
    public Lista_M (String listaCarro,String listaMoto, String listaCamioneta, String listaBici, String listaMotocross ) {
        this.listaCarro = listaCarro;
        this.listaMoto = listaMoto;
        this.listaCamioneta = listaCamioneta;
        this.listaBici = listaBici;
        this.listaMotocross = listaMotocross;
    }

    public String getListaCarro() {
        return listaCarro;
    }

    public void setListaCarro(String listaCarro) {
        this.listaCarro = listaCarro;
    }

    public String getListaMoto() {
        return listaMoto;
    }

    public void setListaMoto(String listaMoto) {
        this.listaMoto = listaMoto;
    }

    public String getListaCamioneta() {
        return listaCamioneta;
    }

    public void setListaCamioneta(String listaCamioneta) {
        this.listaCamioneta = listaCamioneta;
    }

    public String getListaBici() {
        return listaBici;
    }

    public void setListaBici(String listaBici) {
        this.listaBici = listaBici;
    }

    public String getListaMotocross() {
        return listaMotocross;
    }

    public void setListaMotocross(String listaMotocross) {
        this.listaMotocross = listaMotocross;
    }
    
}
