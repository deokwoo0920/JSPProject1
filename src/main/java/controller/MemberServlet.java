package controller;

import java.io.IOException;
import java.util.List;

import dto.Member;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/members.do")
public class MemberServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Member> members = List.of(
                new dto.Member(1L, "홍길동", "hong@test.com", true),
                new dto.Member(2L, "이순신", "Lee@test.com", true),
                new dto.Member(3L, "강감찬", "kang@test.com", false),
                new dto.Member(4L, "이율곡", "Leeyk@test.com", true),
                new dto.Member(5L, "이성계", "Leesg@test.com", false),
                new dto.Member(6L, "김유신", "kimys@test.com", true),
                new dto.Member(7L, "홍길순", "honggs@test.com", true),
                new dto.Member(8L, "이성진", "leesj@test.com", true),
                new dto.Member(9L, "이준신", "leejs@test.com", false),
                new dto.Member(10L, "유성룡", "ryus@test.com", true));

        req.setAttribute("memberList", members);
        req.getRequestDispatcher("/WEB-INF/views/memberList.jsp").forward(req, resp);

    }

}
