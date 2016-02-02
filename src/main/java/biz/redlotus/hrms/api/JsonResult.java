package biz.redlotus.hrms.api;

import biz.redlotus.hrms.enumeration.AjaxResultEnum;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;

import java.util.List;

/**
 * Created by blogw on 2016/02/02.
 */
public class JsonResult {
    private String result;
    private String error;
    private int total;
    private Iterable<Object> list;
    private Object data;

    public static JsonResult createJson(Object o){
        JsonResult json=new JsonResult();
        json.setResult(AjaxResultEnum.SUCCESS.getLabel());
        json.setData(o);
        return json;
    }

    public static JsonResult createListJson(Iterable<Object>list){
        JsonResult json=new JsonResult();
        json.setResult(AjaxResultEnum.SUCCESS.getLabel());
        json.setList(list);
        json.setTotal(Iterables.size(list));
        return json;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Iterable<Object> getList() {
        return list;
    }

    public void setList(Iterable<Object> list) {
        this.list = list;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
