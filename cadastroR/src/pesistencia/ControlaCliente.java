package pesistencia;
import negocio.Cliente;
import java.util.*;



public class ControlaCliente {
		ArrayList<Cliente> cliente = new ArrayList<>();
		
		public boolean salvar (Cliente c){
			if (c!=null) {
				cliente.add(c);
				return true;
			}else {
				return false;
			}
			
		}
		
		public ArrayList<Cliente> retornarTodos(){
			return cliente;
		}

}
