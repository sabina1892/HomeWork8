package HomeWork6;

import HomeWork4.Human;
import HomeWork4.Pet;
import org.junit.jupiter.api.Test;

import java.util.*;


public class aHappyFamily1 {

    public static void main(String[] args) throws Throwable {

        Set <String> habits = new HashSet<>();
        habits.add("Eating");
        habits.add("sleeping");

        Pet1 pet = new Fish("Rock", 5, 25, habits);
        pet.respond();
        Human1 mother = new Human1("Jane", "Karleone", 1935);
        Human1 father = new Human1("Vito", "Karleone", 1932);
        Family family = new Family(mother, father);

        Map<String,String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.SUNDAY.name(), "do home work");
        mother.setSchedule(schedule);
        Human1 child = new Human1("Michael", "Karleone", 1977,
                95, schedule,family);
        Set<Pet1> bezdim_pet = new HashSet<>();
        bezdim_pet.add(pet);
        family.setPet(bezdim_pet);
        Men men = new Men();
        Women women = new Women();
        men.greetPet();
        men.repairCar();
        women.greetPet();
        women.makeUp();

        family.addChild(child);
        family.countFamily();
        System.out.println(child.getFamily());
        System.out.println(family);

        family.deleteChild(child);
        System.out.println(family);
        family.countFamily();
        //family.finalize();
        //  pet.finalize();

        for (int i = 0; i < 10000; i++) {
            Human1 human = new Human1();
        }
    }


}