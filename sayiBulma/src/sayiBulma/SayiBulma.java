package sayiBulma;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class SayiBulma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rast = new Random();
		int rastSayi = rast.nextInt(5);

		System.out.println("Say� gir ");
		int sayiTahmin = input.nextInt();

		while (rastSayi != sayiTahmin) {

			System.out.println("Yanl�� tahmin");

			System.out.println("Tekrar say� gir ");

			int tekrarSayiTahmin = input.nextInt();

			if (tekrarSayiTahmin == rastSayi) {

				System.out.println("Do�ru tahmin");
				break;
			}

		}

		input.close();
	}

}
