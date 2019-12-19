package com.example.mdpproject;

import java.util.ArrayList;

public class user {
    public int lvl;
    public int xp;
    public int coin;
    public int energy;
    public int health;
    public int fullness;
    public int fun;
    public boolean lampStatus;
    public boolean clean;
    ArrayList<item> items = new ArrayList<>();

    public user(int lvl, int xp, int coin, int energy, int health, int fullness, int fun, ArrayList<item> items) {
        this.lvl = lvl;
        this.xp = xp;
        this.coin = coin;
        this.energy = energy;
        this.health = health;
        this.fullness = fullness;
        this.fun = fun;
        this.items = items;
        lampStatus=true;
        clean=true;
    }

    public user(user u) {
        this.lvl = u.getLvl();
        this.xp = u.getXp();
        this.coin = u.getCoin();
        this.energy = u.getEnergy();
        this.health = u.getHealth();
        this.fullness = u.getFullness();
        this.fun = u.getFun();
        this.items = u.getItems();
        this.lampStatus=u.isLampStatus();
        this.clean=u.isClean();
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
        if(this.xp>=100){
            this.lvl+=1;
            this.xp-=100;
        }
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {this.clean = clean;}

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
        if(this.energy>100){
            this.energy=100;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if(this.health>100){
            this.health=100;
        }
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
        if(this.fullness>100){
            this.fullness=100;
        }
    }

    public int getFun() {
        return fun;
    }

    public void setFun(int fun) {
        this.fun = fun;
        if(this.fun>100){
            this.fun=100;
        }
    }


    public boolean isLampStatus() {
        return lampStatus;
    }

    public void setLampStatus(boolean lampStatus) {
        this.lampStatus = lampStatus;
    }

    public ArrayList<item> getItems() {
        return items;
    }

    public void setItems(ArrayList<item> items) {
        this.items = items;
    }
}
