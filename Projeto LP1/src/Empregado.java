
public class Empregado {

	private int Codigo;
	private String Nome;
	private String DataAdmissao;
	private String Cargo;
	private String Departamento;
	private int Tipo;
	
	public Empregado() {
		
	}
	
	
	
	public int getTipo() {
		return Tipo;
	}
		
	
	public void setTipo(int Tipo) {
		this.Tipo = Tipo;
	}
	
	
	public int getCodigo() {
		return Codigo;
	}
	
	public void setCodigo(int Codigo) {
		this.Codigo = Codigo;
	}
	
	
	
	public String getNome() {
		return Nome;
	} 
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public String getDataAdmissao() {
		return DataAdmissao;
		
	}
	
	public void setDataAdmissao(String DataAdmissao) {
		this.DataAdmissao = DataAdmissao;
	}
	
	
	public String getCargo() {
		return Cargo;
	}
	
	public void setCargo(String Cargo) {
		this.Cargo = Cargo;
	}
	
	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String Departamento) {
		this.Departamento = Departamento;
	}

}
