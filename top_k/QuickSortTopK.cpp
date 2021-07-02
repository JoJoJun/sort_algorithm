class Solution {
public:
    int partition(vector<int>& arr, int p, int r){
        int x = arr[r];
        int i = p-1;
        for(int j = p; j<r; j++){
            if(arr[j]<=x){
                i++;
                swap(arr[i],arr[j]);
            }
        }
        swap(arr[i+1],arr[r]);
        return i+1;
    }
    vector<int> smallestK(vector<int>& arr, int k) {
        vector<int>ans;
        if(arr.size()<=0 || k<=0 )
        {
            return ans;
        }
        int start = 0, end = arr.size()-1;
        int q = partition(arr,start,end);
        while(q!=k-1 && start<end){
            if(q>k-1){
                end = q-1;
            }else if(q<k-1){
                start = q+1;
            }
            q = partition(arr, start, end);
        }
        for(int i =0; i<k;i++){
            ans.push_back(arr[i]);
        }
        return ans;
    }
};
int main(){

}