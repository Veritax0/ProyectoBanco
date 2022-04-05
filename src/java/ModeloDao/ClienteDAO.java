/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDao;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Cliente;
import java.sql.*;
import java.util.*;

/**
 *
 * @author MY_PC
 */
public class ClienteDAO implements CRUD{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cliente p = new Cliente();

    @Override
    public List listar() {
        ArrayList<Cliente> list = new ArrayList<>();
        String sql = "select * from clientes";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            Cliente per = new Cliente();
            per.setId(rs.getInt("Id"));
            per.setNombre(rs.getString("Nombre"));
            per.setApellido(rs.getString("Apellido"));
            per.setNroCuenta(rs.getInt("NroCuenta"));
            per.setValorPrestamo(rs.getInt("ValorPrestamo"));
            per.setNroCuotas(rs.getInt("nroCuotas"));
            list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Cliente list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Cliente per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Cliente per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
