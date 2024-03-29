/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int sum;
        bool hasCarryOn = false;

        ListNode* retornoHead = new ListNode();
        ListNode* temp = retornoHead;

        while (l1 != NULL || l2 != NULL || hasCarryOn) {
            int sum = (l1 ? l1->val : 0) + (l2 ? l2->val : 0) + (hasCarryOn ? 1 : 0);
            hasCarryOn = sum >= 10;
            sum %= 10;

            temp->next = new ListNode(sum);
            temp = temp->next;

            if (l1) l1 = l1->next;
            if (l2) l2 = l2->next;
        }

        return retornoHead->next;
    }
};
