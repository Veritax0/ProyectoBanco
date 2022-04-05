
<%@page import="Modelo.Cliente"%>
<%@page import="ModeloDao.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <%
                ClienteDAO dao = new ClienteDAO();
                int id = Integer.parseInt((String)request.getAttribute("idper"));
                Cliente p = (Cliente)dao.list(id);
                
            %>
            <h1>Modificar Persona</h1>
            <form action="Controlador">
                ID:<br>
                <input type="hidden" name="txtId" value="<%= p.getId()%>"> <br>
                Nombres: <br>
                <input type="text" name="txtNombre" value="<%= p.getNombre()%>"> <br>
                Apellidos: <br>
                <input type="text" name="txtApellido" value="<%= p.getApellido()%>"><br>
                Numero de cuenta:<br>
                <input type="hidden" name="txtNroCuenta" value="<%= p.getNroCuenta()%>"><br>
                Valor del prestamo:<br>
                <input type="number" name="txtValorPrestamo" value="<%= p.getValorPrestamo()%>"><br>
                Numero de cuotas:<br>
                <input type="number" name="txtNroCuotas" value="<%= p.getNroCuotas()%>"><br>
                <input type="submit" name="accion" value="Actualizar"><br>
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
        </div>
    </body>
</html>
