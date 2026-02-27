<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>BMI 결과</title>
    </head>
    <body>
        <h1>검사 결과</h1>
        <p>BMI 지수 : <strong>${bmiValue }</strong></p>
        <p>판정 상태 : <span style="color:red;">${result }</span></p>
        <a href="bmiForm.html">다시 계산하기</a>
    </body>
</html>