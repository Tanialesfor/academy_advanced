package by.htp.ex.controller.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import by.htp.ex.bean.News;
import by.htp.ex.controller.Command;
import by.htp.ex.service.INewsService;
import by.htp.ex.service.ServiceException;
import by.htp.ex.service.ServiceProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToErrorPage implements Command{
	
	

	@Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession(false);
//        String errorMessage = (String) session.getAttribute(ERROR_MESSAGE);
//
//        if (errorMessage == null) {
//
//            session.setAttribute(ERROR_MESSAGE,"no such command error");
//        }
//        request.getRequestDispatcher("WEB-INF/pages/tiles/error.jsp").forward(request, response);
//        //response.sendRedirect("/WEB-INF/pages/tiles/error.jsp");
//    }
	}

}
