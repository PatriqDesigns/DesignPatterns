package com.patriqdesigns.patterns.proxy.protection.hotornot;

/**
 * Created by Andre on 24/07/15.
 */
public class Person implements PersonBean {

    private String name;
    private String gender;
    private String interests;
    private int hotOrNot;
    private int ratedCount;

    public Person(String name, String gender, String interests) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratedCount == 0) return 0;
        return hotOrNot/ratedCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.hotOrNot+=rating;
        this.ratedCount++;
    }
}
