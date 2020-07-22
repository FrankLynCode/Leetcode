class Solution {
    public int findKthLargest(int[] nums, int k) {
       heapSort(nums, nums.length);
       return nums[nums.length-k]; 
    }
    
 
        private void heapSort(int[] nums, int size){
            buildMaxHeap(nums);
             for(int i = 0; i< nums.length; i++)
            System.out.print(nums[i]);
            for (int i = size-1; i>0; i--){
                int temp = nums[i];
                nums[i] = nums[0];
                nums[0] = temp;
                maxHeapify(nums,0, i);
            }
        }
        
        private void buildMaxHeap(int[] nums){
            for(int i = nums.length/2-1; i >= 0; i--){
                maxHeapify(nums,i,nums.length);
            }
        }
        
        private void maxHeapify(int[] nums, int index, int size){
            int largest, left, right;
            left = index*2+1;
            right = index*2+2;
            if (left<size && nums[left] > nums[index])
                largest = left;
                else
                    largest = index;
            if (right<size && nums[right] > nums[largest])
                largest = right;
            if(largest != index){
                int temp = nums[index];
                nums[index] = nums[largest];
                nums[largest] = temp;
                maxHeapify(nums,largest,size);
            }
        }
}
