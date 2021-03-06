package Servlet;

import Comandos.Comando;
import DAOs.EventoDAO;
import Modelo.Evento;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EventoServlet", urlPatterns = {"/eventos.html", "/sorteio.html","/index.html", "/inscricao.html", "/inscritos.html", "/novo-evento.html", "/amigo.html","/registro.html","/inicial.html"})
public class EventoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.verificaSorteio();
        Map<String, String> rotas = new HashMap<>();
        rotas.put("/eventos.html", "Comandos.EventoCommand");
        rotas.put("/index.html", "Comandos.LoginCommand");
        rotas.put("/inicial.html", "Comandos.IndexCommand");
        rotas.put("/registro.html", "Comandos.RegistroCommand");
        rotas.put("/inscritos.html", "Comandos.InscritosCommand");
        rotas.put("/inscricao.html", "Comandos.InscricaoCommand");
        rotas.put("/novo-evento.html", "Comandos.NovoEventoCommand");
        rotas.put("/amigo.html", "Comandos.AmigoCommand");
        rotas.put("/sorteio.html", "Comandos.SorteioCommand");
        
        String clazzName = rotas.get(request.getServletPath());
        try{
            Comando comando = (Comando)Class.forName(clazzName).newInstance();
            comando.exec(request, response);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(EventoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.verificaSorteio();
        Map<String, String> rotas = new HashMap<>();        
        rotas.put("/index.html", "Comandos.LoginPostCommand");
        rotas.put("/inscricao.html", "Comandos.InscricaoPostCommand");
        rotas.put("/registro.html", "Comandos.RegistroPostCommand");
        rotas.put("/novo-evento.html", "Comandos.NovoEventoPostCommand");
        
        String clazzName = rotas.get(request.getServletPath());
        try{
            Comando comando = (Comando)Class.forName(clazzName).newInstance();
            comando.exec(request, response);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(EventoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void verificaSorteio(){
        
        try {
            List<Evento> eventos = EventoDAO.getInstance().listByDataSorteio();
            if(!eventos.isEmpty()){
                for(Evento evento: eventos){
                    evento.sorteia();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(EventoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
