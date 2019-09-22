package top.wintp.staryea.jsondiff.springbootandes;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import cn.hutool.core.lang.Console;
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
public class Demo {

    private static String jsonSource = "{\"agentId\":\"EA-132.252.143.28-31337\",\"jvmGcBos\":[{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734952571,\"gcType\":\"CMS\",\"heapUsed\":312982648,\"heapMax\":2075918336,\"nonHeapUsed\":166042752,\"nonHeapMax\":1862270976,\"gcOldCount\":0,\"gcOldTime\":0,\"agentStatType\":\"JVM_GC\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734957571,\"gcType\":\"CMS\",\"heapUsed\":313001816,\"heapMax\":2075918336,\"nonHeapUsed\":166042752,\"nonHeapMax\":1862270976,\"gcOldCount\":0,\"gcOldTime\":0,\"agentStatType\":\"JVM_GC\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734962571,\"gcType\":\"CMS\",\"heapUsed\":313259072,\"heapMax\":2075918336,\"nonHeapUsed\":166042752,\"nonHeapMax\":1862270976,\"gcOldCount\":0,\"gcOldTime\":0,\"agentStatType\":\"JVM_GC\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734967571,\"gcType\":\"CMS\",\"heapUsed\":313771872,\"heapMax\":2075918336,\"nonHeapUsed\":166042752,\"nonHeapMax\":1862270976,\"gcOldCount\":0,\"gcOldTime\":0,\"agentStatType\":\"JVM_GC\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734972571,\"gcType\":\"CMS\",\"heapUsed\":313771872,\"heapMax\":2075918336,\"nonHeapUsed\":166042752,\"nonHeapMax\":1862270976,\"gcOldCount\":0,\"gcOldTime\":0,\"agentStatType\":\"JVM_GC\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734977571,\"gcType\":\"CMS\",\"heapUsed\":313871104,\"heapMax\":2075918336,\"nonHeapUsed\":166042752,\"nonHeapMax\":1862270976,\"gcOldCount\":0,\"gcOldTime\":0,\"agentStatType\":\"JVM_GC\"}],\"jvmGcDetailedBos\":[{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734952571,\"gcNewCount\":137,\"gcNewTime\":137,\"codeCacheUsed\":0.23604482014973957,\"newGenUsed\":0.3365665434917887,\"oldGenUsed\":0.07097294028726654,\"survivorSpaceUsed\":0.26038726694854625,\"permGenUsed\":0.0,\"metaspaceUsed\":0.17805741727352142,\"agentStatType\":\"JVM_GC_DETAILED\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734957571,\"gc^CNewCount\":137,\"gcNewTime\":137,\"codeCacheUsed\":0.23604482014973957,\"newGenUsed\":0.33660001573586634,\"oldGenUsed\":0.07097294028726654,\"survivorSpaceUsed\":0.26038726694854625,\"permGenUsed\":0.0,\"metaspaceUsed\":0.17805741727352142,\"agentStatType\":\"JVM_GC_DETAILED\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734962571,\"gcNewCount\":137,\"gcNewTime\":137,\"codeCacheUsed\":0.23604482014973957,\"newGenUsed\":0.3370492506911264,\"oldGenUsed\":0.07097294028726654,\"survivorSpaceUsed\":0.26038726694854625,\"permGenUsed\":0.0,\"metaspaceUsed\":0.17805741727352142,\"agentStatType\":\"JVM_GC_DETAILED\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734967571,\"gcNewCount\":137,\"gcNewTime\":137,\"codeCacheUsed\":0.23604482014973957,\"newGenUsed\":0.3379447310105645,\"oldGenUsed\":0.07097294028726654,\"survivorSpaceUsed\":0.26038726694854625,\"permGenUsed\":0.0,\"metaspaceUsed\":0.17805741727352142,\"agentStatType\":\"JVM_GC_DETAILED\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734972571,\"gcNewCount\":137,\"gcNewTime\":137,\"codeCacheUsed\":0.23604482014973957,\"newGenUsed\":0.3379447310105645,\"oldGenUsed\":0.07097294028726654,\"survivorSpaceUsed\":0.26038726694854625,\"permGenUsed\":0.0,\"metaspaceUsed\":0.17805741727352142,\"agentStatType\":\"JVM_GC_DETAILED\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734977571,\"gcNewCount\":137,\"gcNewTime\":137,\"codeCacheUsed\":0.23604482014973957,\"newGenUsed\":0.33811801553290943,\"oldGenUsed\":0.07097294028726654,\"survivorSpaceUsed\":0.26038726694854625,\"permGenUsed\":0.0,\"metaspaceUsed\":0.17805741727352142,\"agentStatType\":\"JVM_GC_DETAILED\"}],\"cpuLoadBos\":[{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734952571,\"jvmCpuLoad\":2.0268558398783886E-4,\"systemCpuLoad\":0.08330799635147461,\"agentStatType\":\"CPU_LOAD\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734957571,\"jvmCpuLoad\":3.54699771978718E-4,\"systemCpuLoad\":0.06369394476817836,\"agentStatType\":\"CPU_LOAD\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734962571,\"jvmCpuLoad\":2.0254190085573954E-4,\"systemCpuLoad\":0.07109220720036458,\"agentStatType\":\"CPU_LOAD\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734967571,\"jvmCpuLoad\":2.0258293238794632E-4,\"systemCpuLoad\":0.061028108381868826,\"agentStatType\":\"CPU_LOAD\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734972571,\"jvmCpuLoad\":2.0253164556962027E-4,\"systemCpuLoad\":0.07477723774807614,\"agentStatType\":\"CPU_LOAD\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734977571,\"jvmCpuLoad\":2.0244964065188785E-4,\"systemCpuLoad\":0.06570155902004454,\"agentStatType\":\"CPU_LOAD\"}],\"transactionBos\":[{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734952571,\"collectInterval\":5000,\"sampledNewCount\":0,\"sampledContinuationCount\":0,\"unsampledNewCount\":0,\"unsampledContinuationCount\":0,\"agentStatType\":\"TRANSACTION\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734957571,\"collectInterval\":5000,\"sampledNewCount\":2,\"sampledContinuationCount\":0,\"unsampledNewCount\":0,\"unsampledContinuationCount\":0,\"agentStatType\":\"TRANSACTION\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734962571,\"collectInterval\":5000,\"sampledNewCount\":0,\"sampledContinuationCount\":0,\"unsampledNewCount\":0,\"unsampledContinuationCount\":0,\"agentStatType\":\"TRANSACTION\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734967571,\"collectInterval\":5000,\"sampledNewCount\":2,\"sampledContinuationCount\":0,\"unsampledNewCount\":0,\"unsampledContinuationCount\":0,\"agentStatType\":\"TRANSACTION\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734972571,\"collectInterval\":5000,\"sampledNewCount\":2,\"sampledContinuationCount\":0,\"unsampledNewCount\":0,\"unsampledContinuationCount\":0,\"agentStatType\":\"TRANSACTION\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734977571,\"collectInterval\":5000,\"sampledNewCount\":0,\"sampledContinuationCount\":0,\"unsampledNewCount\":0,\"unsampledContinuationCount\":0,\"agentStatType\":\"TRANSACTION\"}],\"activeTraceBos\":[{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734952571,\"version\":0,\"histogramSchemaType\":2,\"activeTraceCounts\":{\"FAST\":0,\"SLOW\":0,\"VERY_SLOW\":0,\"NORMAL\":0},\"agentStatType\":\"ACTIVE_TRACE\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734957571,\"version\":0,\"histogramSchemaType\":2,\"activeTraceCounts\":{\"FAST\":0,\"SLOW\":0,\"VERY_SLOW\":0,\"NORMAL\":0},\"agentStatType\":\"ACTIVE_TRACE\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734962571,\"version\":0,\"histogramSchemaType\":2,\"activeTraceCounts\":{\"FAST\":0,\"SLOW\":0,\"VERY_SLOW\":0,\"NORMAL\":0},\"agentStatType\":\"ACTIVE_TRACE\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734967571,\"version\":0,\"histogramSchemaType\":2,\"activeTraceCounts\":{\"FAST\":0,\"SLOW\":0,\"VERY_SLOW\":0,\"NORMAL\":0},\"agentStatType\":\"ACTIVE_TRACE\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734972571,\"version\":0,\"histogramSchemaType\":2,\"activeTraceCounts\":{\"FAST\":0,\"SLOW\":0,\"VERY_SLOW\":0,\"NORMAL\":0},\"agentStatType\":\"ACTIVE_TRACE\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734977571,\"version\":0,\"histogramSchemaType\":2,\"activeTraceCounts\":{\"FAST\":0,\"SLOW\":0,\"VERY_SLOW\":0,\"NORMAL\":0},\"agentStatType\":\"ACTIVE_TRACE\"}],\"dataSourceListBos\":[{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734952571,\"list\":[{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734952571,\"id\":1,\"serviceTypeCode\":6050,\"databaseName\":\"srdb1_sr\",\"jdbcUrl\":\"jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = 132.252.129.28)(PORT = 1621))(ADDRESS = (PROTOCOL = TCP)(HOST = 132.252.129.29)(PORT = 1621))(LOAD_BALANCE=NO))(CONNECT_DATA =(SERVICE_NAME =SRDB1_SR)))\",\"activeConnectionSize\":0,\"maxConnectionSize\":5,\"agentStatType\":\"DATASOURCE\"}],\"agentStatType\":\"DATASOURCE\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734957571,\"list\":[{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734957571,\"id\":1,\"serviceTypeCode\":6050,\"databaseName\":\"srdb1_sr\",\"jdbcUrl\":\"jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = 132.252.129.28)(PORT = 1621))(ADDRESS = (PROTOCOL = TCP)(HOST = 132.252.129.29)(PORT = 1621))(LOAD_BALANCE=NO))(CONNECT_DATA =(SERVICE_NAME =SRDB1_SR)))\",\"activeConnectionSize\":0,\"maxConnectionSize\":5,\"agentStatType\":\"DATASOURCE\"}],\"agentStatType\":\"DATASOURCE\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734962571,\"list\":[{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734962571,\"id\":1,\"serviceTypeCode\":6050,\"databaseName\":\"srdb1_sr\",\"jdbcUrl\":\"jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = 132.252.129.28)(PORT = 1621))(ADDRESS = (PROTOCOL = TCP)(HOST = 132.252.129.29)(PORT = 1621))(LOAD_BALANCE=NO))(CONNECT_DATA =(SERVICE_NAME =SRDB1_SR)))\",\"activeConnectionSize\":0,\"maxConnectionSize\":5,\"agentStatType\":\"DATASOURCE\"}],\"agentStatType\":\"DATASOURCE\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734967571,\"list\":[{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734967571,\"id\":1,\"serviceTypeCode\":6050,\"databaseName\":\"srdb1_sr\",\"jdbcUrl\":\"jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = 132.252.129.28)(PORT = 1621))(ADDRESS = (PROTOCOL = TCP)(HOST = 132.252.129.29)(PORT = 1621))(LOAD_BALANCE=NO))(CONNECT_DATA =(SERVICE_NAME =SRDB1_SR)))\",\"activeConnectionSize\":0,\"maxConnectionSize\":5,\"agentStatType\":\"DATASOURCE\"}],\"agentStatType\":\"DATASOURCE\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734972571,\"list\":[{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734972571,\"id\":1,\"serviceTypeCode\":6050,\"databaseName\":\"srdb1_sr\",\"jdbcUrl\":\"jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = 132.252.129.28)(PORT = 1621))(ADDRESS = (PROTOCOL = TCP)(HOST = 132.252.129.29)(PORT = 1621))(LOAD_BALANCE=NO))(CONNECT_DATA =(SERVICE_NAME =SRDB1_SR)))\",\"activeConnectionSize\":0,\"maxConnectionSize\":5,\"agentStatType\":\"DATASOURCE\"}],\"agentStatType\":\"DATASOURCE\"},{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734977571,\"list\":[{\"agentId\":\"EA-132.252.143.28-31337\",\"startTimestamp\":1541270774525,\"timestamp\":1541734977571,\"id\":1,\"serviceTypeCode\":6050,\"databaseName\":\"srdb1_sr\",\"jdbcUrl\":\"jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = 132.252.129.28)(PORT = 1621))(ADDRESS = (PROTOCOL = TCP)(HOST = 132.252.129.29)(PORT = 1621))(LOAD_BALANCE=NO))(CONNECT_DATA =(SERVICE_NAME =SRDB1_SR)))\",\"activeConnectionSize\":0,\"maxConnectionSize\":5,\"agentStatType\":\"DATASOURCE\"}],\"agentStatType\":\"DATASOURCE\"}]}";
    //private static String jsonSource = "{\"agentId\":\"HC-132.252.143.146-31381\",\"jvmGcBos\":[{\"agentId\":\"HC-132.252.143.146-31381\",\"startTimestamp\":1541638668323,\"timestamp\":1541734952322,\"gcType\":\"CMS\",\"heapUsed\":2227890568,\"heapMax\":4151836672,\"nonHeapUsed\":464892112,\"nonHeapMax\":1862270976,\"gcOldCount\":5,\"gcOldTime\":1561,\"agentStatType\":\"JVM_GC\"}]}";
    //private static String jsonSource = "{\"name\":\"shaofei\",\"age\":20,\"like\":['computer','java',{\"name\":\"shaofei\",\"age\":19},'android']}";
    private static String jsonTarget = "";


    public static void main(String[] args) {
        Console.log(jsonSource);
        Console.log(jsonSource.length());
        Map<String, Object> stringObjectTreeMap = JSONObject.parseObject(jsonSource, TreeMap.class);

        stringObjectTreeMap = parserObject(stringObjectTreeMap);

        String resultJsonString = JSONObject.toJSONString(stringObjectTreeMap);

        Console.log(resultJsonString);
        Console.log(resultJsonString.length());


    }

    /**
     * 对JSON数据进行排序  可以对jsonObject的数据的key进行排序 也可以对数组中的所有元素进行排序
     *
     * @param map
     * @return
     */
    private static TreeMap<String, Object> parserObject(Map<String, Object> map) {
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
