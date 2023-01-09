package it.logic.portate;

public class Course {

    private String name;
    private double price;
    private CourseTypeEnum courseTypeEnum;

    public Course(String name, double price, CourseTypeEnum courseTypeEnum) {
        this.name = name;
        this.price = price;
        this.courseTypeEnum = courseTypeEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CourseTypeEnum getCourseTypeEnum() {
        return courseTypeEnum;
    }

    public void setCourseTypeEnum(CourseTypeEnum courseTypeEnum) {
        this.courseTypeEnum = courseTypeEnum;
    }

    @Override
    public String toString() {
        return name + " | " + courseTypeEnum + " | " + price + "€ | ";
    }

    /**
     * Questo metodo stampa i dettagli di una singola portata.
     */
    public void printInfoCourse(){
        System.out.printf("%-35s %10s %n", name, price);
    }
}