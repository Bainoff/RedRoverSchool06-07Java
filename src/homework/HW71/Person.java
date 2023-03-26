package homework.HW71;

public class Person {
//TODO    Необходимо создать класс Person с полями: имя, возраст, пол.
//    Класс должен иметь метод - getName,
//    метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
    String name;
    byte age;
    String gender;
    public String getName() {
        if (gender == "male") return "Mr." + name;
        else return "Mrs." + name;
    }
}
