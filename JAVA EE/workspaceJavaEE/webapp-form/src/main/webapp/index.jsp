<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<% 
Map<String, String> errores = (Map<String, String>) request.getAttribute("errores");
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Formularios de usuarios</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
	<h3>Formularios de usuarios</h3>
	
	<%
	if (errores != null && errores.size() > 0) {
	%>
	<ul>
		<% for(String error: errores.values()) {%>
		<li><%=error%></li>
		<%}%>
	</ul>
	<%}%>
	<form action="/webapp-form/registro" method="post">
		<div class="row mb-3">
			<label for="username" class="col-form-label">Username</label>
			<div><input type="text" name="username" id="username" class="form-control"></div>
			<% 
			if (errores != null && errores.containsKey("username")) {
				out.println("<small style='color: red;'>" + errores.get("username") + "</small>");
			}
			%>
		</div>
		
		<div class="row mb-3">
			<label for="password" class="col-form-label">Password</label>
			<div><input type="password" name="password" id="password" class="form-control"></div>
			<% 
			if (errores != null && errores.containsKey("password")) {
				out.println("<small style='color: red;'>" + errores.get("password") + "</small>");
			}
			%>
		</div>
		
		<div class="row mb-3">
			<label for="email" class="col-form-label">Email</label>
			<div><input type="text" name="email" id="email" class="form-control"></div>
			<% 
			if (errores != null && errores.containsKey("email")) {
				out.println("<small style='color: red;'>" + errores.get("email") + "</small>");
			}
			%>
		</div>
		
		<div class="row mb-3">
			<label for="pais" class="col-form-label">País</label>
			<div>
				<select name="pais" id="pais">
					<option value="">-- seleccionar --</option>
					<option value="ES">España</option>
					<option value="MX">México</option>
					<option value="CL" selected>Chile</option>
					<option value="AR">Argentina</option>
					<option value="PE">Perúº</option>
					<option value="CO">Colombia</option>
					<option value="VE">Venezuela</option>
				</select>		
			</div>
			<% 
			if (errores != null && errores.containsKey("pais")) {
				out.println("<small style='color: red;'>" + errores.get("pais") + "</small>");
			}
			%>
		</div>
		
		<div class="row mb-3">
			<label for="lenguajes" class="col-form-label">Lenguajes de programación</label>
			<div>
				<select name="lenguajes" id="lenguajes" multiple>
					<option value="java" selected>Java SE</option>
					<option value="jakartaee" selected>Jakarta EE9</option>
					<option value="spring">Spring Boot</option>
					<option value="js">JavaScript</option>
					<option value="angular" selected>Angular</option>
					<option value="react">react</option>
				</select>
			</div>
			<% 
			if (errores != null && errores.containsKey("lenguajes")) {
				out.println("<small style='color: red;'>" + errores.get("lenguajes") + "</small>");
			}
			%>
		</div>
		
		<div class="row mb-3">
			<label class="col-form-label">Roles</label>
			<div>
				<input type="checkbox" name="roles" value="ROLE_ADMIN">
				<label>Administrador</label>
			</div>
			<div>
				<input type="checkbox" name="roles" value="ROLE_USER" checked>
				<label>Usuario</label>
			</div>
			<div>
				<input type="checkbox" name="roles" value="ROLE_MODERATOR">
				<label>Moderador</label>
			</div>
			<% 
			if (errores != null && errores.containsKey("roles")) {
				out.println("<small style='color: red;'>" + errores.get("roles") + "</small>");
			}
			%>
		</div>
		
		<div class="row mb-3">
			<label class="col-form-label">Idiomas</label>
			<div>
				<input type="radio" name="idioma" value="es">
				<label>Español</label>
			</div>
			<div>
				<input type="radio" name="idioma" value="en">
				<label>Inglés</label>
			</div>
			<div>
				<input type="radio" name="idioma" value="fr">
				<label>Francés</label>
			</div>
			<% 
			if (errores != null && errores.containsKey("idioma")) {
				out.println("<small style='color: red;'>" + errores.get("idioma") + "</small>");
			}
			%>
		</div>
		
		<div class="row mb-3">
			<label for="habilitar" class="col-form-label">Habilitar</label>
			<div>
				<input type="checkbox" name="habilitar" id="habilitar" checked>
			</div>
		</div>
		
		<div>
			<div>
				<input type="submit" value="Enviar">
			</div>
		</div>
		<input type="hidden" name="secreto" value="12345">
	</form>
</body>
</html>