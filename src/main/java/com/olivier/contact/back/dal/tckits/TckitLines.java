package com.olivier.contact.back.dal.tckits;

public class TckitLines {

    private int tckit_line_id;
    private int tckit_id;
    private int component_id;

    public TckitLines() {
    }

    public int getTckit_line_id() {
        return tckit_line_id;
    }

    public void setTckit_line_id(int tckit_line_id) {
        this.tckit_line_id = tckit_line_id;
    }

    public int getTckit_id() {
        return tckit_id;
    }

    public void setTckit_id(int tckit_id) {
        this.tckit_id = tckit_id;
    }

    public int getComponent_id() {
        return component_id;
    }

    public void setComponent_id(int component_id) {
        this.component_id = component_id;
    }
}
