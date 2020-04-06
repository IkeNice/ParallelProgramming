// �  �������  ��������  ���  �����  ������������  �����;  
// ����������  �����  �����  ���������� ����������� ���������.
// � ������� ������� MPI_Send ��������� �� ������ ����� � ������ �� ����������� ���������
// (������ ����� � ������� 1, ������ �� ������� 2, � �.�.) � ������� � ����������� ��������� ���������� �����.

#include <iostream>
#include "mpi.h"
#include <vector>

using namespace std;

int main(int argc, char** argv) {
	int rank, size;
	double d;
	MPI_Init(&argc, &argv);
	MPI_Comm_size(MPI_COMM_WORLD, &size);
	MPI_Comm_rank(MPI_COMM_WORLD, &rank);
	MPI_Status status;
	int sentNumbers, receivedNumbers;

	if (rank == 0) {
		for (int i = 0; i < size - 1; ++i) {
			sentNumbers = (i + 1) * 10;
			MPI_Send(&sentNumbers, 1, MPI_INT, i + 1, 0, MPI_COMM_WORLD);
		}
	} else {
		MPI_Recv(&receivedNumbers, 1, MPI_INT, MPI_ANY_SOURCE, MPI_ANY_TAG, MPI_COMM_WORLD, &status);
		cout << "Rank " << rank << " -- Received : " << receivedNumbers << endl;
	}
	MPI_Finalize();
}