<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>학점 판정</title>
    </head>
    <body>
        <!--
        choose절을 이용하여 90이상 A
        80이상은 B, 70이상은 C, 나머지는 F
        -->
        <c:choose>
            <c:when test="${param.point >= 90}">
                A 입니다.
            </c:when>
            <c:when test="${param.point >= 80}">
                B 입니다.
            </c:when>
            <c:when test="${param.point >= 70}">
                C 입니다.
            </c:when>
            <c:otherwise>
                F 입니다.
            </c:otherwise>
        </c:choose>
    </body>
</html>