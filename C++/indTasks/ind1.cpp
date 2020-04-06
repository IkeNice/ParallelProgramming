//// В процессах четного ранга (включая главный) ввести целое число, в процессах нечетного ранга
//// ввести вещественное число. В каждом процессе вывести удвоенное значение введенного числа.
//
//#include <iostream>
//#include "mpi.h"
//
//double getOddRank(int rank) {
//	return (double)rank / ((double)rank + 10);
//}
//
//using namespace std;
//
//int main(int argc, char** argv) {
//	int rank, size;
//	double d;
//	MPI_Init(&argc, &argv);
//	MPI_Comm_size(MPI_COMM_WORLD, &size);
//	MPI_Comm_rank(MPI_COMM_WORLD, &rank);
//	if (rank % 2 == 0) {
//		cout << "even rank " << rank << ": " << rank * 2 << endl;
//	}
//	else {
//		d = getOddRank(rank);
//		cout << "odd rank " << rank << ": " << d * 2 << endl;
//	}
//	MPI_Finalize();
//	return 0;
//}