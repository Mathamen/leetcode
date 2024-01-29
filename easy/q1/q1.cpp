#include <unordered_map>
#include <vector>
using namespace std;
class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        unordered_map<int, int> numIndices;

        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];

            if (numIndices.find(complement) != numIndices.end()) {
                return {numIndices[complement], i};
            }

            numIndices[nums[i]] = i;
        }

        return {-1, -1};
    }
};
