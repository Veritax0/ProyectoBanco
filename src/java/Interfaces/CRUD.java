/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Cliente;
import java.util.List;

/**
 *
 * @author MY_PC
 */
public interface CRUD {
    public List listar();
    public Cliente list(int id);
    public boolean add(Cliente per);
    public boolean edit(Cliente per);
    public boolean delete(int id);
    
}
