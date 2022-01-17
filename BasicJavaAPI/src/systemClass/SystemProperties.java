package systemClass;

import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class SystemProperties {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("userName");
        String userHome = System.getProperty("UserHome");

        System.out.println("운영체제 이름: " + osName);
        System.out.println("사용자 이름: " + userName);
        System.out.println("사용자 홈디렉토리: " + userHome);

        System.out.println("---------------------------------------");
        System.out.println("  [  Key  ] Value");
        System.out.println("---------------------------------------");

        Properties props = System.getProperties();
        Set keys = props.keySet();
        for(Object objKey : keys) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.println("[ " + key + " ] " + value);
        }


    }
}
