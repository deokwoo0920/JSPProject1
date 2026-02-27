<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <style>
            table {
                border-collapse: collapse;
                width: 80%;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <h2>회원 관리 시스템 (EL 6.0 / JSTL 3.0)</h2>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>이름</th>
                <th>이메일</th>
                <th>상태</th>
            </tr>
            <c:forEach var="m" items="${memberList}">
                <tr>
                    <td>${m.id}</td>
                    <td>${m.name}</td>
                    <td>${m.email}</td>
                    <td>
                        <c:choose>
                            <c:when test="${m.active}">사용중</c:when>
                                <c:otherwise><span style="color:gray;">정지</span></c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </body>
        </html>