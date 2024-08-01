package conta.banco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o n�mero da conta: ");
        Integer conta = scanner.nextInt();
        
        System.out.print("Informe a ag�ncia: ");
        String agencia = scanner.next();
        
        System.out.print("Informe seu nome: ");
        String nomeCliente = scanner.next();
        
        System.out.print("Informe o n�mero da conta: ");
        Double saldo = scanner.nextDouble();
        
        System.out.println(String.format("Ol� %s, obrigado por criar uma conta em nosso banco, sua ag�ncia � %s, conta %d e seu saldo R$ %.2f j� est� dispon�vel para saque.", 
        								  nomeCliente, agencia, conta, saldo));
	}
}
