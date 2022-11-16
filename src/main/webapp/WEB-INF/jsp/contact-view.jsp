<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html lang="en">

    <jsp:include page="header.jsp"/>

    <body>

        <jsp:include page="navigation.jsp"/>

        <h1>Edit contact</h1>

         <form:form action="/contact/update" modelAttribute="contact" method="POST">
                            <form:input path="contactId" type="hidden" />
                            <form:input path="firstname" type="text" />
                            <form:input path="lastname" type="text" />
                            <form:input path="email" type="text" />
                            <input type="submit">
                        </form:form>



    </body>
</html>