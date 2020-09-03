package default_package;

public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(1334, 24226);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        conta.setTitular(paulo);
        paulo.setNome("paulo silveira");
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");

    }
}
