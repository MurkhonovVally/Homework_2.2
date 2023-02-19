import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int intNumber = 33;
        changeValue(intNumber);
        System.out.println(intNumber);

        //Так как мы не присваиваем переменной intNumber новое значение,
        // а в методе его копия
        // её значение не изменится, что бы получить новое значение для переменной инт
        // нужно что бы метод возвращал новое значение его и присвоить переменной intNumber

        intNumber = normalChangeValue(intNumber);
        System.out.println(intNumber);


        Integer integerNumber = 33;
        changeValue(integerNumber);
        System.out.println(integerNumber);
        integerNumber = normalChangeValue(integerNumber);
        System.out.println(integerNumber);

        // Так как мы не присваиваем объекту integerNumber новое значение,
        // а в метод передается ссылка на объект и по значению по этой ссылку создается его копия с которой мы и работаем
        // а так как Integer не имеет опреаторов присвоеня в методе мы меняем лишь значение копии, а не самого объекта
        // что бы получить новое значение для объекта Integer
        // нужно что бы метод возвращал новое значение его и присвоить переменной integerNumber

        Integer[] integerNumbers = {3,4};
        changeValue(integerNumbers);
        System.out.println(Arrays.toString(integerNumbers));

        normalChangeValue(integerNumbers);
        System.out.println(Arrays.toString(integerNumbers));

        // в данном случае в методе мы присваиваем переменной ссылку на новый массив но в переменную integerNumbers
        // мы не передаем значение нового массива, при этом при обращении к ячейкам массива в методе мы можем менять
        // их значения так как мы обращаеся к конкретным ячейкам памяти.

        Person person = new Person("Lyapis", "Trubetskoy");
        person.changePerson(person);
        System.out.println(person);

        //метод переопределяет сслку на копию объекта person, но в мейн у нас остаётся та же ссылка на старый объект
        // по этому вовод не меняется. так как изначальный объект остался неизменным
        // для того что бы поменять поля объекта там нужно поменять сами поля нашего объекта,
        // а не поменять ссылку на объект без возвращения ссылки на новый обхект и присвоения её новой переменной.

        person.normalChangePerson(new Person("Ilya","Lagutenko"));
        System.out.println(person);

        //В данном случае мы отправляем на обработку новый объект с полями которые нам нужны,
        // и модифицируем наш объект на основании данных котоыре мы получили их новго объекта,
        // так как мы модифицируем обхект который находится по ссылке в переменной person, то результат изменится


        //P.S. очень тяжело писать неправильно.
    }

    public static int normalChangeValue(int value) {
        return value = 22;
    }
    //Overload
    public static int normalChangeValue(Integer value) {
        return value = 22;
    }
    //Overload
    public static void normalChangeValue (Integer[] nums){
        nums[0] = 1;
        nums[1] = 2;
    }

    public static void changeValue  (int value)
    {
        value = 22;
    }
    //Overload
    public static void changeValue (Integer value)
    {
        value = 22;
    }
    //Overload
    public static void changeValue (Integer[] nums){
        nums = new Integer[]{1, 2};
    }



}