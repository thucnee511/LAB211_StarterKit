package vn.edu.fpt.lab.repositories;

@FunctionalInterface
public interface IITem<T> {

    T parseData(String data);
}
