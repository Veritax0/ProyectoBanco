
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Modificar Persona</h1>
        <form action="Controlador">
            ID:<br>
            <input type="hidden" name="txtId" value=""> <br>
            Nombres: <br>
            <input type="text" name="txtNombre" value=""> <br>
            Apellidos: <br>
            <input type="text" name="txtApellido" value=""><br>
            Numero de cuenta:<br>
            <input type="hidden" name="txtNroCuenta" value=""><br>
            Valor del prestamo:<br>
            <input type="number" name="txtValorPrestamo" value=""><br>
            Numero de cuotas:<br>
            <input type="number" name="txtNroCuotas" value=""><br>
            <input type="submit" name="accion" value="Actualizar"><br>
            <a href="Controlador?accion=listar">Regresar</a>
        </form>
    </body>
</html>
