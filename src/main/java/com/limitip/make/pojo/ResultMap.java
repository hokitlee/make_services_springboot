package com.limitip.make.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ResultMap implements Serializable{
    private Map<String,Serializable> result;

    public Map<String, Serializable> getResult() {
        if (result == null){
            result = new HashMap<>();
        }
        return result;
    }

    public void setResult(Map<String, Serializable> result) {
        this.result = result;
    }
}
