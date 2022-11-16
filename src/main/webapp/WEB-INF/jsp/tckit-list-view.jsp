<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

    <jsp:include page="header.jsp"/>

    <body>

        <jsp:include page="navigation.jsp"/>



        <div class="container">
            <h1>Contact list</h1>
            <table modelAttribute="tckitList" class="table table-striped">
                        <thead>
                            <tr>
                                <th>emat8</th>
                                <th>other</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${tckitList}" var="tckit">
                                <tr>
                                    <td>${tckit.emat8}</td>
                                    <td><a href="tckit/${tckit.tckitId}" class="btn btn-primary">View more</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
        </div>



    </body>
</html>