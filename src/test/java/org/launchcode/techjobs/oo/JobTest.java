package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;
import org.launchcode.techjobs.oo.Job;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JobTest {
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        Assert.assertTrue(job instanceof Job);
        Assert.assertEquals("Product tester", job.getName());

        Assert.assertTrue(job.getEmployer() instanceof  Employer);
        Assert.assertEquals(job.getEmployer().getValue(), "ACME");

        Assert.assertTrue(job.getLocation() instanceof  Location);
        Assert.assertEquals(job.getLocation().getValue(), "Desert");

        Assert.assertTrue(job.getPositionType() instanceof  PositionType);
        Assert.assertEquals(job.getPositionType().getValue(), "Quality control");

        Assert.assertTrue(job.getCoreCompetency() instanceof  CoreCompetency);
        Assert.assertEquals(job.getCoreCompetency().getValue(), "Persistence");

    }
@Test
    public void testJobsForEquality(){
        Job job3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job job4= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertFalse(job3.equals(job4));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String output = Job.toString(job);

        Assert.assertTrue(output.startsWith(System.lineSeparator()));
        Assert.assertTrue(output.endsWith(System.lineSeparator()));

    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        // Arrange: Setup your job and expected output
        Job job= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expectedOutput = System.lineSeparator() + "ID: 4" + System.lineSeparator() + "Name: Product tester" + System.lineSeparator() + "Employer: ACME" + System.lineSeparator() + "Location: Desert" + System.lineSeparator() + "Position Type: Quality control" + System.lineSeparator() + "Core Competency: Persistence" + System.lineSeparator();

        String actualOutput = Job.toString(job);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job(null, new Employer(), new Location(), new PositionType(), new CoreCompetency());

        String expectedOutput = System.lineSeparator() + "ID: 3" + System.lineSeparator() + "Name: Data not Available" + System.lineSeparator() + "Employer: Data not Available" + System.lineSeparator() + "Location: Data not Available" + System.lineSeparator() + "Position Type: Data not Available" + System.lineSeparator() + "Core Competency: Data not Available" + System.lineSeparator();

        String actualOutput = Job.toString(job);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    //TODO: Create your unit tests here
}
