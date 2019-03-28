<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ 
	taglib prefix="form"
	uri="http://www.springframework.org/tags/form"
 	%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous"/>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

<title>Insert title here</title>
</head>
<body>
		<h4>Crud usuario</h4>
		
		<form:form class="form"				
				modelAttribute="login"
	 			method="GET">
	 	</form:form>
		
		<form:form class="form"
				action="insertLogin"
				modelAttribute="usuarioInsertar"				
	 			method="POST">
	 	
		<label for="txtUsuario" class="sr-only">Usuario</label>
		<form:input id="txtUsuario" 
					path="usuario"
					type="text"		 			 
		 			class="form-control"
		 			placeholder="Usuario..." />
		
		<label for="txtContrasena" class="sr-only">Password</label>
		<form:input
				id="txtContrasena" 
				path="password"
			 	type="password"				 
				class="form-control"
		 		placeholder="Contraseña..." />
		 		
		<label for="txtNombre" class="sr-only">Nombre</label>
		<form:input
				id="txtNombre" 
				path="nombre"
			 	type="text"				 
				class="form-control"
		 		placeholder="nombre..." />
		 		
		<label for="txtApaterno" class="sr-only">A. Paterno</label>
		<form:input
				id="txtApaterno" 
				path="apaterno"
			 	type="text"				 
				class="form-control"
		 		placeholder="Apellido Paterno..." />
		 		
		 <label for="txtAmaterno" class="sr-only">A. Materno</label>
		<form:input
				id="txtAmaterno" 
				path="amaterno"
			 	type="text"				 
				class="form-control"
		 		placeholder="Apellido Materno..." />
		
		<button				
				 class="btn btn-primary btn-lg" 
				 type="submit"> Insertar </button>
			
	</form:form>		

</body>
</html>