package de.nordakademie.mariokartturinier_remake;

public class Player {


    private String name;
    private int points;
    private int place;
    private boolean active;

public Player(String name) {
    this.name = name;
    this.points = 0;
    this.place = 0;
    this.active = true;
}

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
