package com.offcn.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



/*
* Servlet的生命周期：  Servlet的生命周期是由服务器管理的。
*                     第一次访问servlet时，服务器创建Servlet对象，并执行init方法一次.
*                     每次请求，服务器开启一个新线程调用service方法。（HttpServlet的service方法，根据请求的类型决定调用doXXX）
*                     在关闭服务器时，销毁servlet对象，销毁前，执行destroy方法一次
*
* Servlet对象是单例的！！！！！   服务器是多线程环境。   Servlet中尽量不用   成员变量
* */
@WebServlet("/ForthServlet")
public class ForthServlet extends HttpServlet {

/*    public ForthServlet(){
        System.out.println("xxxxxxxxxxxxxxxxxx");
    }*/

    public void init(){
        System.out.println("ForthServlet出生了");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ForthServlet...doGet....");
    }

    public void destroy(){
        System.out.println("ForthServlet升天了!!!");
    }
}
