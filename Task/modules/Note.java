package Task.modules;

public class Note {

    private String mark;
    private int ram;
    private int hdAmount;
    private String os;
    private String color;

    public Note(String mark,int ram, int hdAmount, String os, String color){
        this.mark = mark;
        this.ram = ram;
        this.hdAmount = hdAmount;
        this.os = os;
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public int getRam() {
        return ram;
    }

    public int getHdAmount() {
        return hdAmount;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void showСharacteristics(){
        System.out.println();
        System.out.println("           ======================= " + "Модель: " + this.mark + " ======================= ");
        System.out.print("Оперативная память: " + this.ram + " | ");
        System.out.print("Объем жесткого диска: " + this.hdAmount + " | ");
        System.out.print("Операционная система: "  + this.os + " | ");
        System.out.print("Цвет: " + this.color);
        System.out.println();
    }
    
}