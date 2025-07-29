package baekjoon;

import java.io.*;

public class Baekjoon_24060 {

    static int K;
    static int count = 0;
    static int result = -1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        int N = Integer.parseInt(a[0]);
        K = Integer.parseInt(a[1]);
        int[] array = new int[N];

        String[] b = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(b[i]);
        }

        mergeSort(array, 0, N - 1);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) { // 배열의 크기가 1 이상일 때만 정렬 -> left == right 면 요소가 하나이기 때문
            int mid = (left + right) / 2; // 범위를 반으로 나눔

            mergeSort(arr, left, mid); // 왼쪽 절반 정렬
            mergeSort(arr, mid + 1, right); // 오른쪽 절반 정렬

            merge(arr, left, mid, right); // 병합
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left; // 첫 번째 부분 배열의 시작
        int j = mid + 1; // 두 번째 부분 배열의 시작
        int k = 0; // 임시 배열 인덱스

        // 두 배열을 비교해서 작은 것을 temp 배열에 넣는다
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) { // 두 번째 배열의 값이 크거나 같으면
                temp[k++] = arr[i++]; // 첫 번째 배열의 값을 temp 에 저장
            } else { // 첫 번째 배열의 값이 크면
                temp[k++] = arr[j++]; // 두 번째 배열의 값을 temp 에 저장
            }
        }
        // 비교 후 남은 요소 temp 배열에 복사 i -> j 배열 순서로
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // temp -> arr 로 복사
        for (int l = 0; l < temp.length; l++) {
            arr[left + l] = temp[l];
            count++;
            if (count == K) {
                result = temp[l];
                return;
            }
        }
    }
}
