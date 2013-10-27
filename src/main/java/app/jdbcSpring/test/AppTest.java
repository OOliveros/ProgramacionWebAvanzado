package app.jdbcSpring.test;

import app.jdbcSpring.dao.ServicioDAO;
import app.jdbcSpring.model.Servicio;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    public static void main(String[] args) {
         AppTest.saveServicio();
  //      AppTest.getAll();
        // AppTest.getServicio(new Servicio(13));
    }
    public static void saveServicio(){
    ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_database.xml");
    ServicioDAO servicioDAO = (ServicioDAO) context.getBean("servicioDAO");
            Servicio servicio = new Servicio();
        servicio.setDescripcion("Alquiler");
        servicio.setCostoHora(345);
        
        
        servicioDAO.save(servicio);
    }
    


    

}
