

import java.io.IOException;   
   
import javax.servlet.ServletException;   
import javax.servlet.http.HttpServlet;   
import javax.servlet.http.HttpServletRequest;   
import javax.servlet.http.HttpServletResponse;   
   
import org.json.JSONArray;   
import org.json.JSONObject;   
   
public class JsonViewServlet extends HttpServlet {   
   
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)   
            throws ServletException, IOException {   
        doPost(req,resp);   
    }   
   
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)   
            throws ServletException, IOException {   
        resp.setContentType("application/json");   
       // resp.setHeader("Cache-Control","no-cache");   
        JSONObject json = new JSONObject();   
        try{   
        JSONArray members = new JSONArray();   
        for(int i=0;i<10;i++){   
            JSONObject member = new JSONObject()   
            .put("name", "张小"+i)   
            .put("age", "28")   
            .put("email", "test@test.com");   
            members.put(i, member);   
        }   
        json.put("jobs", members);   
        }catch(Exception e){   
            e.printStackTrace();   
        }   
        System.out.println(json.toString());   
        resp.getWriter().write(json.toString());   
        System.out.println("test github");   
        System.out.println("test github");  
<<<<<<< HEAD
     
=======
       System.out.println("hi from github");
>>>>>>> parent of f269bc1... conflict
        
    }   
   
} 