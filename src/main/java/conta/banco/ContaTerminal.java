package conta.banco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o número da conta: ");
        Integer conta = scanner.nextInt();
        
        System.out.print("Informe a agência: ");
        String agencia = scanner.next();
        
        System.out.print("Informe seu nome: ");
        String nomeCliente = scanner.next();
        
        System.out.print("Informe o número da conta: ");
        Double saldo = scanner.nextDouble();
        
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", 
        								  nomeCliente, agencia, conta, saldo));
	}
}
