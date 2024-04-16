package vn.edu.fpt.lab.repositories;

import java.util.List;

public interface IRepository<T> {

    List<T> get() throws Exception;

    T get(String id) throws Exception;

    T post(T item) throws Exception;

    T put(T item) throws Exception;

    T delete(T item) throws Exception;
}
