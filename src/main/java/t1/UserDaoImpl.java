package t1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Project name(项目名称)：Spring基于注解的自动装配
 * Package(包名): t1
 * Class(类名): UserDaoImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/22
 * Time(创建时间)： 21:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */


@Repository
public class UserDaoImpl implements UserDao
{
    @Override
    public void print()
    {
        System.out.println("UserDaoImpl");
    }
}
