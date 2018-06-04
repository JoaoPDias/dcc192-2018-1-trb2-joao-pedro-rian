package Comandos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovoEventoCommand implements Comando {

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) {
        try {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/novoEvento.jsp");
            despachante.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(InscricaoCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InscricaoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
