'''
This is a basic insertion sort in Python, though the structure is definitely
influenced by Skiena's C implementation. Each i iteration is then sorted
through stepwise comparison using iterations of j. For example, if list[j]
is less than its neighbor to the left, they are swapped and then j = j-1.
This allows the comparison to be made again to the left until it is sorted.
The main loop, i, moves right again via an increment of I and the process
repeats for the i/jth element. Each element gets sorted and inserted into
its "proper" place in a growing, sorted list on the left before another
item is selected via i. So in this code, i selects the item to be sorted
and j ensures it gets moved to the right place. i always works because
any element smaller than list[i] has already been sorted and list[i]
always points to the first unsorted element.

NOTE: This is a high-to-low version of insertion sort. The procedure is the
same--the only single code change is in the while statement:
(input_list[i] > input_list[j-1]) it's "greater than" rather than "less than."
It only swaps if element j is GREATER than its neighbor to the left, rather
than LESS than that neighbor.
'''
def swap(a, b):
    orig_a = a
    a = b
    b = orig_a

    return (a, b)

def insertion_sort(input_list):
    for i in range(len(input_list)):

        j = i
    
        while input_list[j] > input_list[j - 1] and j > 0:
  
            to_swap_j = swap(input_list[j], input_list[j - 1])[0]
            to_swap_j1 = swap(input_list[j], input_list[j - 1])[1]


            input_list[j] = to_swap_j

            input_list[j-1] = to_swap_j1

            j = j - 1

    return input_list

print insertion_sort([1, 5, 8, 7, 2, 3, 4, 5])
        
        
        
