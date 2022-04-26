package dao;

public interface DAOInterface <T, ID> {

	public void create(T element);
	
	public T get(ID id);
	
	public void update(T element);
	
	public void delete(T element);
}
