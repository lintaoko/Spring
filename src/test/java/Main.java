import com.f00w.Domain;
import com.f00w.iocfactrory.ApplicationContext;
import com.f00w.iocfactrory.impl.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Domain domain= (Domain) applicationContext.getBean("domain");
        Domain domain2= (Domain) applicationContext.getBean("domain");
        System.out.println(domain);
        System.out.println(domain);
        System.out.println(domain2);
        System.out.println(domain.getName());
    }
}
