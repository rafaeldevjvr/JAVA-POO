public class CanetaTestar {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 0;

        c1.status();
        c1.tampar();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Vermelha";
        c2.ponta = 0.5f;
        c2.carga = 1;
        
        c2.status();
        c2.destampar();
        c2.rabiscar();
        
    }
}
