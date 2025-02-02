class UglyNumberII {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public int nthUglyNumber(int n) {
        if(n <= 0)
            return 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(list.size() < n){
            int m2 = list.get(i) * 2;
            int m3 = list.get(j) * 3;
            int m5 = list.get(k) * 5;
            
            int min = Math.min(m2, Math.min(m3,m5));
            list.add(min);
            
            if(min == m2)
                i++;
            if(min == m3)
                j++;
            if(min == m5)
                k++;
        }
        return list.get(list.size() - 1);
    }
}