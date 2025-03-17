public class Curso {
    
    //atributos
    String título;
    String aula;
    int modulo;
    int minutos;
    double avaliacao;
    boolean play = true;

    //métodos
     void descricao() {
        System.out.println("Nome do curso: " + this.título);
        System.out.println("Aula: " + this.aula);
        System.out.println("Módulo: " + this.modulo);
        System.out.println("Total de horas: " + this.minutos + " min");
        System.out.println("Avaliação: " + this.avaliacao);
     }

     void assistir() {
        if (play == true) {
            System.out.println("A aula está sendo assistida.");
            
        } else {
            System.out.println("A aula não está liberada no momento X.");
        }

     }
}
