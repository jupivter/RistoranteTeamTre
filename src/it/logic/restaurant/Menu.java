package it.logic.restaurant;

import it.database.Alter;
import it.database.Create;
import it.logic.portate.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private CategoryEnum categoryMenu;
    private List<Course> menuCoursesList;

    public Menu(CategoryEnum categoryMenu){
        this.categoryMenu = categoryMenu;
        this.menuCoursesList = new ArrayList<>();
    }

    public CategoryEnum getCategoryMenu() {
        return categoryMenu;
    }

    public void setCategoryMenu(CategoryEnum categoryMenu) {
        this.categoryMenu = categoryMenu;
    }

    public List<Course> getMenuCoursesList() {
        return menuCoursesList;
    }

    public void setMenuCoursesList(List<Course> menuCoursesList) {
        this.menuCoursesList = menuCoursesList;
    }

    /*public List<Bevanda> listaBevande() {
        return (List<Bevanda>) listaPortate.stream()
                                .filter(portata -> portata.getTipoPortata() == TipoPortataEnum.BEVANDA)
                                .collect(Collectors.toList());
    }*/

    /**
     * Questo metodo crea e aggiunge un piatto alla lista portate del menu.
     * @param name
     * @param price
     * @param courseType
     * @param courseCategory
     */
    public void addDish(String name, double price, CourseTypeEnum courseType, CategoryEnum courseCategory){
        getMenuCoursesList().add(new Dish(name, price, courseType, courseCategory));
    }

    /**
     * Questo metodo crea e aggiunge una bevanda alla lista portate del menu.
     * @param name
     * @param price
     */
    public void addDrink(String name, double price, boolean alcoholic){
        getMenuCoursesList().add(new Drink(name, price, alcoholic));
    }

    /**
     * Questo metodo stampa le portate aggiunte alla lista portate del menu in base al tipo passato come argomento.
     * @param courseType
     */
    public void printCoursesByType(CourseTypeEnum courseType){
        System.out.printf("%s %n", courseType.getPluralName());
        for (Course course : menuCoursesList) {
            if (course.getCourseTypeEnum().equals(courseType)){
                course.printInfoCourse();
            }
        }
        System.out.println("\n");
    }

    /*public List<Piatto> listPiattiByTypePortata(TipoPortataEnum type) {
        return (List<Piatto>) listaPortate.stream()
                                .filter(portata -> portata.getTipoPortata() == type)
                                .collect(Collectors.toList());
    }*/

    /**
     * Questo metodo stampa un intero menu usando il metodo {@link Menu#printCoursesByType} per ogni tipologia.
     */
    public void printMenu(){
        printCoursesByType(CourseTypeEnum.DRINK);
        printCoursesByType(CourseTypeEnum.STARTER);
        printCoursesByType(CourseTypeEnum.FIRST);
        printCoursesByType(CourseTypeEnum.SECOND);
        printCoursesByType(CourseTypeEnum.DESSERT);
    }

    /*public static List<Piatto> filterPiatti (List<Piatto> listaPiatti, CategoriaEnum categoriaEnum){
        List<Piatto> listaFiltrata = new ArrayList<>();
        for (Piatto piatto : listaPiatti) {
            if (piatto.getCategoriaPortata().equals(categoriaEnum)){
                listaFiltrata.add(piatto);
            }
        }
        System.out.println("\n------------LISTA FILTRATA------------\n");
        listaFiltrata.forEach(piatto -> piatto.stampaDettagli());
        return listaFiltrata;
    }*/

    /**
     * Questo metodo crea nel database una tabella del menu denominandola automaticamente come 'Menu + categoriaMenu'.
     * @throws SQLException
     */
    public void createMenuTable() throws SQLException {
        Create.createTable("Menu "+this.categoryMenu.name()+"", "idPortata");
        Alter.addNewColumn("Menu "+this.categoryMenu.name()+"", "nome", "VARCHAR(45)");
        Alter.addNewColumn("Menu "+this.categoryMenu.name()+"", "prezzo", "DOUBLE" );
        Alter.addNewColumn("Menu "+this.categoryMenu.name()+"", "tipoPortata", "VARCHAR(45)" );
        Alter.addNewColumn("Menu "+this.categoryMenu.name()+"", "categoriaPortata", "VARCHAR(45)");
    }

    public void addCourseToMenuTable(){
    }
}
