package com.hermes.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * json 工具类
 * @author wangpengfei
 */
public class JSONUtil {


    protected final static Logger logger = LoggerFactory.getLogger(JSONUtil.class);

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     *
     * JSON,使用Jackson转换Java对象.
     *
     */
    public static <X> X renderObject(String json,Class<X> clazz){
        try {
            return (X)objectMapper.readValue(json, clazz);
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }
        return null;
    }

    public static <X> X renderMap(Map<String,Object> map,Class<X> clazz){
        try {
            return (X)objectMapper.readValue(objectMapper.writeValueAsString(map), clazz);

        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }
        return null;
    }


    public static String objct2Json(Object object){
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
    }

    public static <T> T toBean(String jsonString,Class<T> beanClass){

        T t = JSONObject.parseObject(jsonString, beanClass);
        return t;
    }

    public static <T> List<T> toBeanList(String jsonString,Class<T> beanClass){

        List<T> t = JSONObject.parseArray(jsonString, beanClass);
        return t;
    }

    public static <T> String listToJsonStr(List<T> list){

        String jsonArrayString = JSONObject.toJSONString(list);
        return jsonArrayString;
    }

    public static <T> JSONArray listToJSONArr(Object list){

        JSONArray array = (JSONArray) JSONObject.toJSON(list);
        return array;
    }

    public static <T> String beanToJsonStr(T t){

        String jsonObjectString = JSONObject.toJSONString(t, SerializerFeature.DisableCircularReferenceDetect);
        return jsonObjectString;
    }

    public static <T> JSONObject beanToJsonObj(T t){

        JSONObject json = (JSONObject) JSONObject.toJSON(t);
        return json;
    }

    public static <T> T jsonStrToObjArr(String jsonStr){

        T t = (T) JSONObject.parse(jsonStr);
        return t;
    }

    public static <T> T jsonStrToMap(String jsonStr){

        T t = (T) JSONObject.parseObject(jsonStr, Map.class);
        return t;
    }

    /**
     * 将 fastjson的JSONArray转化为泛型列表
     * @param jsonArray 源数据
     * @param clz 泛型类
     * @param <T> 泛型
     * @return list
     */
    public static <T> List<T> convertJSONArrayToTypeList(JSONArray jsonArray,Class<T> clz){
        if (CollectionUtils.isEmpty(jsonArray)){
            return new ArrayList<T>();
        }
        List<T> result = new ArrayList<T>(jsonArray.size());
        jsonArray.forEach(element->{
            // 基础类型不可以转化为JSONObject，需要特殊处理
            if (element instanceof String
                    || element instanceof Number
                    || element instanceof Boolean
            ){
                result.add((T)element);
            }else {
                T t = JSONObject.toJavaObject((JSONObject)element, clz);
                result.add(t);
            }
        });
        return result;
    }


}
