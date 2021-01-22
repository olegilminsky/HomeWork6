public class Dog extends Animal {
    private final int maxDistRun = 500;
    private final int maxDistSwim = 10;
    private int count = 0;

    public Dog(String name) {
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
        if (dist >= 0) {
            if (dist < maxDistSwim) {
                System.out.println(getName() + " проплыл " + dist + " метров.");
            } else {
                System.out.println(getName() + " не смог проплыть дистанцию " + dist + " метров!");
            }
        } else {
            System.out.println("Дистанция не может быть меньше нуля!");
        }
    }
}
