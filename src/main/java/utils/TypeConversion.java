package utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;


public class TypeConversion {



    public static JSONObject strTurnJsonobj(String JSONObject_parseObject){

        return JSONObject.parseObject(JSONObject_parseObject);

    }

    public static String jsonobjTurnStr(JSONObject jsonObject){
        return jsonObject.toJSONString();
    }


    public static Map strTurnMap(String JSONObject_parseObject){

        return JSONObject.parseObject(JSONObject_parseObject);

    }


    public static String mapTurnStr(Map<String,?> JSONObject_toJSONString){

        return JSONObject.toJSONString(JSONObject_toJSONString);

    }



    public static JSONObject jsarrTurnJsObj(JSONArray jsonArray, int jsarrIndex){

        return jsonArray.getJSONObject(jsarrIndex);

    }


    public static String jsarrTurnStr(JSONArray jsonArray){
        return jsonArray.toJSONString();
    }



    public static List<Map<String,Object>> jsarrTurnList(JSONArray jsonArray){
        return (List)jsonArray;
    }



    public static JSONArray jsobjTurnJsarr(JSONObject jsonObject, String key){
        return jsonObject.getJSONArray(key);
    }

}
