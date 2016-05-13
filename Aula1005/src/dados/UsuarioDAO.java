package dados;

import basicas.Usuario;

public class UsuarioDAO {

		
		public void inserirUsuario (Usuario u){
			
		}
	
		public Usuario pesquisarUsuario (String login){
			return null;
		}
		
		public boolean efetuarLogin (String log, String senha){
			if (log.equals (senha)){
				return true;	
			
			}else {
				return false;
			}
			
			
		
		}

}
	