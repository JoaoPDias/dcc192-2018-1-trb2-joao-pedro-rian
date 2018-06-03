package DAOs;

import Modelo.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventoDAO {

    private static Connection conexao;
    private static EventoDAO dao;

    public EventoDAO() throws SQLException {
        this.conexao = Conexao.getInstance();
    }

    public static EventoDAO getInstance() {
        if (dao == null) {
            try {
                dao = new EventoDAO();
            } catch (SQLException ex) {
                Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dao;
    }

    public List<Evento> listAll() throws SQLException {
        List<Evento> eventos = new ArrayList<>();
        PreparedStatement consulta = conexao.prepareStatement("Select * from evento");
        ResultSet resultado = consulta.executeQuery();
        while (resultado.next()) {
            eventos.add(new Evento(resultado.getInt("codigo"), resultado.getString("titulo"), resultado.getDouble("minimo"), resultado.getString("dataevento"), resultado.getString("datasorteio")));
        }
        return eventos;
    }

    public void adicionar(Evento evento) throws SQLException {
        String sql = "INSERT INTO EVENTO(titulo, minimo,dataevento,datasorteio) VALUES(?,?,?,?)";
        try (PreparedStatement comando = conexao.prepareStatement(sql)) {
            comando.setString(1, evento.getTitulo());
            comando.setDouble(2, evento.getValorMinimo());
            comando.setString(3, evento.getDataEvento());
            comando.setString(4, evento.getDataEvento());
            comando.execute();
            comando.close();
        }
    }
    
    public void alterar(Evento evento) throws SQLException{
        String sql = "UPDATE evento SET(titulo = ?,"
                + " minimo = ?,"
                + "dataevento = ?,"
                + "datasorteio = ?"
                + " WHERE codigo = ? ";
        try (PreparedStatement comando = conexao.prepareStatement(sql)) {
            comando.setString(1, evento.getTitulo());
            comando.setDouble(2, evento.getValorMinimo());
            comando.setString(3, evento.getDataEvento());
            comando.setString(4, evento.getDataEvento());
            comando.setInt(5, evento.getCodigo());
            comando.execute();
            comando.close();
        }
    }
    
    public void excluir (Evento evento) throws SQLException{
    String sql = "DELETE FROM EVENTO WHERE CODIGO = ?";
        try (PreparedStatement comando = conexao.prepareStatement(sql)) {
            comando.setInt(1, evento.getCodigo());
            comando.execute();
            comando.close();
        }
    }
}
