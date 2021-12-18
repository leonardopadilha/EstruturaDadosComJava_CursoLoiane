package estruturaDeDados.vetor;

class VetorTest {
    public static void main(String[] args) {
        try {
            Vetor vetor = new Vetor(1);
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}