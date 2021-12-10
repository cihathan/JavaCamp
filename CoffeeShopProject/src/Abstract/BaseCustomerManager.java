package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public void save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("Veri tabanưna kaydedildi : " + customer.getFirstName());

	}

}
