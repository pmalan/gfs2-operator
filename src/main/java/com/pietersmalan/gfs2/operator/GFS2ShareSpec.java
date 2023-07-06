package com.pietersmalan.gfs2.operator;

public class GFS2ShareSpec {
    public enum Transport {
        iSCSI,
        FC
    }

    private Transport transport = Transport.iSCSI;
    private String portal = "10.10.10.10";
    private int port=3210;
    private String username="admin";
    private String password="admin";
    private String wwid="";
    public Transport getTransport() {
        return transport;
    }
    public void setTransport(Transport transport) {
        this.transport = transport;
    }
    public String getPortal() {
        return portal;
    }
    public void setPortal(String portal) {
        this.portal = portal;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getWwid() {
        return wwid;
    }
    public void setWwid(String wwid) {
        this.wwid = wwid;
    }

    
}
