public class Methods {

public static int rearrangeReservation(int frDate[], int frSlot[], int []frMedicare, int currentDate, int ReservationNbr, int optional = 0) {
	int tempint;
	int pswapval = 0;
	int pswapidx = -1;
	int nswapval = 0;
	int nswapidx = -1;
	String tempstring;

	for (int idx = optional; idx < ReservationNbr; ++idx) {
		if ((currentDate - frDate[idx]) > pswapval) {
			pswapval = (currentDate - frDate[idx]);
			pswapidx = idx;
		}
		else if ((currentDate - frDate[idx]) == pswapval) {
			if (frSlot[idx] < frSlot[pswapidx]) {
				pswapidx = idx;
			}
		}

		if ((currentDate - frDate[idx]) < nswapval) {
			nswapval = (currentDate - frDate[idx]);
			nswapidx = idx;
		}
		else if ((currentDate - frDate[idx]) == nswapval) {
			if (frSlot[idx] > frSlot[nswapidx]) {
				nswapidx = idx;
			}
		}
	}

	if (pswapidx != ReservationNbr - 1 && pswapidx != -1) {
		tempint = frDate[ReservationNbr - 1];
		frDate[ReservationNbr - 1] = frDate[pswapidx];
		frDate[pswapidx] = tempint;

		tempint = frSlot[ReservationNbr - 1];
		frSlot[ReservationNbr - 1] = frSlot[pswapidx];
		frSlot[pswapidx] = tempint;

		tempstring = frMedicare[ReservationNbr - 1];
		frMedicare[ReservationNbr - 1] = frMedicare[pswapidx];
		frMedicare[pswapidx] = tempstring;
	}

	if (nswapidx != optional && nswapidx != -1) {
		tempint = frDate[optional];
		frDate[optional] = frDate[nswapidx];
		frDate[nswapidx] = tempint;

		tempint = frSlot[optional];
		frSlot[optional] = frSlot[nswapidx];
		frSlot[nswapidx] = tempint;

		tempstring = frMedicare[optional];
		frMedicare[optional] = frMedicare[nswapidx];
		frMedicare[nswapidx] = tempstring;
	}

	if (ReservationNbr == optional) {
		for (int idx = 0; idx < (optional + 1) / 2; ++idx) {
			tempint = frDate[optional - idx];
			frDate[optional - idx] = frDate[idx];
			frDate[idx] = tempint;

			tempint = frSlot[optional - idx];
			frSlot[optional - idx] = frSlot[idx];
			frSlot[idx] = tempint;

			tempstring = frMedicare[optional - idx];
			frMedicare[optional - idx] = frMedicare[idx];
			frMedicare[idx] = tempstring;
		}

		return optional+1;
	}
	else {
		if (nswapidx == -1) {
			return rearrangeReservation(frDate, frSlot, frMedicare, currentDate, ReservationNbr - 1, optional);
		}
		else {
			return rearrangeReservation(frDate, frSlot, frMedicare, currentDate, ReservationNbr - 1, optional+1);
		}
	}
}

void displayReservations(int frDate[], int frSlot[], int frMedicare[], int activeNbr) {
	for (int idx = 0; idx < activeNbr; ++idx) {
		System.out.print(frDate[idx]);
		System.out.print(" | ");
		System.out.print(frSlot[idx]);
		System.out.print(" | ");
		System.out.print(frMedicare[idx]);
		System.out.print("\n");
	}
	System.out.print("\n");
}

void displayPastReservationsIncreasingOrder(int frDate[], int frSlot[], int frMedicare[], int inactiveStart, int ReservationNbr) {
	int idx = ReservationNbr - 1;
	while (idx >= inactiveStart) {
		System.out.print(frDate[idx]);
		System.out.print(" | ");
		System.out.print(frSlot[idx]);
		System.out.print(" | ");
		System.out.print(frMedicare[idx]);
		System.out.print("\n");
		--idx;
	}
	System.out.print("\n");
}

void displayPastReservationsDecreasingOrder(int frDate[], int frSlot[], int frMedicare[], int inactiveStart, int ReservationNbr) {
	for (int idx = inactiveStart; idx < ReservationNbr; ++idx) {
		System.out.print(frDate[idx]);
		System.out.print(" | ");
		System.out.print(frSlot[idx]);
		System.out.print(" | ");
		System.out.print(frMedicare[idx]);
		System.out.print("\n");
	}
	System.out.print("\n");
}

}

public class Main {

	int activeReservaions = 0;
	int inactiveReservations = 0;
	int Reservations = 10;
	int today = 20220101;
	int rDate[] = {20211125, 20220308, 20211202, 20220201, 20211202, 20211203, 20220125, 20220114, 20220201, 20220201};
	int rSlot[] = {25, 10, 7, 15, 3, 40, 36, 11, 10, 15};
	String rMedicare[] = {"CCC11", "FFF22", "DDD77", "HHH33", "KKK77", "AAA66", "JJJ44", "EEE99", "GGG55", "BBB66"};

	activeReservaions = rearrangeReservation(rDate, rSlot, rMedicare, today, Reservations);

	displayReservations(rDate, rSlot, rMedicare, activeReservaions);
	
	displayPastReservationsIncreasingOrder(rDate, rSlot, rMedicare, activeReservaions, Reservations);
	displayPastReservationsDecreasingOrder(rDate, rSlot, rMedicare, activeReservaions, Reservations);
}