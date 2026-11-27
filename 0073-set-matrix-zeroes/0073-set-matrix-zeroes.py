class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not re     jml,  4   2turn anything, modify matrix in-place instead.
        """
        r , c = len(matrix) , len(matrix[0])
        rspace = [0] * r
        cspace = [0] * c 
        for i in range(r):
            for j in range(c):
                if(matrix[i][j] == 0):
                    rspace[i] = -1
                    cspace[j] = -1
        for i in range(r):
            for j in range(c):
                if(rspace[i] == -1 or cspace[j] == -1):
                    matrix[i][j] = 0
               