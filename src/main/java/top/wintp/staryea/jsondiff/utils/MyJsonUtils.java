package top.wintp.staryea.jsondiff.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import cn.hutool.core.map.MapUtil;

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
public class MyJsonUtils {

    /**
     * 对JSON数据进行排序  可以对jsonObject的数据的key进行排序 也可以对数组中的所有元素进行排序
     *
     * @param map
     * @return
     */
    public static TreeMap<String, Object> parserObject(Map<String, Object> map) {
        TreeMap<String, Object> result = new TreeMap<>();
        //循环map
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            //判断是否是数组格式 数组格式单独处理
            if (value instanceof JSONArray) {
                JSONArray v = (JSONArray) value;

                List<Comparable> comparableLists = new ArrayList<>();
                List<TreeMap<String, Object>> jsonObjects = new ArrayList<>();

                //循环数组中的数据 对数据进行排序
                for (int i = 0; i < v.size(); i++) {
                    Object o = v.get(i);
                    if (o instanceof Comparable) {
                        comparableLists.add((Comparable) o);
                    } else if (o instanceof JSONObject) {
                        //    重新走一遍
                        TreeMap<String, Object> sort = parserObject((Map<String, Object>) o);
                        jsonObjects.add(sort);
                    }
                }

                //对非JsonObject的数据进行排序
                Collections.sort(comparableLists);
                //清空数组
                v.clear();
                //添加排好序的数据
                v.addAll(comparableLists);
                v.addAll(jsonObjects);

                result.put(key, v);
            } else if (value instanceof JSONObject) {
                //Object的数据进行排序
                Map<String, Object> a = (Map<String, Object>) value;
                result.put(key, MapUtil.sort(a));
            } else {
                //其他格式直接添加到treeMap中
                result.put(key, value);
            }
        }

        return result;
    }


}
