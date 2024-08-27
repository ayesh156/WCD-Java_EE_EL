<%@ page import="model.User" %><%--
    Document   : index
    Created on : Aug 24, 2024, 12:46:46 PM
    Author     : ECOTEC
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${requestScope.userList[0].name}</h1>
        <h1>${requestScope["userList"][1]["name"]}</h1>
    </body>
</html>
