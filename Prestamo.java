Public class Prestamo{
    int ID;
    String Usuario;
    String Dias;
    int DiasPrestamos;
    double MultaporDia;

    public Prestamo( int ID, String Usuario, String Dias, int DiasPrestamos, double MultaporDia ){
    this.ID = ID;
    this.Usuario = Usuario;
    this.Dias = Dias;
    this.DiasPrestamos = DiasPrestamos;
    this.MultaporDia = MultaporDia;
    }
    public void mostrarPrestamo(){
        System.out.println("ID"+ID);
        System.out.println("Usuario"+Usuario);
        System.out.println("Dias"+Dias);
        System.out.println("DiasPrestamos"+DiasPrestamos);
        System.out.println("MultaporDia"+MultaporDia);
        System.out.println("--------------------------");

    }
    }
