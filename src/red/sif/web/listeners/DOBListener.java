package red.sif.web.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by XIAN. Yingda on 2017/6/25 17:47.
 */
@WebListener()
public class DOBListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("我来了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("我挂了");
    }
}
