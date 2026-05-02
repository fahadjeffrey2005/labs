import numpy as np
#arr = np.eye(3)
#print(arr)
#arr = np.random.randint(1,10, size=(3,3))
#print(arr)




#arr = np.random.randint(1,17, size=(4,4))
#print(arr)
#print()
#print(arr[0,:])
#print()
#print(arr[:,3])




#arr = np.random.randint(1,17, size=(4,4))
#print(arr)
#print()
#
#print("Odd rows:")
#for i in range(0,4,2):
#    print(arr[i,:])
#
#print()
#print("Even columns:")
#for i in range(1,4,2):
#    print(arr[:,i])
   
   
   


#arr = np.random.randint(1,17, size=(4,4))
#print(arr)
#print()
#
#print("rows:")
#print(arr[0,:])
#print(arr[2,:])
#print()
#print("columns:")
#
#print(arr[:,0])
#print(arr[:,2])





#arr = np.random.randint(1,17, size=(4,4))
#print(arr)
#print()
#arr[arr%2 != 0] =-1
#print(arr)





#arr1 = np.random.randint(1,17, size=(4,4))
#arr2 = np.random.randint(1,17, size=(4,4))
#print(arr1)
#print()
#print(arr2)
#print()
#
#common = np.intersect1d(arr1.flat, arr2.flat)
#print("Common elements:", common)





#arr1 = np.random.randint(1,17, size=(4,4))
#arr2 = np.random.randint(1,17, size=(4,4))
#print(arr1)
#print()
#print(arr2)
#print()
#
#narr1 = np.setdiff1d(arr1,arr2)
#print(narr1)
#print()
#narr2 = np.setdiff1d(arr2,arr1)
#print(narr2)
#print()





#a = np.random.randint(1, 10, (4, 4))
#b = np.random.randint(1, 10, (4, 4))
#
#print (a)
#print()
#print(b)
#print()
#
#positions = np.where(a == b)
#
#print("Matching positions (row indices, column indices):")
#print(positions)





#arr = np.random.randint(1,10, size=(3,3))
#print(arr)
#print()
#temp = arr[:, 0].copy()
#arr[:, 0] = arr[:, 2]
#arr[:, 2] = temp
#print(arr)







#arr = np.ones((5, 5), dtype=int)
#arr[1:-1, 1:-1] = 0
#print(arr)






a = np.array([1, 2, 3, 4])
b = np.array([5, 6, 7, 8])

print(a)
print()
print(b)
print()

sum = a + b
print(sum)

sa = a ** 2
sb = b ** 2

print(sa)
print()
print(sb)
