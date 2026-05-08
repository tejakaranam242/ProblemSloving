#include <bits/stdc++.h>
using namespace std;
class Main {
public:
	int numberOfSplits(vector<int>& nums, int mid) {
		int size = nums.size();
		int arrays = 1;
		long long sumOfArray = 0;
		for(int i=0; i<size; i++) {
			if(sumOfArray+nums[i]<=mid) sumOfArray+=nums[i];
			else {
				arrays++;
				sumOfArray = nums[i];
			}
		}
		return arrays;
	}
	int max(vector<int>& nums) {
		int max = nums[0];
		for(int i = 1; i<nums.size(); i++) {
			if(nums[i]>max) max = nums[i];
		}
		return max;
	}
	int sum(vector<int>& nums) {
		int sum = 0;
		for(int i=0; i<nums.size(); i++) sum+=nums[i];
		return sum;
	}
	int splitArray(vector<int>& nums, int k) {
		int low = max(nums);
		int high = sum(nums);
		while(low<=high) {
			int mid = (low+high)/2;
			int numberOfSplit = numberOfSplits(nums,mid);
			if(numberOfSplit>k) low = mid+1;
			else high = mid-1;
		}
		return low;
	}
};
int main() {
	string input;
	getline(cin,input);
	stringstream ss(input);
	vector<int> nums;
	int x;
	while(ss >> x) {
		nums.push_back(x);
	}
	int k;
	cin >> k;
	Main obj;
	cout << "Result : " << obj.splitArray(nums,k);
	return 0;
}
