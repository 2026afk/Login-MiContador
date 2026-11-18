<%-- 
    Document   : cuentas
    Created on : 16/11/2026, 7:20:30 p. m.
    Author     : Win 11 Pro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Mi Contador - Crear perfil</title>
  <link rel="stylesheet" href="./public/css/style.css">
</head>
<body>

  <div class="caja-registro">

    <a class="volver" href="${pageContext.request.contextPath}/index.jsp">&larr; Volver</a>

    <h2>Crear perfil</h2>

    
    <form action="${pageContext.request.contextPath}/usuarioservlet" method="POST">
        
      <input type="hidden" name="accion" value="NuevaCuenta">
      <!--campo para el nombre--> 
      <label for="nombre">Nombre del perfil</label>
      <input type="text" id="nombre" name="nombre" placeholder="Ej: Andrés" required>

      <label for="clave">Contraseña</label>
      <!-- campo para la contraseña -->
      <input type="password" id="clave" name="contrasena" placeholder="Mínimo 8 caracteres" required>

      <button class="boton" type="submit">Crear perfil</button>

    </form>

  </div>

  <script src="./public/js/script.js"></script>
</body>
</html>
