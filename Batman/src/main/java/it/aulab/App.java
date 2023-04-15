package it.aulab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.aulab.model.Batman;
import it.aulab.model.Batmobile;
import it.aulab.service.BatmanService;

/**
 * Hello world!
 *
 */
public class App {
    

    public static void main( String[] args ) {
        ApplicationContext context =new AnnotationConfigApplicationContext(Appconfig.class);
    //      Batman batman=context.getBean("batman",Batman.class);
    //      Batmobile batmobile=context.getBean("batmobile",Batmobile.class);

    //     //  all'interno della parentesi va messo il nome del bean richiamato più il tipo  della classe richiamata

    //      System.out.println(batman);

    //     // il framework spring di base funziona come un singleton quindi se vado a richaimare altri oggetti come ad esempio la batmobile oltre al batman non me ne creerà una seconda in quanto già creata in batman
    //     System.out.println(batmobile); 
    //     System.out.println(batman.getBatmobile());
    //     // anche rilanciando con get mi stamperà nel terminale solo il codice di batmobile ma me ne creerà una sola quella del primo batman
    BatmanService service = context.getBean("batmanService", BatmanService.class);
    // avendo messo il component nel batmanservice posso richiamare la costruzione dell'oggetto direttamente da li senza passare dai model


        service.attack();

    }

   
}
