package red.sif.test;

import org.junit.jupiter.api.Test;
import red.sif.utils.MailUtil;

import javax.mail.MessagingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by XIAN. Yingda on 2017/6/25 17:53.
 */

public class Test01 {
    @Test
    public void test01() throws ParseException {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("WTF");
            }
        }, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-06-25 18:01:10"), 1000);
    }

    @Test
    public void test02() throws ParseException {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("cao");
            }
        }, 1000, 1000);
    }


    @Test
    public void test03() throws MessagingException {
        MailUtil.sendMail("326666969@qq.com", "你的账号中奖啦");
    }
}
