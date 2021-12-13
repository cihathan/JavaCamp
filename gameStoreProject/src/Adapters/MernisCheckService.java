package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckService implements UserCheckService {

	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

	@Override
	public boolean checkIfRealUser(User user) throws NumberFormatException, RemoteException {
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(user.getNationalityID()),
				user.getUserFirstName().toUpperCase(), user.getUserLastName().toUpperCase(), user.getBirthYear());
		if (result == true) {
			System.out.println("Ba�ar�l�");
			return true;
		} else {
			System.out.println("Ba�ar�s�z");
			return false;
		}
	}

}
