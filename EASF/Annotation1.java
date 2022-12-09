package EASF;

import java.beans.Transient;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.annotation.*;

@MyAnn("some")
public class Annotation1 {
    @Deprecated
    int i;


    @Deprecated
    Annotation1() {
    }

    @Transient
    @Deprecated
    public void method(@Deprecated int p) {
        @MyAnn("str")
        @Deprecated
        int j = i; // присвоил переменной j значение параметра аннотации і
    }
}

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.LOCAL_VARIABLE})
@interface MyAnn {
    enum Status {UNCONFIRMED, CONFIRMED, FIXED}

    boolean run() default true;

    int i() default 1;
    // С помощью ключевого слова default можно задать значение по умолчанию
    // которое можно переопределить при применении анотации,
    // но так же этого можно не делать, если везде установленны значения по умолчанию
    // и они нас полностью устраивают

    String value() default "some";
    // Данный параметр может переопределяться при применении анотации без
    // явного присваивания значения пераметру - MyAnn("some"),
    // но только когда нет необходимости после присваивания данному параметру значения
    // переопределять другие параметрыMyAnn(value = "some", i = 5)

    String str() default "some text";

    Status status() default Status.CONFIRMED;
    String[] strBuff()default {"some", "text"};
}
