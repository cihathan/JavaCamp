package Abstract;

public interface MyCustomService<T> {

    void add(T t);

    void update(T t);

    void delete(T t);
}
