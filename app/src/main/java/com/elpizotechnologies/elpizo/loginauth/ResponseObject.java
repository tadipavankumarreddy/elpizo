
package com.elpizotechnologies.elpizo.loginauth;

import java.util.HashMap;
import java.util.Map;

public class ResponseObject {

    private EmpData empData;
    private LoginData loginData;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public EmpData getEmpData() {
        return empData;
    }

    public void setEmpData(EmpData empData) {
        this.empData = empData;
    }

    public LoginData getLoginData() {
        return loginData;
    }

    public void setLoginData(LoginData loginData) {
        this.loginData = loginData;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
