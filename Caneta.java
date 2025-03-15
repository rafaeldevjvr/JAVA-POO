public class Caneta {
    
    //atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //métodos
    void status() {
        System.out.println("Uma caneta modelo: " + this.modelo);
        System.out.println("Uma caneta cor: " + this.cor);
        System.out.println("Número de ponta: " + this.ponta);
        System.out.println("Quantidades de carga: " + this.carga);
        System.out.println("Uma caneta azul está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar.");           
        } else {
            System.out.println("Estou rabiscando...");
        }

    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
