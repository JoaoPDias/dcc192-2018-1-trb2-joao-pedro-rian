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
            EventoDAO dao = EventoDAO.getInstance();
            List<Evento> eventos = dao.listAll();
            RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/index.jsp");
            request.setAttribute("eventos", eventos);
            dispacher.forward(request, response);
            
       } catch (ServletException | IOException | SQLException ex) {
            Logger.getLogger(EventoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
