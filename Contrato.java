public class Contrato implements Pagamento {
    private float salario;
    
    public Contrato(float salario) {
        this.salario = salario;
    }
    
    public float calcularValor() {
        return salario;
    }
}