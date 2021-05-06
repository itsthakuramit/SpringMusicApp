<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored ="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MyAlbum</title>
</head>
<body>
<h1>Add Album</h1>
<form action="addAlbum" method="post">
   <table style="with: 50%" border="2">
    <tr>
     <td>Album Id</td>
     <td><input type="text" name="albumid" /></td>
    </tr>
    <tr>
     <td>Album Name</td>
     <td><input type="text" name="albumname" /></td>
	</tr>
	<tr>
     <td>Artist</td>
     <td><input type="text" name="artist" /></td>
	</tr>
	<tr>
	 <td colspan="2" align="center"><input type="submit" value="Add Album" /></td>
	</tr>
	
   </table>
   
   
</form>

<br><br>
   <table style="with: 50%" border="2">
   
   <tr>
	 <td>Album Id</td>
     <td>Album Name</td>
     <td>Artist</td>
    
    </tr>
   <c:forEach items="${albumlist}" var="album">
   
   
    <tr>
     <td>${album.albumid}</td>
     <td>${album.albumname}</td>
     <td>${album.artist}</td>
     <td><a href="deleteAlbum?albumid=${album.albumid}"><button>Delete</button></a></td>
     
    </tr>

	</c:forEach>
   </table>
   