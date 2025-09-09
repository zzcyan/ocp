public class Main {
    public static void main(String[] args) {
        Contrato contrato = new Contrato(3000.0f);
        Estagio estagio = new Estagio(1200.0f);
        CLT clt = new CLT(4000.0f, 800.0f);
        
        Folha folha = new Folha();
        
        folha.calcular(contrato);
        System.out.println("Contrato: " + folha.getSaldo());
        
        folha.calcular(estagio);
        System.out.println("Estagio: " + folha.getSaldo());
        
        folha.calcular(clt);
        System.out.println("CLT: " + folha.getSaldo());
    }
}