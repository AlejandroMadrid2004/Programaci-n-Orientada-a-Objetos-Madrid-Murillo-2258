package org.example.persistencia;

import org.example.modelo.Amd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AmdDAO implements InterfazDAO{

    //Constructor por defecto
    public AmdDAO() {
    }

    //Metodos abstractos de InterfazDAO
    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO amd(nombre, velocidadM, tamanoM, frecuencia, url) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("amdDB.db").getConnection().prepareStatement(sqlInsert);
        //Valores que tendran los comodines
        pstm.setString(1,((Amd)obj).getNombre());
        pstm.setInt(2,((Amd)obj).getVelocidadM());
        pstm.setInt(3,((Amd)obj).getTamanoM());
        pstm.setInt(4,((Amd)obj).getFrecuencia());
        pstm.setString(5,((Amd)obj).getUrlImagen());
        rowCount = pstm.executeUpdate();
        return rowCount>0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE amd SET nombre = ?, velocidadM = ?, tamanoM = ?, frecuencia = ?, url = ? WHERE id = ?; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("amdDB.db").getConnection().prepareStatement(sqlUpdate);
        //Valores que tendran los comodines
        pstm.setString(1,((Amd)obj).getNombre());
        pstm.setInt(2,((Amd)obj).getVelocidadM());
        pstm.setInt(3,((Amd)obj).getTamanoM());
        pstm.setInt(4,((Amd)obj).getFrecuencia());
        pstm.setString(5,((Amd)obj).getUrlImagen());
        pstm.setInt(6,((Amd)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount>0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM amd WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("amdDB.db").getConnection().prepareStatement(sqlDelete);
        //Valores para el comodin
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;


    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM amd";
        ArrayList<Amd> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.getInstance("amdDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);

        while(rst.next()){
            resultado.add(new Amd(rst.getInt(1),rst.getString(2),rst.getInt(3),rst.getInt(4),rst.getInt(5),rst.getString(6)));
        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM amd WHERE id = ?;";
        Amd amd = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("amdDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            amd = new Amd(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getInt(4), rst.getInt(5), rst.getString(6));
            return amd;
        }
        return null;
    }
}
