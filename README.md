# Задача
Даны два отсортированных массива nums1.length=m и nums2.length=n

Вернуть медиану двух отсортированных массивов.

# Ограничения
- 0 <= m <= 1000
- 0 <= n <= 1000 
- 1 <= m+n <= 2000
- -10^6 <= nums1[i], nums2[i] <= 10^6

# Тесты
## Тест 1
```
nums1 = [1,3]
nums2 = [2]
Res: 2
```

## Тест 2
```
nums1 = [1,2]
nums2 = [3,4]
Res: 2.5
```

## Тест 3
```
nums1 = [1]
nums2 = []
Res: 1.0
```

## Тест 4
```
nums1 = [-1000000]
nums2 = [ 1000000]
Res: 0.0
```
## Тест 5
```
nums1 = [1,2,3]
nums2 = [-3,-2,-1]
Res: 0.0
```
## Тест 6
```
num1 = [2,3]
nums2= [-3,-2,-1]
Res: -1
```
## Тест 7
```
num1 = [2,30]
nums2= [-3,-2,-1]
Res: -1
```

## Тест 8
num1 = [1,2,3]
num2 = [3,4,5]
Res: 3

## Тест 9
num1 = [1,2,3]
num2 = [10,20,30]
Res: 6.5

# Решение
```
nums1 = [1,2,3,4,5]
nums2 = [3,4,5,6]
x=5
y=4

0 [1, 2,3,4, 5]
low           high 
low=0
high=5

while (low <= high)

  int partitionX = 2
  int partitionY = 3 
  int maxLeftX = nums1[2-1]= 1
  int minRightX = nums1[2] = 2
  int maxLeftY = nums2[3-1]= 4
  int minRightY = nums2[3] = 5

high = 1
low = 3


```
