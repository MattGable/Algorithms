'''
This bubble sort will iterate over n-1 elements, with the largest value being
"bubbled" to the end(the right in this case) on each pass. This will loop
roughly i*j times (n*n or n^2 time complexity). On each pass (j), the largest
value for each pair (list[j] and list [i-j]) gets moved to the right side of
the comparison (placed in list[j]).  i is the increment for the number of
passes, while j is the value for coordinating and incrementing
the swap positions. There are a lot of efficiencies that might be fun to do
in "BubbleSort 2.0" or similar. For example, shrinking j as the sorted values
collect on the right would be a small efficiency gain, though there seems to
have been MANY tweaks made to bubble sort over the years...

NOTE: By stopping the main loop at i == len(input_list-2), we are limiting
the procedure to n-1 iterations, which is enough to complete the sort
without the last n iterations. -1 is returned if something unexpected happens.  
'''


def bubble_sort(input_list):

    for i in range(len(input_list)):
        for j in range(len(input_list)):
            if j > 0 and input_list[j] < input_list[j-1]:

                to_swap_j = input_list[j-1]
                to_swap_j1 = input_list[j]

                input_list[j] = to_swap_j
                input_list[j-1] = to_swap_j1

        if i == len(input_list)-2:
            
            return input_list
        
    return -1

print bubble_sort([3, 2, 1, 2, 4, 3, 8])

