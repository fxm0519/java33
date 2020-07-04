package com.accp.domain;

import java.util.List;

public class Users {
    private Integer uid;

    private String uname;

    private String ulian;

    private String udate;

    private String uphone;

    private String ufz;

    private String usw;
    
    private List<Address> address;
    
    public List<Address> getAddress() {
		return address;
	}
    
    public void setAddress(List<Address> address) {
		this.address = address;
	}

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUlian() {
        return ulian;
    }

    public void setUlian(String ulian) {
        this.ulian = ulian;
    }

    public String getUdate() {
        return udate;
    }

    public void setUdate(String udate) {
        this.udate = udate;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUfz() {
        return ufz;
    }

    public void setUfz(String ufz) {
        this.ufz = ufz;
    }

    public String getUsw() {
        return usw;
    }

    public void setUsw(String usw) {
        this.usw = usw;
    }
}