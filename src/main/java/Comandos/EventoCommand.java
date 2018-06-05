package Comandos;

import DAOs.EventoDAO;
import Modelo.Evento;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EventoCommand implements Comando {

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) {

        try {
            Integer id = Integer.parseInt(request.getParameter("usuario"));
            EventoDAO dao = EventoDAO.getInstance();
            List<Evento> eventos = dao.listByIDCriador(id);
            RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/eventos.jsp");
            request.setAttribute("eventos", eventos);
            request.setAttribute("usuario", id);
            dispacher.forward(request, response);
            
       } catch (ServletException | IOException | SQLException ex) {
            Logger.getLogger(EventoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
