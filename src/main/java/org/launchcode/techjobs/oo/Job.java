package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    public static String toString(Job job) {

        if (job.name == null || job.getName().isEmpty()) {
            job.name="Data not Available";
        }
        if (job.employer.getValue() == null || job.getEmployer().getValue().isEmpty()) {
            job.employer.setValue("Data not available");
        }
        if (job.location.getValue() == null || job.getLocation().getValue().isEmpty()) {
            job.location.setValue("Data not available");
        }
        if (job.positionType.getValue() == null || job.getPositionType().getValue().isEmpty()) {
            job.positionType.setValue("Data not available");
        }
        if (job.coreCompetency.getValue() == null || job.getCoreCompetency().getValue().isEmpty()) {
            job.coreCompetency.setValue("Data not available");

        }
        return "ID: " + job.getId() + System.lineSeparator() + "Name: " + job.getName() + System.lineSeparator() + "Employer " + job.getEmployer() + System.lineSeparator() + "Location " + job.getLocation() + System.lineSeparator() + "Position Type " + job.getPositionType() + System.lineSeparator() + "Core Competency " + job.getCoreCompetency() + System.lineSeparator();

    }
}

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

