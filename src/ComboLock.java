public class ComboLock {
    private int secret1;
    private int secret2;
    private int secret3;
    private int status;
    private int current;

    public ComboLock(int secret1, int secret2, int secret3) {
        if (secret1 > 0 && secret1 < 39 && secret2 > 0 && secret2 < 39 && secret3 > 0 && secret3 < 39) {
            this.secret1 = secret1;
            this.secret2 = secret2;
            this.secret3 = secret3;
            this.status = 0;
            this.current = 0;
        }
    }

    public void reset() {
        status = 0;
        current = 0;
        System.out.println("Lock is reset");
    }

    public void turnLeft(int ticks) {
        current -= ticks;
        if (current < 0)
            current += 40;
        if (status == 1 && current == secret2)
            status++;
        else status = 0;
    }

    public void turnRight(int ticks) {
        current += ticks;
        if (current > 39)
            current -= 40;
        if (status == 0 && current == secret1)
            status++;
        else if (status == 2 && current == secret3)
            status++;
        else status = 0;
    }

    public boolean open() {
        if (status == 3) {
            status++;
            return true;
        } else {
            status = 0;
            return false;
        }
    }

    @Override
    public String toString() {
        return "Password: " + secret1 +
                " " + secret2 +
                " " + secret3;
    }

    public static void main(String[] args) {
        ComboLock cl = new ComboLock(2,34,1);
        System.out.println(cl);
        cl.turnRight(2);
        cl.turnLeft(8);
        cl.turnRight(8);
        System.out.println("Lock is open? " + cl.open());
        cl.reset();
        cl.turnRight(2);
        cl.turnLeft(8);
        cl.turnRight(7);
        System.out.println("Lock is open? " + cl.open());
    }
}
