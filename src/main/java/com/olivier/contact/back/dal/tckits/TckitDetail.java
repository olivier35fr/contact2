package com.olivier.contact.back.dal.tckits;

import java.util.ArrayList;

public class TckitDetail {

    private int tckit_id;
    private String emat8;
    private String nin;
    private String pnr;
    private String mfc;

    public TckitDetail() {
    }

    public int getTckit_id() {
        return tckit_id;
    }

    public void setTckit_id(int tckit_id) {
        this.tckit_id = tckit_id;
    }

    public String getEmat8() {
        return emat8;
    }

    public void setEmat8(String emat8) {
        this.emat8 = emat8;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getMfc() {
        return mfc;
    }

    public void setMfc(String mfc) {
        this.mfc = mfc;
    }
}
