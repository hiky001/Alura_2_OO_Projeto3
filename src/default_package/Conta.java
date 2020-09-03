package default_package;

class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    //static atributo da classe, não mais da referencia this
    private static int total;

    /**
     * Construtor da classe conta
     * @param agencia Necessário passar a agência da conta
     * @param numero Necessário passar o número da conta
     */
    public Conta(int agencia, int numero){
        total++;
        //System.out.println("O total de contas abertas até agora é " + total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou abrindo uma conta de número " + this.numero);
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (saldo >= valor){
            this.saldo -= valor;
            return true;
        }else {
            System.out.println("Você não tem o dinheiro que quer sacar na sua conta!");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if (numero <= 0){
            System.out.println("Numero negativo ou igual a 0 inválido");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("Valores menor ou igual a zero inválido");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //Metodo é static para poder ser usado direto da classe, como pertencente da classe Conta, n mais ref
    public static int getTotalDeContasAbertasAteOMomento(){
        return Conta.total;
        //Ou poderia ser return total, o Conta.total diz que o total não é um objeto de referencia, e sim
        //pertence a classe Conta
    }
};
