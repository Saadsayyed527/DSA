def pascal_triangle(n):
    triangle = []
    for i in range(n):
        row = [1] * (i + 1)
        for j in range(1, i):
            row[j] = triangle[i-1][j-1] + triangle[i-1][j]
        triangle.append(row)
    return triangle

def print_pascals_triangle(triangle):
    n = len(triangle)
    for i in range(n):
        # Print leading spaces to center-align the triangle
        print(' ' * (n - i), end=' ')
        for num in triangle[i]:
            print(num, end=' ')
        print()

print("\nPascal's Triangle:")
pascals_triangle = pascal_triangle(7)
print_pascals_triangle(pascals_triangle)
