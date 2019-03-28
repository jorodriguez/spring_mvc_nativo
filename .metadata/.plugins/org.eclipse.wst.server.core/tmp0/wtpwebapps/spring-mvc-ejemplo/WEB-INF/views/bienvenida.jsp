<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</head>

</head>
<body>
	BIENVENIDO AL SISTEMA!!

	<form:form class="form-signin" method="POST" action="procesarUsuario"
		modelAttribute="usuario">

		<label for="txtNombre" class="sr-only">Nombre</label>
		<form:input path="nombre" type="text" id="txtNombre"
			class="form-control" placeholder="Nombre" />

		<label for="txtEdad" class="sr-only">Edad</label>
		<form:input path="nombre" type="text" id="txtEdad"
			class="form-control" placeholder="Nombre" />

		<form:button class="btn btn-lg btn-primary btn-block" type="submit">Registrar</form:button>

	</form:form>

	<form:form  method="GET" 
			action="bienvenida"
			modelAttribute="listaUsuarios"			
			>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Edad</th>
			</tr>
		</thead>
		<tbody>			
			<c:if test="${not empty item}">
				<c:forEach items="${listaUsuarios}" var="item">
					<tr class="">
						<td>${item.id}</td>
						<td>${item.nombre}</td>
						<td>${item.edad}</td>					
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	</form:form>
</body>
</html>