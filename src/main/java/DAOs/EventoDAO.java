package DAOs;

import Modelo.Evento;
import Modelo.Participante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventoDAO {

    private static Connection conexao;
    private static EventoDAO dao;
    private static ParticipanteDAO Participantedao;

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
            Participante criador = Participantedao.listbyID(resultado.getInt("codcriador"));
            eventos.add(new Evento(resultado.getInt("codigo"), resultado.getString("titulo"), resultado.getDouble("minimo"), resultado.getString("dataevento"), resultado.getString("datasorteio"),criador));
        }
        return eventos;
    }

    public void adicionar(Evento evento) throws SQLException {
        String sql = "INSERT INTO EVENTO(titulo, minimo,dataevento,datasorteio,codcriador) VALUES(?,?,?,?,?)";
        Integer idEvento=null;
        try (PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            comando.setString(1, evento.getTitulo());
            comando.setDouble(2, evento.getValorMinimo());
            comando.setString(3, evento.getDataEvento());
            comando.setString(4, evento.getDataSorteio());
            comando.setInt(4, evento.getCriador().getCodigo());
            comando.execute();
            ResultSet rs = comando.getGeneratedKeys();
            if(rs.next()){
                idEvento = rs.getInt(1);
            }
            comando.close();
        }
        
        sql = "INSERT INT EVENTO_PARTICIPANTE(CODEVENTO, CODPARTICIPANTE) VALUSE (?,?)";
        try (PreparedStatement comando = conexao.prepareStatement(sql)) {
            comando.setInt(1, idEvento);
            comando.setInt(2, evento.getCriador().getCodigo());
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
            comando.setString(4, evento.getDataSorteio());
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
    
     public List<Evento> listByIDCriador(Integer id) throws SQLException {
        List<Evento> eventos = new ArrayList<>();
        PreparedStatement consulta = conexao.prepareStatement("Select * from evento where CODCRIADOR = ?");
        consulta.setInt(1,id);
        ResultSet resultado = consulta.executeQuery();
        while (resultado.next()) {      
            Participante criador = Participantedao.listbyID(resultado.getInt("codcriador"));
            eventos.add(new Evento(resultado.getInt("codigo"), resultado.getString("titulo"), resultado.getDouble("minimo"), resultado.getString("dataevento"), resultado.getString("datasorteio"),criador));
        }
        return eventos;
    }
}
