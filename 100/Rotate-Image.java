1class Solution {
2    public void rotate(int[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        transpose(matrix);
6        reverseRows(matrix);
7    }
8        private void transpose(int matrix[][]){
9            for(int i=0;i<matrix.length;i++){
10                for(int j=0;j<=i;j++){
11                    int temp=matrix[i][j];
12                    matrix[i][j]=matrix[j][i];
13                    matrix[j][i]=temp;
14
15                }
16            }
17        }
18     
19        private void reverseRows(int matrix[][]){
20            int m=matrix.length;
21            int n=matrix[0].length;
22             for (int i = 0; i < m; i++) {
23            int left = 0;
24            int right = n - 1;
25
26            while (left < right) {
27                int temp = matrix[i][left];
28                matrix[i][left] = matrix[i][right];
29                matrix[i][right] = temp;
30
31                left++;
32                right--;
33            }
34        }  
35    }
36}