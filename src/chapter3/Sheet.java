package chapter3;

public class Sheet {

    private int name;
    private int height;
    private int widht;

    public Sheet() {
        this.widht = 1189;
        this.height = 841;
        this.name = 0;
    }

    public void cutInHalf() {
        int tmp = this.widht;
        this.widht = this.height;
        this.height = tmp / 2;
        this.name++;
    }

    @Override
    public String toString() {
        return "chapter3.Sheet{" +
                "name= A" + name +
                ", height= " + height +
                ", widht= " + widht +
                '}';
    }

    public static void main(String[] args) {
        Sheet sheet = new Sheet();
        sheet.cutInHalf();
        System.out.println(sheet);
        sheet.cutInHalf();
        System.out.println(sheet);
        sheet.cutInHalf();
        System.out.println(sheet);
        sheet.cutInHalf();
        System.out.println(sheet);
        sheet.cutInHalf();
        System.out.println(sheet);
    }











}
