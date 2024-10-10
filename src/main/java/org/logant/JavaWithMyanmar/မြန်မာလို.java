package org.logant.JavaWithMyanmar;

public class မြန်မာလို {
    // public static void main(String[] args) {
    //     လူကလေး အောင်ချေ = new လူကလေး();
    //     အောင်ချေ.နာမေထည့်ရန်("အောင်ချေ");
    //     အောင်ချေ.အသက်ထည့်ရန်(26);
    //     System.out.println("အမည် "+ အောင်ချေ.နာမေရယူရန်() + " အသက် "+ အောင်ချေ.အသက်ရယူရန်() + " နှစ်");
    // }
}
class လူကလေး {
    private String နာမေ;
    private int အသက်;
    public လူကလေး(){}

    public String နာမေရယူရန်() {
        return နာမေ;
    }

    public void နာမေထည့်ရန်(String နာမေ) {
        this.နာမေ = နာမေ;
    }

    public int အသက်ရယူရန်() {
        return အသက်;
    }

    public void အသက်ထည့်ရန်(int အသက်) {
        this.အသက် = အသက်;
    }
}