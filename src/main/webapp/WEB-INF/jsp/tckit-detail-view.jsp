<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

    <jsp:include page="header.jsp"/>

    <body>

        <jsp:include page="navigation.jsp"/>



        <div class="container">
            <h1>Contact list</h1>
            <table modelAttribute="tckit" class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>emat8</th>
                                            <th>nin</th>
                                            <th>pnr</th>
                                            <th>mfc</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${tckit}" var="tckit">
                                            <tr>
                                                <td>${tckit.emat8}</td>
                                                <td>${tckit.nin}</td>
                                                <td>${tckit.pnr}</td>
                                                <td>${tckit.mfc}</td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
        </div>



    </body>
</html>