def binary_search(arr, target):
    left=0
    right = len(arr) - 1
    
    while left <= right:
        mid = left + (right - left) // 2
        
        # Check if target is at mid
        if arr[mid] == target:
            return mid
        # If target is smaller, ignore right half
        elif arr[mid] > target:
            right = mid - 1
        # If target is larger, ignore left half
        else:
            left = mid + 1
    
    return -1  # Target not found

# Example usage
arr = [1, 3, 5, 7, 9, 11, 13, 15]
target = 9

# Ensure arr is a list, not a tuple
arr = list(arr)

result = binary_search(arr, target)

if result != -1:
    print(f"Element found at index {result}")
else:
    print("Element not found")
