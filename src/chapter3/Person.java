package chapter3;

public class Person {
    private String name;
    private String friends;
    private int friendCount;

    public Person(String name) {
        this.name = name;
        this.friends = "";
    }

    public void befriend(Person p) {
        this.friends += p.name + " ";
        p.friends += this.name + " ";
        this.friendCount++;
        p.friendCount++;
    }

    public void unfriend(Person p) {
        String str = "";
        String tmp = "";
        for (int i = 0; i < this.friends.length(); i++) {
            if (this.friends.charAt(i) != ' ')
                str += this.friends.charAt(i);
            else {
                if (!str.equals(p.name))
                    tmp += str + " ";
                str = "";
            }
        }
        this.friends = tmp;
        tmp = "";
        str = "";
        for (int i = 0; i < p.friends.length(); i++) {
            if (p.friends.charAt(i) != ' ')
                str += p.friends.charAt(i);
            else {
                if (!str.equals(this.name))
                    tmp += str + " ";
                str = "";
            }
        }
        p.friends = tmp;
        this.friendCount--;
        p.friendCount--;
    }

    public int getFriendCount() {
        return friendCount;
    }

    public String getFriendNames() {
        if (friends.length() > 0)
            return "friends: '" + friends.substring(0, friends.length() - 1) + '\'';
        else
            return "no friends";
    }

    @Override
    public String toString() {
        return "chapter3.Person{" +
                "name= '" + name + '\'' + ", " +
                this.getFriendNames() +
                ", friendCount= " + friendCount +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ivan");
        Person p2 = new Person("Alexander");
        Person p3 = new Person("Artem");

        p1.befriend(p2);
        p1.befriend(p3);
        System.out.println(p1.name + " has " + p1.getFriendNames());
        System.out.println(p2.name + " has " + p2.getFriendNames());
        System.out.println(p3.name + " has " + p3.getFriendNames());
        System.out.println(p1);
        System.out.println("********************");

        p1.unfriend(p2);
        System.out.println(p1.name + " has " + p1.getFriendNames());
        System.out.println(p2.name + " has " + p2.getFriendNames());
        System.out.println(p3.name + " has " + p3.getFriendNames());




    }



}
