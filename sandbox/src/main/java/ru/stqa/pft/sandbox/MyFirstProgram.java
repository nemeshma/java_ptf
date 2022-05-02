package ru.stqa.pft.sandbox;

/** знакомство до п.1.7
* public class MyFirstProgram - декларация одноименного класса
* public static void main(String[] args) {
    String somebody = "world";
    System.out.println("Hello, " + somebody + "!"); - это функция или метод
      - после имени функции - круглые скобки (как отличить функцию)
      - (String[] args) - это список или массив строк + параметр + аргумент
      - { String somebody = "world" } - исполняемы код
* "Hello, " - литеральное значение
*/
/**public class MyFirstProgram {

  public static void main(String[] args) {
    String somebody = "world";
    System.out.println("Hello, " + somebody + "!");
*/
/**
- int - тип переменной
- l - переменная
- 7 - значение
*/
/**    int l = 7;
    int s = l * l;
    System.out.println("Площадь квадрата со стороной " + l + " = " + s);

    double m = 8.0;
    double n = m * m;
    System.out.println("Площадь квадрата со стороной " + m + " = " + n);

    System.out.println(2 + 2);
    System.out.println(1.0 / 2);
*/
/**
- "2" + "2" - конкатенация
*/
/**    System.out.println("2" + "2");
  }

}
*/

public class MyFirstProgram {
  /**
   * параметризовали функцию
   * void - ключевое слово. Означет - пустота. Ничего не возвращает
   */
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Maks");

    double len = 5;
    System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

    double a = 6;
    double b = 7;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double l) {
    return l * l;
  }

  public static double area(double a, double b) {
    return a * b;
  }

}

