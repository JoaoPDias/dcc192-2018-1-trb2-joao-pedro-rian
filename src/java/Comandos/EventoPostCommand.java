/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;

import DAOs.EventoDAO;
import DAOs.ParticipanteDAO;
import Modelo.Evento;
import Modelo.Participante;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rian Alves
 */
public class EventoPostCommand implements Comando {
    
    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) {
        String titulo = request.getParameter("titulo");
        String minimo = request.getParameter("minimo");
        String sorteio = request.getParameter("sorteio");
        String evento = request.getParameter("evento");
        EventoDAO dao = EventoDAO.getInstance();
        Evento novoEvento = new Evento(titulo,Double.parseDouble(minimo),sorteio,evento);     
        try {
            dao.adicionar(novoEvento);
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/index.jsp");
            despachante.forward(request, response);
        } catch (SQLException | ServletException | IOException ex) {
            Logger.getLogger(NovoEventoPostCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
