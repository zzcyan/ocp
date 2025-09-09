public class Folha {
    private float saldo;
    
    public void calcular(Pagamento p) {
        saldo = p.calcularValor();
    }
    
    public float getSaldo() {
        return saldo;
    }
}