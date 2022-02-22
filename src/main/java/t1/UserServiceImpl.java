package t1;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Project name(项目名称)：Spring基于注解的自动装配
 * Package(包名): t1
 * Class(类名): UserServiceImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/22
 * Time(创建时间)： 21:32
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Service
public class UserServiceImpl implements UserService
{
    @Resource
    private UserDao userDao;

    public UserDao getUserDao()
    {
        return userDao;
    }

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }

    @Override
    public void out()
    {
        userDao.print();
        System.out.println("UserServiceImpl");
    }
}
