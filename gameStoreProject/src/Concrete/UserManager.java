package Concrete;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) throws NumberFormatException, RemoteException {
		if (userCheckService.checkIfRealUser(user)) {
			System.out.println(user.getUserFirstName() + " " + user.getUserLastName() + " adl� oyuncu eklendi.");
		} else {
			System.out.println("Hatal� kullan�c� giri�i");
			delete(user);
		}

	}

	@Override
	public void update(User user) {
		System.out.println(
				user.getUserFirstName() + " " + user.getUserLastName() + " adl� oyuncunun bilgileri g�ncellendi.");

	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserFirstName() + " " + user.getUserLastName() + " adl� oyuncu silindi.");

	}

}
