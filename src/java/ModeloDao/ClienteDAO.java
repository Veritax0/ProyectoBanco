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
            per.setCobroMensual();
            list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Cliente list(int id) {
        String sql = "select * from clientes where Id="+id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            p.setId(rs.getInt("Id"));
            p.setNombre(rs.getString("Nombre"));
            p.setApellido(rs.getString("Apellido"));
            p.setNroCuenta(rs.getInt("NroCuenta"));
            p.setValorPrestamo(rs.getInt("ValorPrestamo"));
            p.setNroCuotas(rs.getInt("nroCuotas"));
            p.setCobroMensual();
            }
        } catch (Exception e) {
        }
        return p;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Cliente per) {
        String sql = "insert into clientes values('"+per.getId()+"','"+per.getNombre()+"','"+per.getApellido()+"','"+per.getNroCuenta()+"','"+per.getValorPrestamo()+"','"+per.getNroCuotas()+"','"+per.getCobroMensual()+"')" ;
        try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean edit(Cliente per) {
        String sql = "update persona set Id='"+per.getId()+"',Nombre='"+per.getNombre()+"',Apellido='"+per.getApellido()+"',NroCuenta='"+per.getNroCuenta()+"',ValorPrestamo='"+per.getValorPrestamo()+"',nroCuotas='"+per.getNroCuotas()+"'where Id="+per.getId() ;
        try {
            con=cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
