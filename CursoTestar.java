public class CursoTestar {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        
        curso1.título = "Programação";
        curso1.aula = "Aplicando conceitos de Java";
        curso1.modulo = 01;
        curso1.minutos = 45;
        curso1.avaliacao = 9.8;
        curso1.descricao();
        curso1.assistir();
    }
    
}
