package com.pietersmalan;

public class GFS2VolumeSpec {
    private boolean forceFormat;
    public boolean isForceFormat() {
        return forceFormat;
    }
    public void setForceFormat(boolean forceFormat) {
        this.forceFormat = forceFormat;
    }
    private int journals=2;
    public int getJournals() {
        return journals;
    }
    public void setJournals(int journals) {
        this.journals = journals;
    }
    
}
