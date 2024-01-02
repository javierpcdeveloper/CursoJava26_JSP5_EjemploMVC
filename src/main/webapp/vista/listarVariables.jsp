<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de variables</title>
    </head>
    <body>
        <h1>Despliegue de variables</h1><br>
        Variable en alcance request: ${mensaje}<br>
        Rectángulo (alcance request): ${recRequest.base} x ${recRequest.altura} = ${recRequest.area} <br>
        Rectángulo (alcance session): ${recSesion.base} x ${recSesion.altura} = ${recSesion.area} <br>
        Rectángulo (alcance aplicacion): ${recAplicacion.base} x ${recAplicacion.altura} = ${recAplicacion.area} <br>
        <a href="index.jsp">Volver</a>
        
    </body>
</html>
