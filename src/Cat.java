public class Cat extends Animal {
    private final int maxDistRun = 200;
    private int count = 0;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int dist) {
        if (dist >= 0) {
            if (dist <= maxDistRun) {
                System.out.println(getName() + " пробежал " + dist + " метров.");
            } else {
                System.out.println(getName() + " не смог пробежать дистанцию " + dist + " метров!");
            }
        } else {
            System.out.println("Дистанция не может быть меньше нуля!");
        }
    }

    @Override
    public void swim(int dist) {
        System.out.println("Коты не умеют плавать!");
    }
}
