class IntersectionOfTwoArray {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> list = new ArrayList<Integer>();
        int pointer1 = 0;
        int pointer2 = 0;

        while(pointer1 < nums1.length && pointer2 < nums2.length){
            if(nums1[pointer1] < nums2[pointer2]){
                pointer1++;
            }else{
                if(nums1[pointer1] > nums2[pointer2]){
                    pointer2++;
                }else{
                    list.add(nums1[pointer1]);
                    pointer1++;
                    pointer2++;
                }
            }
        }

        int[] re = new int[list.size()];
        for(int i = 0;i < list.size();i++){
            re[i] = list.get(i);
        }
        return re;
    }
}