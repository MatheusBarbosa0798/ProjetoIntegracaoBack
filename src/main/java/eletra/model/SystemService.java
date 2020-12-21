package eletra.model;

import java.util.List;

public class SystemService {
 
    private static SystemDao systemDao;
 
    public SystemService() {
    	systemDao = new SystemDao();
    }
 
    public void persist(Products entity) {
        systemDao.openCurrentSessionwithTransaction();
        systemDao.persist(entity);
        systemDao.closeCurrentSessionwithTransaction();
    }
 
    public void update(Products entity) {
        systemDao.openCurrentSessionwithTransaction();
        systemDao.update(entity);
        systemDao.closeCurrentSessionwithTransaction();
    }
 
    public Products findById(int id) {
        systemDao.openCurrentSession();
        Products meter = systemDao.findById(id);
        systemDao.closeCurrentSession();
        return meter;
    }
 
    public void delete(int id) {
        systemDao.openCurrentSessionwithTransaction();
        Products meter = systemDao.findById(id);
        systemDao.delete(meter);
        systemDao.closeCurrentSessionwithTransaction();
    }
 
    public List<Products> findAll() {
        systemDao.openCurrentSession();
        List<Products> meters = systemDao.findAll();
        systemDao.closeCurrentSession();
        return meters;
    }
 
    public void deleteAll() {
        systemDao.openCurrentSessionwithTransaction();
        systemDao.deleteAll();
        systemDao.closeCurrentSessionwithTransaction();
    }
 
    public SystemDao systemDao() {
        return systemDao;
    }
}