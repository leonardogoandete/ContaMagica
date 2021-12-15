import java.math.BigDecimal;

public class app {
    public static void main(String[] args) {
        ContaMagica contaA = new ContaMagica("Leonardo");


            System.out.println("Conta:" + contaA.getNomeCliente() + "\nTipo:" + contaA.getStatus());
            System.out.println("Saldo: R$" + contaA.getSaldo());

            contaA.deposito(BigDecimal.valueOf(100000));
            System.out.println("Saldo: R$" + contaA.getSaldo());


        contaA.deposito(BigDecimal.valueOf(100000));
            System.out.println("Status:" + contaA.getStatus());
            System.out.println("Saldo: R$" + contaA.getSaldo());

    }
}
