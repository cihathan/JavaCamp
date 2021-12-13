package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface UserService {

	void add(User user) throws NumberFormatException, RemoteException;

	void update(User user);

	void delete(User user);
}
