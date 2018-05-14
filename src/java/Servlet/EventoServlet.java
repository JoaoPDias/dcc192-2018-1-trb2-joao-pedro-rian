/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EventoServlet", urlPatterns = {"/eventos.html", "/index.html", "/inscricao.html", "/inscritos.html", "/novo-evento.html", "/amigo.html"})
public class EventoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> rotas = new HashMap<>();
        rotas.put("/eventos.html", "Comandos.EventoCommand");
        rotas.put("/index.html", "Comandos.IndexCommand");
        rotas.put("/inscricao.html", "Comandos.InscricaoCommand");
        rotas.put("/inscritos.html", "Comandos.InscritosCommand");
        rotas.put("/novo-evento.html", "Comandos.NovoEventoCommand");
        rotas.put("/amigo.html", "Comandos.AmigoCommand");
    }
    
}
