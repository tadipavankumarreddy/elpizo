
package com.elpizotechnologies.elpizo.loginauth;

import java.util.HashMap;
import java.util.Map;

public class EmpData {

    private String custName;
    private String phoneNo;
    private String custCardNo;
    private Object areaName;
    private Object lineName;
    private Object lineId;
    private Integer technicianId;
    private Object technicianName;
    private Integer id;
    private Object assignedId;
    private Object issueName;
    private Object adminId;
    private Object adminName;
    private Object email;
    private Object assignedName;
    private String stbNo;
    private Object status;
    private Object isactive;
    private Object reason;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCustCardNo() {
        return custCardNo;
    }

    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    public Object getAreaName() {
        return areaName;
    }

    public void setAreaName(Object areaName) {
        this.areaName = areaName;
    }

    public Object getLineName() {
        return lineName;
    }

    public void setLineName(Object lineName) {
        this.lineName = lineName;
    }

    public Object getLineId() {
        return lineId;
    }

    public void setLineId(Object lineId) {
        this.lineId = lineId;
    }

    public Integer getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(Integer technicianId) {
        this.technicianId = technicianId;
    }

    public Object getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(Object technicianName) {
        this.technicianName = technicianName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getAssignedId() {
        return assignedId;
    }

    public void setAssignedId(Object assignedId) {
        this.assignedId = assignedId;
    }

    public Object getIssueName() {
        return issueName;
    }

    public void setIssueName(Object issueName) {
        this.issueName = issueName;
    }

    public Object getAdminId() {
        return adminId;
    }

    public void setAdminId(Object adminId) {
        this.adminId = adminId;
    }

    public Object getAdminName() {
        return adminName;
    }

    public void setAdminName(Object adminName) {
        this.adminName = adminName;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getAssignedName() {
        return assignedName;
    }

    public void setAssignedName(Object assignedName) {
        this.assignedName = assignedName;
    }

    public String getStbNo() {
        return stbNo;
    }

    public void setStbNo(String stbNo) {
        this.stbNo = stbNo;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Object getIsactive() {
        return isactive;
    }

    public void setIsactive(Object isactive) {
        this.isactive = isactive;
    }

    public Object getReason() {
        return reason;
    }

    public void setReason(Object reason) {
        this.reason = reason;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
