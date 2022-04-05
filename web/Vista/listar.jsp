
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDao.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Personas</h1>
        <a href="Controlador?accion=add">Agregar Nuevo</a>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th>NroCuenta</th>
                    <th>Valor del prestamo</th>
                    <th>nroCuotas</th>
                    <th>CobroMensual</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <%
                ClienteDAO dao = new ClienteDAO();
                List<Cliente> list = dao .listar();
                Iterator<Cliente> iter = list.iterator();
                Cliente per = null;
                while(iter.hasNext()){
                    per = iter.next();
                
            %>
            <tbody>
                <tr>
                    <td><%= per.getId()%></td>
                    <td><%= per.getNombre()%></td>
                    <td><%= per.getApellido()%></td>
                    <td><%= per.getNroCuenta()%></td>
                    <td><%= per.getValorPrestamo()%></td>
                    <td><%= per.getNroCuotas()%></td>
                    <td><%= per.getCobroMensual()%></td>
                    <td>
                        <a href="Controlador?accion=editar&id=<%= per.getId()%>">Editar</a>
                        <a href="Controlador?accion=eliminar&id=<%= per.getId()%>">Remover</a>
                    </td>
                </tr>
                <%}%>
            </tbody>
        </table>

    </body>
</html>
