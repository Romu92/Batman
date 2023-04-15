package it.aulab;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.aulab.model.Batman;
import it.aulab.model.Batmobile;
import it.aulab.model.Hook;
import it.aulab.model.Mask;
import it.aulab.model.Suite;



@Configuration
@ComponentScan("it.aulab")
public class Appconfig {
    @Bean(name ="batmanBlack")
    // @Scope("singleton")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    // ci sono due modi per definire lo scope
    // cosi affermo che l'oggetto deve essere singleton quindi uno per tutto il context
    public Batman getBatmanBlack() {
        Batman b=new Batman();
        // Setter injection -> uso i setter
        b.setBatmobile(getBatmobile());
        b.setSuite(getSuite());
        return b;
    }
    @Bean(name ="batmanWhite")

    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public Batman getBatmanWhite() {
        // constructor injection -> uso il costruttore
        return new Batman(getSuite(),getBatmobile());
    }
    @Bean(name ="batmobile")
    // @Scope("prototype")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    // inserendo lo scope prototype ogni volta che andrò a creare una nuova batmobile me ne creerà una nuova 
    public Batmobile getBatmobile(){
        return new Batmobile("#0F0F0F");
    }
    @Bean(name ="hook")
    public Hook getHook(){
        return new Hook(10);
    }
    @Bean(name ="mask")
    public Mask getMask(){
        return new Mask("#000000");
    }
    @Bean(name ="suite")
    public Suite getSuite(){
        return new Suite("#000000", getMask(), getHook());
    }
}
