package it.logic.portate;

public class Dish extends Course {

    private CategoryEnum courseCategory;

    public Dish(String name, double price, CourseTypeEnum courseType, CategoryEnum courseCategory) {
        super(name, price, courseType);
        this.setCourseCategory(courseCategory);
    }

    public CategoryEnum getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(CategoryEnum courseCategory) {
        this.courseCategory = courseCategory;
    }
}
