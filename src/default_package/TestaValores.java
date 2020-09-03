package default_package;

public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1334, 24226);
        System.out.println("E agência número " + conta.getAgencia());
        //para instanciar um metodo static, chamar direto da classe Conta.metodoDaClasse();
        System.out.println("Total de contas abertas ate agora é "
                + Conta.getTotalDeContasAbertasAteOMomento());
        System.out.println();

        Conta conta2 = new Conta(1334, 16549);
        System.out.println("E agência número " + conta.getAgencia());
        System.out.println("Total de contas abertas ate agora é "
                + Conta.getTotalDeContasAbertasAteOMomento());
    }
}
