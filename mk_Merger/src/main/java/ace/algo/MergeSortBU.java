package ace.algo;

import java.util.Arrays;

/**
 * 
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 * 
 * @ClassName: MergeSort.java
 * @Description: ����Ĺ������� �鲢���� �õ����Ϲ鲢
 * @version: v1.0.0
 * @author: admin
 * @date: 2019��4��2�� ����3:41:40
 *
 *        Modification History: Date Author Version Description
 *        ---------------------------------------------------------* 2019��4��2��
 *        admin v1.0.0 �޸�ԭ��
 */
public class MergeSortBU {

	public static void sort(Comparable[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i += 16) {
			InsertionSort.sort(arr, i, Math.min(i + 15, n - 1));
		}

		for (int sz = 16; sz < n; sz += sz) {
			for (int i = 0; i < n - sz; i += sz + sz) {
				if (arr[i + sz - 1].compareTo(arr[i + sz]) > 0) {
					merge(arr, i, i + sz - 1, Math.min(i + sz + sz - 1, n - 1));
				}
			}
		}

	}

	// ��arr[l...mid]��arr[mid+1...r]�����ֽ��й鲢
	private static void merge(Comparable[] arr, int l, int mid, int r) {

		Comparable[] aux = Arrays.copyOfRange(arr, l, r + 1);
		int i = l, j = mid + 1;
		for (int k = l; k <= r; k++) {
			if (i > mid) { // �����벿��Ԫ���Ѿ�ȫ���������
				arr[k] = aux[j - l];
				j++;
			} else if (j > r) { // ����Ұ벿��Ԫ���Ѿ�ȫ���������
				arr[k] = aux[i - l];
				i++;
			} else if (aux[i - l].compareTo(aux[j - l]) < 0) { // ��벿����ָԪ�� < �Ұ벿����ָԪ��
				arr[k] = aux[i - l];
				i++;
			} else { // ��벿����ָԪ�� >= �Ұ벿����ָԪ��
				arr[k] = aux[j - l];
				j++;
			}
		}

	}

}
