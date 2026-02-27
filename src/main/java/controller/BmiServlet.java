package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/bmi.do")
public class BmiServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // doPost는 HTTP 메서드가 post방식인 경우에 처리하는 메서드
        // 1. 데이터 처리 (weight, height)
        // weight, height에 있는 값은 문자열(**)
        double height = Double.parseDouble(req.getParameter("height")) / 100;
        double weight = Double.parseDouble(req.getParameter("weight"));
        // 2. BMI 계산(비즈니스 로직)
        double bmi = weight / (height * height);
        // 판단 : 저체중, 정상, 과체중, 비만1, 비만2
        String result = null;
        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi <= 22.9) {
            result = "정상";
        } else if (bmi <= 24.9) {
            result = "과체중";
        } else if (bmi <= 29.9) {
            result = "비만(1단계)";
        } else {
            result = "비만(2단계/고도비만)";
        }

        // 3. 데이터 저장(request에 저장)
        req.setAttribute("bmiValue", String.format("%.2f", bmi));
        req.setAttribute("result", result);

        // 4. 포워드(결과를 출력할 View를 선택)
        req.getRequestDispatcher("/WEB-INF/views/bmiResult.jsp")
                .forward(req, resp);

    }

}
