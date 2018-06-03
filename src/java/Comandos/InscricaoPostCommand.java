package Comandos;

import DAOs.ParticipanteDAO;
import Modelo.Participante;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InscricaoPostCommand implements Comando {

     @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        ParticipanteDAO dao = ParticipanteDAO.getInstance();
        Participante participante = new Participante(nome, email, senha);     
        try {
            dao.adicionar(participante);
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/login.jsp");
            despachante.forward(request, response);
        } catch (SQLException | ServletException | IOException ex) {
            Logger.getLogger(NovoEventoPostCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
