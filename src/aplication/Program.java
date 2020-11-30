package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de funcionários: ");
		int n = sc.nextInt();

		List<Funcionario> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionário #" + i);

			System.out.println
			("O funcionário é terceirizado? (s/n)? ");
			char ch = sc.next().charAt(0);

			System.out.println("Nome ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Horas: ");
			int horas = sc.nextInt();

			System.out.println("Valor por hora: ");
			double valorPorHora = sc.nextDouble();

			if (ch == 'S') {
				System.out.println("Cobrança adicionaç: ");
				double cobrancaAdicional = sc.nextDouble();
				list.add(new FuncionarioTerceirizado(name, horas, valorPorHora, cobrancaAdicional));
			} 
			
			else {
				list.add(new Funcionario(name, horas, valorPorHora));
			}
			
			System.out.println();
			System.out.println("PAGAMENTOS: ");
			
			for(Funcionario fun: list) {
				System.out.println(fun.getName() + " - $" + String.format("%.2f",fun.pagamento()));
			}
			
			
			sc.close();
		}
	}
}
