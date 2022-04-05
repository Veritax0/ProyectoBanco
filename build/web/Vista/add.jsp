

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agregar Persona</h1>
        <form action="Controlador">
            ID:<br>
            <input type="number" name="txtId">
            Nombres:
            <input type="text" name="txtNombre">
            Apellidos:
            <input type="text" name="txtApellido">
            Numero de cuenta:
            <input type="number" name="txtNroCuenta">
            Valor del prestamo:
            <input type="number" name="txtValorPrestamo">
            Numero de cuotas:
            <input type="number" name="txtNroCuotas">
            <input type="submit" name="accion" value="Agregar">
            <a href="Controlador?accion=listar">Regresar</a>
            
        </form>
    </body>
</html>
