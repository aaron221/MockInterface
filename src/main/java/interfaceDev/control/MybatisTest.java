package interfaceDev.control;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.TypeConversion;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MybatisTest {
    private JSONObject jsonObject;

    @RequestMapping(value = "/resource/dept/findSubDept",method = RequestMethod.POST)
    public JSONObject mybatisTest(HttpServletRequest request, @RequestBody JSONObject jsonObject){

       String string = "{ \"requestId\": \"null\",  \"success\": \"true\"}";
       jsonObject = TypeConversion.strTurnJsonobj(string);
       String obj = "[{\"deptcode\":\"101\",\"deptname\":\"deptname1\"}" +
            ",{\"deptcode\":\"102\",\"deptname\":\"deptname2\"}]";
       jsonObject.put("obj",obj);

        return jsonObject;
    }
}
