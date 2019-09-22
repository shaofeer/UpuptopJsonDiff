package top.wintp.staryea.jsondiff.springbootandes.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.TreeMap;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.StrUtil;
import top.wintp.springbootandes.springbootandes.utils.MyJsonUtils;
import top.wintp.staryea.jsondiff.springbootandes.utils.MyJsonUtils;

/**
 * @author: pyfysf
 * <p>
 * @qq: 337081267
 * <p>
 * @CSDN: http://blog.csdn.net/pyfysf
 * <p>
 * @blog: http://wintp.top
 * <p>
 * @email: pyfysf@163.com
 * <p>
 * @time: 2019/9/21
 */
@RestController
@RequestMapping("json")
public class JsonDiffController {

    @PostMapping("/sort")
    public String sort(String json) {

        if (StrUtil.isBlank(json)) {
            Console.log("json 为空");
            return "{}";
        }

        Map<String, Object> stringObjectTreeMap = JSONObject.parseObject(json, TreeMap.class);

        stringObjectTreeMap = MyJsonUtils.parserObject(stringObjectTreeMap);

        String resultJsonString = JSONObject.toJSONString(stringObjectTreeMap);
        //格式化输出
        //String resultJsonString = JSONObject.toJSONString(stringObjectTreeMap, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue,
        //        SerializerFeature.WriteDateUseDateFormat);

        Console.log(resultJsonString);
        Console.log(resultJsonString.length());

        return resultJsonString;
    }


}
