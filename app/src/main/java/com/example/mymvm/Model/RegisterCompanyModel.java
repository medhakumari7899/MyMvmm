package com.example.mymvm.Model;

public class RegisterCompanyModel {
   String name,country,streetaddress, mainbussinessactivities,shareholders,percentages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getMainbussinessactivities() {
        return mainbussinessactivities;
    }

    public void setMainbussinessactivities(String mainbussinessactivities) {
        this.mainbussinessactivities = mainbussinessactivities;
    }

    public String getShareholders() {
        return shareholders;
    }

    public void setShareholders(String shareholders) {
        this.shareholders = shareholders;
    }

    public String getPercentages() {
        return percentages;
    }

    public void setPercentages(String percentages) {
        this.percentages = percentages;
    }

    public RegisterCompanyModel(String name, String country, String streetaddress, String mainbussinessactivities, String shareholders, String percentages) {
        this.name = name;
        this.country = country;
        this.streetaddress = streetaddress;
        this.mainbussinessactivities = mainbussinessactivities;
        this.shareholders = shareholders;
        this.percentages = percentages;
    }
}
