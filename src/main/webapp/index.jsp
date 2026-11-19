<%-- 
    Document   : index.jsp
    Created on : 16/11/2026, 7:07:09 p. m.
    Author     : Win 11 Pro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Mi Contador - Login</title>
  <link rel="stylesheet" href="./public/css/style.css">
</head>
<body>

  <div class="marca">
    <h1>Mi Contador</h1>
    <p>¿Quién está gestionando las finanzas hoy?</p>
  </div>

    <div class="caja-principal">
        <form action="loginservlet" method="POST">
    
    
            <input type="hidden" name="accion" value="login">

            <label for="nombre">Nombre del perfil</label>
    
            <input type="text" id="nombre" name="nombre" placeholder="Ej: Andrés" required>

            <label for="clave">Contraseña</label>
    
            <input type="password" id="clave" name="contrasena" placeholder="Mínimo 8 caracteres" required>

            <button class="boton" type="submit">Iniciar sesión</button>
    
         </form>
    
  
        <button class="boton" type="button" onclick="window.location.href='${pageContext.request.contextPath}/registro.jsp'">
        Crear perfil
        </button>
        
    </div>
    
 <script src="./public/js/script.js"></script>
</body>
</html>
