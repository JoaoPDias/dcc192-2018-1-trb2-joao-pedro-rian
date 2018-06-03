package DAOs;

import Modelo.Participante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParticipanteDAO {

    private static Connection conexao;
    private static ParticipanteDAO dao;

    public ParticipanteDAO() throws SQLException {
        ParticipanteDAO.conexao = Conexao.getInstance();
    }

    public static ParticipanteDAO getInstance() {
        if (dao == null) {
            try {
                dao = new ParticipanteDAO();
            } catch (SQLException ex) {
                Logger.getLogger(ParticipanteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dao;
    }

    public List<Participante> listAll() throws SQLException {
        List<Participante> participantes = new ArrayList<>();
        PreparedStatement consulta = conexao.prepareStatement("Select * from participante");
        ResultSet resultado = consulta.executeQuery();
        while (resultado.next()) {
            participantes.add(new Participante(resultado.getInt("codigo"), resultado.getString("nome"), resultado.getString("email"), resultado.getString("senha")));
        }
        return participantes;
    }

    public void adicionar(Participante participante) throws SQLException {
        String sql = "INSERT INTO PARTICIPANTE(nome, email,senha) VALUES(?,?,?)";
        try (PreparedStatement comando = conexao.prepareStatement(sql)) {
            comando.setString(1, participante.getNome());
            comando.setString(2, participante.getEmail());
            comando.setString(3, participante.getSenha());
            comando.execute();
            comando.close();
        }
    }

    public void alterar(Participante participante) throws SQLException {
        String sql = "UPDATE evento SET(nome = ?,"
                + " email = ?,"
                + "senha = ?"
                + " WHERE codigo = ? ";
        try (PreparedStatement comando = conexao.prepareStatement(sql)) {
            comando.setString(1, participante.getNome());
            comando.setString(2, participante.getEmail());
            comando.setString(3, participante.getSenha());
            comando.execute();
            comando.close();
        }
    }

    public void excluir(Participante participante) throws SQLException {
        String sql = "DELETE FROM PARTICIPANTE WHERE CODIGO = ?";
        try (PreparedStatement comando = conexao.prepareStatement(sql)) {
            comando.setInt(1, participante.getCodigo());
            comando.execute();
            comando.close();
        }
    }

    public Participante getUsuario(String nome, String senha) throws SQLException {
        Participante participante = null;
        PreparedStatement consulta = conexao.prepareStatement("Select * from participante where nome = ? AND senha = ?");
        consulta.setString(1, nome);
        consulta.setString(2, senha);
        consulta.setMaxRows(1);
        consulta.execute();
        ResultSet resultado = consulta.executeQuery();
        while (resultado.next()) {
            participante = new Participante(resultado.getInt("codigo"), resultado.getString("nome"), resultado.getString("email"), resultado.getString("senha"));
        }
        consulta.close();
        return participante;
    }
}
