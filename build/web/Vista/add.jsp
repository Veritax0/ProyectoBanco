

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <h1>Agregar Persona</h1>
                <form action="Controlador">
                ID:<br>
                <input class="form-control" type="number" name="txtId">
                Nombres:
                <input class="form-control" type="text" name="txtNombre">
                Apellidos:
                <input class="form-control" type="text" name="txtApellido">
                Numero de cuenta:
                <input class="form-control" type="number" name="txtNroCuenta">
                Valor del prestamo:
                <input class="form-control" type="number" name="txtValorPrestamo">
                Numero de cuotas:
                <input class="form-control" type="number" name="txtNroCuotas">
                <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                <a href="Controlador?accion=listar">Regresar</a>
            </div>
        </div>
            </form>
    </body>
</html>
