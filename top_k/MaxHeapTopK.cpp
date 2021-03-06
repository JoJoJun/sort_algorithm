class Solution {
public:
   
    vector<int> smallestK(vector<int>& arr, int k) {
        vector<int>ans;
        if(arr.size()<=0 || k<=0 )
        {
            return ans;
        }
       priority_queue<int, vector<int>, less<int> >Q;
       for(int i = 0; i<k; i++){
           Q.push(arr[i]);
       }
       for(int i = k; i<arr.size(); i++){
           if(arr[i]<Q.top()){
               Q.pop();
               Q.push(arr[i]);
           }
       }
       for(int i = 0; i<k; i++){
           ans.push_back(Q.top());
           Q.pop();
       }
        return ans;
    }
};