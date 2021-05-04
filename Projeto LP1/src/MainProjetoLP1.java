import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainProjetoLP1 {

	// ArrayList<String> cadastrarEmpregado = new ArrayList<String>();
	// private static final List cadastrar = new ArrayList<>();

	private static final ArrayList<Empregado> cadastrar = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao = 0;

		do {

			System.out.println("Sistema Empregaticio");
			System.out.println("----------------------");
			System.out.println("Informe");
			System.out.println("[0]Cadastrar Empregado");
			System.out.println("[1] Exibir Empregado");
			System.out.println("[3] Sair");
			opcao = sc.nextInt();

			if (opcao == 0) {
				System.out.println("Cadastramendo de Empregado");
				System.out.println("---------------------------");
				System.out.println("Informe o código: ");
				int codigo = sc.nextInt();
				System.out.println("Informe o nome do Empregado: ");
				String nome = sc.next();
				System.out.println("Informe a data de Admissao: ");
				String dataAdmissao = sc.next();
				System.out.println("Informe o cargo: ");
				String cargo = sc.next();
				System.out.println("Informe o Departamento: ");
				String departamento = sc.next();
				System.out.println(
						"Informe o tipo de Empregado\n Selecione:\n 4 (Assalariado)\n 5 (Comissionado)\n 6 (Horista)");
				int tipo = sc.nextInt();

				float salario = 0;

				float percentual = 0;

				float valorHora = 0;

				if (tipo == 4) {
					System.out.println("Informe o Valor do salário: ");
					salario = sc.nextFloat();

				}

				else if (tipo == 5) {
					System.out.println("Informe o percentual Comissão: ");
					percentual = sc.nextFloat();

				}

				else if (tipo == 6) {
					System.out.println("Informe o valor da hora trabalhada: ");
					valorHora = sc.nextFloat();

				}

				addEmpregado(codigo, nome, dataAdmissao, cargo, departamento, salario, percentual, valorHora, tipo);

			} else if (opcao == 1) {

				if (cadastrar.size() == 0) {
					System.out.println("Não existe Empregados Cadastrados");
				} else {
					for (Empregado empregado : cadastrar) {
						System.out.println("Código         : " + Integer.toString(empregado.getCodigo()));
						System.out.println("Nome        : " + empregado.getNome());
						System.out.println("Data         : " + empregado.getDataAdmissao());
						System.out.println("Cargo       : " + empregado.getCargo());
						System.out.println("Departamento        : " + empregado.getDepartamento()); 

						int tipo = empregado.getTipo();

						if (tipo == 4) {

							Assalariado as = new Assalariado();
							as = (Assalariado) empregado;
							System.out.println("Salário: " + as.getValorSalario());

						} else if (tipo == 5) {

							Comissionado cm = new Comissionado();
							cm = (Comissionado) empregado;
							System.out.println("Comissão:  " + cm.getPercentualComissao());

						}

						else if (tipo == 6) {
							Horista hr = new Horista();
							hr = (Horista) empregado;
							System.out.println("Horista: " + hr.getValorHora());
						}
					}
				}
			}

		} while (opcao != 3);

	}

	public static void addEmpregado(int codigo, String nome, String dataAdmissao, String cargo, String departamento,
			float salario, float percentual, float valorHora, int tipo) {

		if (tipo == 4) {

			Assalariado emp = new Assalariado();
			emp.setTipo(tipo);
			emp.setCodigo(codigo);
			emp.setNome(nome);
			emp.setDataAdmissao(dataAdmissao);
			emp.setCargo(cargo);
			emp.setDepartamento(departamento);
			//
			emp.setValorSalario(salario);
			//
			cadastrar.add(emp);

		}

		else if (tipo == 5) {
			Comissionado emp = new Comissionado();
			emp.setCodigo(codigo);
			emp.setTipo(tipo);
			emp.setNome(nome);
			emp.setDataAdmissao(dataAdmissao);
			emp.setCargo(cargo);
			emp.setDepartamento(departamento);
			//
			emp.setPercentualComissao(percentual);
			//
			cadastrar.add(emp);

		}

		else if (tipo == 6) {
			Horista emp = new Horista();
			emp.setTipo(tipo);
			emp.setCodigo(codigo);
			emp.setNome(nome);
			emp.setDataAdmissao(dataAdmissao);
			emp.setCargo(cargo);
			emp.setDepartamento(departamento);
			//
			emp.setValorHora(valorHora);
			//
			cadastrar.add(emp);
		}

	}

	public static void addEmpregado(Empregado newEmpregado) {

	}
}
