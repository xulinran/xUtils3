package org.xutils.sample.http;

import org.xutils.http.app.ResponseParser;
import org.xutils.http.request.UriRequest;

import java.lang.reflect.Type;

/**
 * Created by wyouflf on 15/11/5.
 */
public class JsonResponseParser implements ResponseParser {

    @Override
    public void checkResponse(UriRequest request) throws Throwable {
        // custom check ?
        // check header ?
    }

    /**
     * 转换result为resultType类型的对象
     *
     * @param resultType  返回值类型(可能带有泛型信息)
     * @param resultClass 返回值类型
     * @param result      字符串数据
     * @return
     * @throws Throwable
     */
    @Override
    public Object parse(Type resultType, Class<?> resultClass, String result) throws Throwable {
        // TODO: json to java bean
        //if (List.class.isAssignableFrom(resultClass)) {
        //    return Sdk.json().decodeList(result,
        //            (Class<?>) ParameterizedTypeUtil.getParameterizedType(resultType, List.class, 0));
        //} else {
        //    return Sdk.json().decode(result, resultClass);
        //}

        // 这里只是个示例, 不做json转换.
        BaiduResponse baiduResponse = new BaiduResponse();
        baiduResponse.setTest(result);
        return baiduResponse;
    }
}
