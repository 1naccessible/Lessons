package defaultInterfaceDemo;

public interface MyIF {
    //Обьявление обычного метода интерфейса который не включает
    //определение реализации по умолчанию
    int getUserID();

    //Определение метода по умолчанию, включая его реализацию
   default int getAdminID(){
        return 1;
   }

    //Обьявление статического метода интерфейса
    static byte getUniversalId(){
       return 0;
    }
}
