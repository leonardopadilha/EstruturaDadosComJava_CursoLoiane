package estruturaDeDados.vetor;

class VetorTest {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("Curso");
        vetor.adiciona("Estrutura de Dados");

        System.out.println(vetor.getTamanho());
        System.out.println(vetor);
    }


}