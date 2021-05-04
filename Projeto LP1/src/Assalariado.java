
public class Assalariado extends Empregado implements ICeletista {
	private float ValorSalario;
	
	public Assalariado() {
	}
	
	
	public float getValorSalario() {
		return ValorSalario;
	} 
	
	public void setValorSalario(float ValorSalario) {
		this.ValorSalario = ValorSalario;
	}


	@Override
	public void informeRAIS() {
		// TODO Auto-generated method stub
		
	}

}
