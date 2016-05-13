package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.UsuarioDAO;


@WebServlet("/servletLogar")
public class servletLogar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
    public servletLogar() {
        super();
           
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    //	super.service(arg0, arg1);
    
    System.out.println("Bem vindo");
    String l = request.getParameter ("login");
    String s = request.getParameter ("senha");
    System.out.println(l);
    System.out.println(s);
    
    
    UsuarioDAO dao = new UsuarioDAO ();
    boolean retorno = dao.efetuarLogin(l, s);
    if (retorno){
    	System.out.println("LOGADO");
    }
    
    
    
    
    
    }
    
    
}