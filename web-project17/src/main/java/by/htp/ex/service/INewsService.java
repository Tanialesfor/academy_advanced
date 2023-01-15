package by.htp.ex.service;

import java.util.List;

import by.htp.ex.bean.News;

public interface INewsService {
  void save();
  
  
  List<News> latestList(int count)  throws ServiceException;
  List<News> list()  throws ServiceException;
  News findById(int id) throws ServiceException;
  public void update(News news) throws ServiceException;
  public void delete(String [] idNews) throws ServiceException;
  public void find() throws ServiceException ;
  
}
