package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface UserCheckService {

	boolean checkIfRealUser(User user) throws NumberFormatException, RemoteException;
}
