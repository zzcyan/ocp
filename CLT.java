public class CLT implements Pagamento {
    private float salarioBase;
    private float beneficios;
    
    public CLT(float salarioBase, float beneficios) {
        this.salarioBase = salarioBase;
        this.beneficios = beneficios;
    }
    
    public float calcularValor() {
        return salarioBase + beneficios;
    }
}