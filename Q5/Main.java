package Q5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		ArrayList<Gerente> gerentes = new ArrayList<Gerente>();

		funcionarios.add(new Funcionario("Emerson", "000", "12/12", 1000));
		gerentes.add(new Gerente("Emerson2", "111", "12/12", 1000, "TI"));
		Scanner s = new Scanner(System.in);
		try {

			while (true) {
				System.out.println("1 - Adicionar Funcionário\n" + "2 - Adicionar Gerente\n"
						+ "3 - Obter salário de funcionário\n" + "4 - Obter salário de gerente\n" + "0 - Sair");
				int op = s.nextInt();

				switch (op) {

				case 0:
					System.exit(0);
					break;

				case 1:
					String nomeFunc = s.next();
					String cpfFunc = s.next();
					String dtNascFunc = s.next();
					double salarioFunc = s.nextDouble();
					funcionarios.add(new Funcionario(nomeFunc, cpfFunc, dtNascFunc, salarioFunc));
					break;

				case 2:
					String nomeGer = s.next();
					String cpfGer = s.next();
					String dtNascGer = s.next();
					double salarioGer = s.nextDouble();
					String dptGer = s.next();
					gerentes.add(new Gerente(nomeGer, cpfGer, dtNascGer, salarioGer, dptGer));
					break;

				case 3:
					System.out.println("Informe o cpf do funcionário");
					String aux1 = s.next();
					for (Funcionario f : funcionarios) {
						if (aux1.equals(f.getCpf())) {
							System.out.println(f.getSalario());
						}
					}
					break;
				case 4:
					System.out.println("Informe o cpf do Gerente");
					String aux2 = s.next();
					for (Gerente g : gerentes) {
						if (aux2.equals(g.getCpf())) {
							System.out.println(g.getSalario());
						}

					}
					break;
				}
			}

		} catch (Error e) {
			System.out.println(e.getMessage());
		} finally {
			s.close();
		}

	}
}
