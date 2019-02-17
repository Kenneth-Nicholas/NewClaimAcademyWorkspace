package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import com.user.Course;
import com.user.WeekDay;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SchedulerServlet
 */
@WebServlet("/SchedulerServlet")
public class SchedulerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchedulerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ArrayList<WeekDay> weekDays = new ArrayList<WeekDay>();
		
		Course course = new Course();
		
		course.setCourseName(request.getParameter("courseName"));
		
		course.setProfessor(request.getParameter("professor"));
		
		course.setTime(request.getParameter("time"));
		
		course.setRoomNumber(request.getParameter("roomNumber"));
		
		course.setStartDate(request.getParameter("startDate"));
		
		String[] weekDaysStringArray = request.getParameterValues("weekday");
		
		for(int i = 0; i < weekDaysStringArray.length; i++) {
			
			if(weekDaysStringArray[i].equals("Monday")) {
				
				weekDays.add(WeekDay.MONDAY);
				
			} else if (weekDaysStringArray[i].equals("Tuesday")) {
				
				weekDays.add(WeekDay.TUESDAY);
				
			}else if (weekDaysStringArray[i].equals("Wednesday")) {
				
				weekDays.add(WeekDay.WEDNESDAY);
				
			}else if (weekDaysStringArray[i].equals("Thursday")) {
				
				weekDays.add(WeekDay.THURSDAY);
				
			}else if (weekDaysStringArray[i].equals("Friday")) {
				
				weekDays.add(WeekDay.FRIDAY);
				
			}
				
		}
		
		course.setWeekDays(weekDays);
		
		HttpSession session = request.getSession(true);
		
		//here will be the courseList instead of course for set attribute. 
		
		// We don't loop the part where you set the course attribute because each time a course gets added on the web page, 
		// a new doGet request is sent.
		
		session.setAttribute("course", course);
		
		// v added this code v
		
		ArrayList<Course> courses = new ArrayList<Course>();
		
		courses.add(course);
		
		session.setAttribute("courses", courses);
		
		// ^ added this code ^
		
		RequestDispatcher rs = request.getRequestDispatcher("course.jsp");
		
		rs.forward(request, response);
		
		// Add code so that every course gets added to an array list of courses.
		
		// later write session.setAttribute("courseList" - named courses , courseList"); to add the courseList to the session
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
