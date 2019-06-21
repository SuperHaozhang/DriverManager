package com.cheer.dao.Imp;

import com.cheer.dao.SubjectMapper;
import com.cheer.pojo.Subject;
import com.cheer.pojo.User;
import com.cheer.pojo.Xueyuan;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SubjectMapperImp implements SubjectMapper {
    //声明日志对象
    private static final org.apache.log4j.Logger LOGGER = Logger.getLogger(SubjectMapperImp.class);
    @Override
    public int insert(Subject sub) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession session = null;
        int i=0;
        try {

            //1、获取SqlSessionFactory
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //2.获取Sqlsession对象
            session = sqlSessionFactory.openSession();
            SubjectMapper empMapper = session.getMapper(SubjectMapper.class);
            i=empMapper.insert(sub);
            session.commit();
            LOGGER.info(i);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (session != null) {
                    session.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public List<Subject> getSubjectList() {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession session = null;
        List<Subject> subjectList=null;
        try {

            //1、获取SqlSessionFactory
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //2.获取Sqlsession对象
            session = sqlSessionFactory.openSession();
            SubjectMapper empMapper = session.getMapper(SubjectMapper.class);
            subjectList=empMapper.getSubjectList();
            //session.commit();
            LOGGER.info(subjectList);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (session != null) {
                    session.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return subjectList;
    }

    @Override
    public User checkLogin(String username) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession session = null;
        User user=null;
        try {

            //1、获取SqlSessionFactory
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //2.获取Sqlsession对象
            session = sqlSessionFactory.openSession();
            SubjectMapper empMapper = session.getMapper(SubjectMapper.class);
            user=empMapper.checkLogin(username);
            session.commit();
            LOGGER.info(user);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (session != null) {
                    session.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return user;
    }

    @Override
    public Xueyuan getXueYuan(String name,String pwd) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession session = null;
        Xueyuan x=null;
        try {

            //1、获取SqlSessionFactory
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //2.获取Sqlsession对象
            session = sqlSessionFactory.openSession();
            SubjectMapper empMapper = session.getMapper(SubjectMapper.class);
            x=empMapper.getXueYuan(name,pwd);
            //session.commit();
            LOGGER.info(x);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (session != null) {
                    session.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return x;
    }

    @Override
    public Xueyuan getOne(int id) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession session = null;
        Xueyuan x=null;
        try {

            //1、获取SqlSessionFactory
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //2.获取Sqlsession对象
            session = sqlSessionFactory.openSession();
            SubjectMapper empMapper = session.getMapper(SubjectMapper.class);
            x=empMapper.getOne(id);
            //session.commit();
            LOGGER.info(x);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (session != null) {
                    session.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return x;
    }

    @Override
    public List<String> getKey() {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession session = null;
        List<String> x=null;
        try {

            //1、获取SqlSessionFactory
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //2.获取Sqlsession对象
            session = sqlSessionFactory.openSession();
            SubjectMapper empMapper = session.getMapper(SubjectMapper.class);
            x=empMapper.getKey();

            LOGGER.info(x);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (session != null) {
                    session.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return x;
    }

    @Override
    public int update(Xueyuan x) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession session = null;
        int i=0;
        try {

            //1、获取SqlSessionFactory
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //2.获取Sqlsession对象
            session = sqlSessionFactory.openSession();
            SubjectMapper empMapper = session.getMapper(SubjectMapper.class);
            i=empMapper.update(x);
            session.commit();
            LOGGER.info(x);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (session != null) {
                    session.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }
}
