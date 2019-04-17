package interfaceDev.control;

import com.alibaba.fastjson.JSONObject;
import interfaceDev.Mapper.ResourceMap;
import interfaceDev.bean.User;
import interfaceDev.interfaceUri.ResourceUri;
import org.springframework.web.bind.annotation.*;
import utils.ReadConfigFile;
import utils.TypeConversion;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ResourceService {
    private static JSONObject jsonObject;

    //账号验证接口(此处涉及到了调用mapper接口去查询数据信息，从而与请求传送过来的信息做对比)
    //不过我目前重点不是真真实实的开发接口，所以我后面就不从数据库取值了，直接把正确的信息给固化了
    //这样就少了很多工作量，模拟接口也快得多了
    @RequestMapping(value = ResourceUri.getVeriﬁcationInfo,method = RequestMethod.POST)
    public JSONObject getVeriﬁcationInfoTest(HttpServletRequest request,
                                         @RequestBody JSONObject param){
        String string =" {\"requestId\": \"null\",\"errorMessage\":\"null\"}";

        jsonObject = TypeConversion.strTurnJsonobj(string);

        JSONObject jsonObject = new JSONObject();
        if(!request.getHeader("content-Type").equals("application/json")){
            jsonObject.put("errorMessage","请求头信息有误");
            return jsonObject;
        }

        ResourceMap resourceMap = (ResourceMap) ReadConfigFile.getBean("resourceMap");

        User user = new User();
        user.setUserName(param.getString("username"));
        user.setPassword(param.getString("password"));


        if(resourceMap.getVeriﬁcationInfo(user)!=1){
            jsonObject.put("errorMessage","账号或密码有误");
            return jsonObject;
        }

        return jsonObject;
    }


    //账号验证接口
    public JSONObject getVeriﬁcationInfo(HttpServletRequest request,
                                         @RequestBody JSONObject jsonObject){
        String string =" {\"requestId\": \"null\",\"errorMessage\":\"null\"}";
        jsonObject = TypeConversion.strTurnJsonobj(string);

        if(!request.getHeader("content-Type").equals("application/json")){
            jsonObject.put("errorMessage","请求头信息有误");
            return jsonObject;
        }

        if(!jsonObject.get("username").equals("aaron")&&jsonObject.get("password").equals("123456")){
            jsonObject.put("errorMessage","账号或密码信息有误");
            return jsonObject;
        }

        return jsonObject;
    }


    public static void main(String[] args) {
        String string ="{  \"requestId\": null,  \"success\": true,  \"business\": null,  \"errorCode\": null,  \"errorMessage\": null,  \"params\": null,  \"date\": null,  \"version\": null}";
        jsonObject = TypeConversion.strTurnJsonobj(string);
        jsonObject.put("obj","{    \"status\": \"SUCCESS\",    \"pwdChangeDate\": 1542976080000  }");
        System.out.println(jsonObject.toJSONString());
    }

}
