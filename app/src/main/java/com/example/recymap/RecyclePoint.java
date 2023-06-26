package com.example.recymap;

public class RecyclePoint {
    String geom;
    int pointId;
    String address;
    String title;

    double latitude;
    double longitude;

    public void parseCoordinates() {
        String[] coordinates = geom.substring(6, geom.length() - 2).split("\\s");
        latitude = Double.parseDouble(coordinates[1]);
        longitude = Double.parseDouble(coordinates[0]);
    }

    @Override
    public String toString() {
        return "RecyclePoint{" +
                "geom='" + geom + '\'' +
                ", pointId=" + pointId +
                ", address='" + address + '\'' +
                ", title='" + title + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
