// ParallelProgramming.cpp : Этот файл содержит функцию "main". Здесь начинается и заканчивается выполнение программы.
//

#include <iostream>
#include <ctime>

const long LEN = 100000;
const long RAZM = 10;

using namespace std;

void vectByNum(int num, long vect[LEN]) {
	long resVectByNum[LEN];
	for (int i = 0; i < LEN; ++i) {
		resVectByNum[i] = vect[i] * num;
		//cout << "after: " << resVectByNum[i] << endl;
	}
}

void vectByVect(long inVect1[LEN], long inVect2[LEN]) {
	long resVectByVect = 0;
	for (int i = 0; i < LEN; ++i) {
		resVectByVect += inVect1[i] * inVect2[i];
	}
}

void matrByNum(int num, long inMatr[RAZM][RAZM]) {
	long resMatrByNum[RAZM][RAZM];
	for (int i = 0; i < RAZM; ++i) {
		for (int j = 0; j < RAZM; ++j) {
			resMatrByNum[i][j] = inMatr[i][j] * num;
		}
	}
}

void matrByVect(long inVect[RAZM], long inMatr[RAZM][RAZM]) {
	long resMatrByVect[RAZM];
	for (int i = 0; i < RAZM; ++i) {
		for (int j = 0; j < RAZM; ++j) {
			resMatrByVect[i] = inMatr[j][i] * inVect[j];
		}
	}
}

void matrByMatr(long inMatr1[RAZM][RAZM], long inMatr2[RAZM][RAZM]) {
	long resMatrByMatr[RAZM][RAZM];
	for (int i = 0; i < RAZM; ++i) {
		for (int j = 0; j < RAZM; ++j) {
			for (int k = 0; k < RAZM; ++k) {
				resMatrByMatr[i][j] += inMatr1[i][k] * inMatr2[k][j];
			}
		}
	}
}

int main() {
	int n = 23;
	long vect[LEN];
	for (int i = 0; i < LEN; ++i) {
		vect[i] = rand() % 1000;
	}

	long vect1[LEN], vect2[LEN];
	for (int i = 0; i < LEN; ++i) {
		vect1[i] = rand() % 1000;
		vect2[i] = rand() % 1000;
	}

	long matr[RAZM][RAZM], nn = 57;
	for (int i = 0; i < RAZM; ++i) {
		for (int j = 0; j < RAZM; ++j) {
			matr[i][j] = rand() % 1000;
		}
	}

	long matr1[RAZM][RAZM], matr2[RAZM][RAZM];
	for (int i = 0; i < RAZM; ++i) {
		for (int j = 0; j < RAZM; ++j) {
			matr1[i][j] = rand() % 1000;
			matr2[i][j] = rand() % 1000;
		}
	}

	unsigned int start_time = clock();
	vectByNum(n, vect);
	//vectByVect(vect1, vect2);
	//matrByNum(nn, matr);
	//matrByVect(vect, matr);
	//matrByMatr(matr1, matr2);
	unsigned int end_time = clock();
	cout << "time: " << end_time - start_time << " milliseconds";
}

// Запуск программы: CTRL+F5 или меню "Отладка" > "Запуск без отладки"
// Отладка программы: F5 или меню "Отладка" > "Запустить отладку"

// Советы по началу работы 
//   1. В окне обозревателя решений можно добавлять файлы и управлять ими.
//   2. В окне Team Explorer можно подключиться к системе управления версиями.
//   3. В окне "Выходные данные" можно просматривать выходные данные сборки и другие сообщения.
//   4. В окне "Список ошибок" можно просматривать ошибки.
//   5. Последовательно выберите пункты меню "Проект" > "Добавить новый элемент", чтобы создать файлы кода, или "Проект" > "Добавить существующий элемент", чтобы добавить в проект существующие файлы кода.
//   6. Чтобы снова открыть этот проект позже, выберите пункты меню "Файл" > "Открыть" > "Проект" и выберите SLN-файл.
