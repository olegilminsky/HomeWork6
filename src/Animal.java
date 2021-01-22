public abstract class Animal {
    private String name;
    private int maxDistRun;
    private int maxDistSwim;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int maxDistRun, int maxDistSwim) {
        this.name = name;
        this.maxDistRun = maxDistRun;
        this.maxDistSwim = maxDistSwim;
    }

    public String getName() {
        return name;
    }

    public int getMaxDistRun() {
        return maxDistRun;
    }

    public int getMaxDistSwim() {
        return maxDistSwim;
    }

    public void run(int dist) {
        if (dist >= 0) {
            if (dist < getMaxDistRun()) {
                System.out.println("Животное пробежало " + dist + " метров.");
            } else {
                System.out.println("Животное не смогло пробежать дистанцию " + dist + " метров.");
            }
        } else {
            System.out.println("Дистанция не может быть меньше нуля!");
        }
    }

    public void swim(int dist) {
        if (dist >= 0) {
            if (dist < getMaxDistSwim()) {
                System.out.println("Животное проплыло " + dist + " метров.");
            } else {
                System.out.println("Животное не смогло проплыть дистанцию " + dist + " метров.");
            }
        } else {
            System.out.println("Дистанция не может быть меньше нуля!");
        }
    }
}
