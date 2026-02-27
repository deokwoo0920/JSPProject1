<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Cart List</title>
    </head>
    <body>
        <h2>나의 장바구니 (${cartList.size}개 상품)</h2>
        <c:choose>
            <c:when test="${empty cartList}">
                <p>장바구니가 비어 있습니다.</p>
            </c:when>
            <c:otherwise>
                <table border="1">
                    <tr><th>No</th><th>상품명</th><th>수량</th><th>합계</th></tr>
                    <c:forEach var="p" items="${cartList}" varStatus="s">
                        <tr style="${s.last? 'background-color:#eee;' : ''}">
                            <td>${s.count}</td>
                            <td>${p.name}</td>
                            <td>${p.quantity}</td>
                            <td><fmt:formatNumber value="${p.getTotalPrice}" type="currency" /></td>
                        </tr>
                    </c:forEach>
                </table>
            </c:otherwise>
        </c:choose>
    </body>
</html>