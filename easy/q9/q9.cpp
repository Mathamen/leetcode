#include <string>
using namespace std;
class Solution {
public:
    bool isPalindrome(int x) {
        string s = to_string(x);
        const char* array = s.c_str();

        for (int i=0; i< s.length(); i++){
           if (array[i] != array[s.length() - 1 - i]) return false;
     
        }
        return true;
    }
};