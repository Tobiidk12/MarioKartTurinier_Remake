package de.nordakademie.mariokartturinier_remake;

/**
 * The type Player.
 */
public class Player {


    private String name;
    private int points;
    private int place;
    private boolean active;
    private int round;

    public int getRound() {
        return round;
    }

    /**
     * Instantiates a new Player.
     *
     * @param name the name
     */
    public Player(String name) {
    this.name = name;
    this.points = 0;
    this.place = 1;
    this.active = true;
    this.round = 1;
}
public void nextRound() {
        this.round++;
}
public void repeatRound() {
        this.round--;
}

    /**
     * Gets points.
     *
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * Increase points.
     *
     * @param points the points
     */
    public void increasePoints(int points) {
        this.points = this.points + points;
}

    /**
     * Decrease points.
     *
     * @param points the points
     */
    public void decreasePoints(int points) {
        this.points = this.points - points;
    }


    /**
     * Gets place.
     *
     * @return the place
     */
    public int getPlace() {
        return place;
    }

    /**
     * Sets place.
     *
     * @param place the place
     */
    public void setPlace(int place) {
    if (place > 0 ) {
        this.place = place;
    }
    }

    /**
     * Is active boolean.
     *
     * @return the boolean
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets active.
     */
    public void setActive() {
        this.active = true;
    }

    /**
     * Sets inactive.
     */
    public void setInactive() {
    this.active = false;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Tostring.
     */
    @Override
    public String toString() {
    return ("Player: " + name + " | points: " + points + " | place: " + place + " | active: " + active + " | round: " + round);
    }

}
