package org.galaxy.study;

import java.io.Serializable;

/**
 * Created by OoO on 2017/2/17.
 */
public class MyBean implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
