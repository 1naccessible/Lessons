public class FinalMeth {
    final void meth(){
        System.out.println("This method is final");
    }
}
class FinalMeth2 extends FinalMeth{
    /** void meth() { Недопустимо! Этот метод не может быть переопределен
        System.out.println("Недопустимо!!");
    }

     */
}
