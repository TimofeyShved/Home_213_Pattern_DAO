package com.company;

public class Main {

    // Данный паттерн уберегает нас от переписания огромного количества кода,
    // для этого мы делаем обёртку и в которой в нужную команду записываются старые
    static Data data = new FileSystem();

    public static void main(String[] args) {
        System.out.println(data.getData());
    }
}

// например у нрас 2 класса, но у каждого разное название и разные методы
// и что бы не переписывать во всей программе новое название метода, мы делаем свой универсальный
interface Data{
    String getData();
}

class DB implements Data{
    String getFromTable(){
        return "data from table";
    }

    @Override
    public String getData() {
        return getFromTable();
    }
}

class FileSystem implements Data{
    String getFromTFormsFs(){
        return "data from fs";
    }

    @Override
    public String getData() {
        return getFromTFormsFs();
    }
}
