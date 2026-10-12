public class Main {
    public static void main(String[] args) {
        Substance s = new Substance("Water", 1000.0, 0.0);

        System.out.println("Проверяем class Substance:");
        System.out.println("Плотность в г/см3: " + s.densityInGramsPerCm3());
        System.out.println("Масса 2 литров: " + s.mass(2.5));
        System.out.println("Затвердеет при температуре -10 градусов?");
        System.out.println(s.isSolidAt(-10.0));

        s.setName("Ice");
        s.setMeltingPoint(0.0);

        System.out.println("Новое имя: " + s.getName() + ", новая температура кипения: " + s.getMeltingPoint());
        System.out.println();



        Water w = new Water(1000.0, 0.0, "liquid", false, 3.7);
        System.out.println("Работаем с class Water:");

        w.addWater(2.0);
        System.out.println("Добавим к исходной воде еще 2 литра: " + w.getVolume());
        
        w.freeze();
        System.out.println("После заморожения вода: " + w.getAggregateState());

        w.boil();
        System.out.println("Уже лед после кипения: " + w.getAggregateState());

        w.condense();
        System.out.println("Теперь пар после конденсации: " + w.getAggregateState());

        System.out.println(w.getVolume());
        System.out.println();



        Cola c = new Cola("Pepsi", 11.4, 77.1, 1.5);
        System.out.println("Работаем с class Cola");

        System.out.println("Бренд нашей колы: " + c.getBrand());
        c.setBrand("Coca-Cola");
        System.out.println("Новый бренд колы: " + c.getBrand());

        System.out.println("Газированная ли изначально кола?");
        System.out.println(c.isCarbonated());
        c.openBottle();
        System.out.println("Останется ли кола газированной после открытия банки и выпуска газов?");
        System.out.println(c.isCarbonated());

        System.out.println("Наша кола диетическая?");
        System.out.println(c.isDiet());

        System.out.println("Обьем колы - " + c.getVolume() + ", кол-во сахара - " + c.getSugarAmount() + ", калории - " + c.getCalories());
        c.addIce(500.0);
        System.out.println("Что изменилось после добавления льда:");
        System.out.println("Обьем: " + c.getVolume());
        System.out.println("Кол-во сахара: " + c.getSugarAmount());
        System.out.println("Калории: " + c.getCalories());

        System.out.println("Если добавить очень много льда, то станет ли кола диетической?");
        c.addIce(100000.0);
        System.out.println("Кол-во сахара: " + c.getSugarAmount());
        System.out.println(c.isDiet());
    }
}
