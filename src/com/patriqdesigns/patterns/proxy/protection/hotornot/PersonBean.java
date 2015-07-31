package com.patriqdesigns.patterns.proxy.protection.hotornot;

/**
 * Created by Andre on 24/07/15.
 */
public interface PersonBean {

    public String getName();
    public String getGender();
    public String getInterests();
    public int getHotOrNotRating();

    public void setName(String name);
    public void setGender(String gender);
    public void setInterests(String interests);
    public void setHotOrNotRating(int rating);

}
