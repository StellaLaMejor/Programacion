package ejercicos12_15.ejercicio12_15.entities;

import java.util.Objects;

public class Actor implements Comparable <Actor> {

private final int actorId;
private final String firstName;
private final String lastName;


    public Actor(int actorId, String firstName, String lastName) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor(int actorId) {
        this.actorId = actorId;
        this.firstName = "";
        this.lastName = "";
    }

    public int getActorId() {
        return actorId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor actor)) return false;
        return actorId == actor.actorId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId);
    }

    @Override
    public int compareTo(Actor o) {
        return Integer.compare(this.actorId, o.getActorId());
    }
}
