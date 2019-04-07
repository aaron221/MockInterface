package interfaceDev.example;

import com.alibaba.fastjson.JSONObject;
import interfaceDev.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@Api(value = "/",description = "这是baseinfo中的post请求")
@RequestMapping("/v1")
public class MyPostMethod {

    //这个变量是用来装我们cookies信息的
    private static Cookie cookie;


    //以json格式入参的请求
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登陆接口",httpMethod = "POST")
    public String login(HttpServletResponse response,HttpServletRequest request,
                        @RequestBody JSONObject parame){

        if(parame.get("userName").equals("zhangsan")){
            return "{\"requestId\": null,\"success\": true,\"business\": null,\"errorCode\": null,\"errorMessage\": null,\"params\": null,\"date\": null,\"version\": null,\"obj\": {\"status\": \"SUCCESS\",\"pwdChangeDate\": 1542976080000}}";
        }

        return "验证失败";
    }

    //不是json格式入参请求
    @RequestMapping(value = "/login/action",method = RequestMethod.POST)

    @ApiOperation(value = "登陆接口，成功后获取cookies信息",httpMethod = "POST")

    public String loginAction(HttpServletResponse response,HttpServletRequest request,

                        @RequestParam(value = "userName",required = false) String userName,

                        @RequestParam(value = "password",required = false)  String password){

        if(userName.equals("zhangsan") && password.equals("123456")){

            cookie = new Cookie("login","true");

            response.addCookie(cookie);

            System.out.println(request.getParameter("userName"));

            return "恭喜你登陆成功了!";

        }

        return "用户名或者是密码错误！";

    }

    //@RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    //@ApiOperation(value = "获取用户列表",httpMethod = "POST")
    //public String getUserList(HttpServletRequest request,
    //                        @RequestBody User u){
    //
    //    User user;
    //    //获取cookies
    //    Cookie[] cookies = request.getCookies();
    //    //验证cookies是否合法
    //    for(Cookie c : cookies){
    //        if(c.getName().equals("login")
    //                && c.getValue().equals("true")
    //                && u.getUserName().equals("zhangsan")
    //                && u.getPassword().equals("123456")
    //                ){
    //            user = new User();
    //            user.setName("lisi");
    //            user.setAge("18");
    //            user.setSex("man");
    //            return  user.toString();
    //        }
    //    }
    //    return "参数不合法";
    //}

}
