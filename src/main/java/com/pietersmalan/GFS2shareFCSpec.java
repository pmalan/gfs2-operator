package com.pietersmalan;

public class GFS2shareFCSpec {

    private String WWID;
    public String getWWID() {
        return WWID;
    }
    public void setWWID(String wWID) {
        WWID = wWID;
    }
    private GFS2VolumeSpec volumeSpec;
    public GFS2VolumeSpec getVolumeSpec() {
        return volumeSpec;
    }
    public void setVolumeSpec(GFS2VolumeSpec volumeSpec) {
        this.volumeSpec = volumeSpec;
    } 
}
