<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

    <jsp:include page="header.jsp"/>

    <body>

        <jsp:include page="navigation.jsp"/>



        <div class="container">
            <h1>Contact list</h1>
            <table modelAttribute="contactList" class="table table-striped">
                        <thead>
                            <tr>
                                <th>firstname</th>
                                <th>lastname</th>
                                <th>email</th>
                                <th>edit</th>
                                <th>delete</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${contactList}" var="contact">
                                <tr>
                                    <td>${contact.firstname}</td>
                                    <td>${contact.lastname}</td>
                                    <td>${contact.email}</td>
                                    <td><a href="contact/${contact.contactId}" class="btn btn-primary">Edit</a></td>
                                    <td><a href="contact/delete/${contact.contactId}" class="btn btn-danger">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
        </div>



    </body>
</html>