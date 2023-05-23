package hospital;

import java.util.Queue;

public class Fila {
	private Queue<Paciente> filaN ;
	private Queue<Paciente> filaL ;
	private Queue<Paciente> filaS ;
	private Queue<Paciente> filaM ;

	
	public void criarSenha(String nome, String cpf, int prioridade) {
		Paciente paciente = new Paciente(nome,cpf,prioridade);
		if (prioridade == 0) {
			filaN.add(paciente);
		}
		if (prioridade == 1) {
			filaL.add(paciente);
		}
		if (prioridade == 2) {
			filaM.add(paciente);
		}
		if (prioridade == 3) {
			filaS.add(paciente);		
		}
	}
	
	public int totalPacientesNaFila() {
		return filaN.size() + filaL.size() + filaM.size() + filaS.size();
		
	}
	
	
	
	
}
