
class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor(97, 60, 40, 78, 80);
        Gryffindor hermioneGranger = new Gryffindor(100, 90, 10, 20, 22);
        Gryffindor ronWeasley = new Gryffindor(33, 2, 60, 10, 70);
        Slytherin dracoMalfoy = new Slytherin(80, 70, 60, 70, 30, 40, 10);
        Slytherin grahamMontague = new Slytherin(30, 30, 30, 30, 30, 30, 30);
        Hufflepuff zachariasSmith = new Hufflepuff(10, 20, 30, 22, 13);
        Hufflepuff cedricDiggory = new Hufflepuff(15, 18, 74, 65, 54);
        Hufflepuff justinFinchFletchley = new Hufflepuff(12, 15, 2, 7, 22);
        Ravenclaw choChang = new Ravenclaw(55, 44, 12, 14, 7, 1);
        Ravenclaw padmaPatil = new Ravenclaw(70, 70, 76, 74, 80, 84);
        Ravenclaw marcusBelby = new Ravenclaw(12, 13, 14, 15, 16, 17);
        System.out.println(harryPotter);
        System.out.println(zachariasSmith);
        System.out.println(dracoMalfoy);
        System.out.println(choChang);
        System.out.println("Гарри Поттер Лучший в Гриффиндоре? "+ harryPotter.best(hermioneGranger));
        System.out.println("Гермиона Грейнжер Лучшая в Гриффиндоре? "+ hermioneGranger.best(ronWeasley));
        System.out.println("Драко Малфой Лучший в Слизерине? " + dracoMalfoy.best(grahamMontague));
        System.out.println("Седрик Диггори Лучший в Пуффендуе? " + cedricDiggory.best(justinFinchFletchley));
        System.out.println("Падма Патил Лучшая в Когтевране? " + padmaPatil.best(marcusBelby));
        System.out.println("Гарри поттер лучший в силе и трансгрессии? " + harryPotter.superUltraBest(padmaPatil));
        System.out.println("Гермиона лучше в силе и трансгрессии чем Гарри? " + hermioneGranger.superUltraBest(harryPotter));

    }
}