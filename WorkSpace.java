public class WorkSpace {

    public static void main(String args[]) {
        int var1; //Macbook
        var1 = 7000;

        int var2; //Processor
        var2 = 3000;

        int var3; //GPU
        var3 = 4500;

        int var4; //Monitor
        var4 = 1600;

        int var5; //Keyboard
        var5 = 450;

        int var6; //Motherboard
        var6 = 900;

        int var7; //Water cool
        var7 = 800;

        int var8; //RAM
        var8 = 400;

        int var9; //SSD M2
        var9 = 600;

        int var10; //Power block
        var10 = 700;

        int var11; //System block
        var11 = 400;

        int var12; //Chair
        var12 = 800;

        int var13; //Table
        var13 = 600;


        int var14; //My Work Space
        int var15; //only PC
        int var16; //PC+M+ without Macbook

        var14 = var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12 + var13;
        var15 = var14 - var1 - var4 - var5 - var12 - var13;
        var16 = var15 + var4 + var5 + var12 + var13;

        System.out.println("Полная стоимость моего рабочего места=" + var14);
        System.out.println("Стоимость полностью сораного системного блока=" + var15);
        System.out.println("Стоимость полного рабочего места без Макбука=" + var16);


    }


}
