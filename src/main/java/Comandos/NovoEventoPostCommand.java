package Comandos;

import DAOs.EventoDAO;
import Modelo.Evento;
import Modelo.Participante;
import com.google.gson.Gson;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovoEventoPostCommand implements Comando {

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) {
        String titulo = request.getParameter("titulo");
        Double minimo = Double.parseDouble(request.getParameter("minimo"));
        String dtsorteio = request.getParameter("sorteio");
        String dtevento = request.getParameter("evento");
        EventoDAO dao = EventoDAO.getInstance();
        Evento evento = new Evento(titulo, minimo,dtevento,dtsorteio);
        try {
            dao.adicionar(evento);
            List<Evento> eventos = dao.listAll();
            Gson gson = new Gson();
            String eventosJson = gson.toJson(eventos);
            request.setAttribute("eventos", eventosJson);
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/index.jsp");
            despachante.forward(request, response);
        } catch (ServletException | IOException | SQLException ex) {
            Logger.getLogger(NovoEventoPostCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
