/**

 * This is a class that defines a City.

 */
package com.example.listycity;

import java.util.Objects;

public class City implements Comparable<City> {
    private String city;
    private String province;

    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    String getCityName() {
        return this.city;
    }

    String getProvinceName() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.city) && province.equals(city1.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }

    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
}