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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* RetornoHead = new ListNode();
        ListNode* dummy = RetornoHead;

        while (list1 != NULL && list2 != NULL) {
            if (list1->val == list2->val) {
                dummy->next = new ListNode(list1->val);
                dummy = dummy->next;
                dummy->next = new ListNode(list2->val);
                dummy = dummy->next;
                list1 = list1->next;
                list2 = list2->next;
            } else if (list1->val < list2->val) {
                dummy->next = new ListNode(list1->val);
                dummy = dummy->next;
                list1 = list1->next;
            } else {
                dummy->next = new ListNode(list2->val);
                dummy = dummy->next;
                list2 = list2->next;
            }
        }

        while (list1 != NULL) {
            dummy->next = new ListNode(list1->val);
            dummy = dummy->next;
            list1 = list1->next;
        }

        while (list2 != NULL) {
            dummy->next = new ListNode(list2->val);
            dummy = dummy->next;
            list2 = list2->next;
        }

        return RetornoHead->next;
    }

    ListNode* mergeTwoListsTWO(ListNode* list1, ListNode* list2) {
        ListNode* head = nullptr;
        ListNode* tail = nullptr;

        while (list1 != nullptr && list2 != nullptr) {
            if (list1->val == list2->val) {
                if (head == nullptr) {
                    head = list1;
                    tail = list1;
                } else {
                    tail->next = list1;
                    tail = tail->next;
                }
                list1 = list1->next;

                tail->next = list2;
                tail = tail->next;
                list2 = list2->next;
            } else if (list1->val < list2->val) {
                if (head == nullptr) {
                    head = list1;
                    tail = list1;
                } else {
                    tail->next = list1;
                    tail = tail->next;
                }
                list1 = list1->next;
            } else {
                if (head == nullptr) {
                    head = list2;
                    tail = list2;
                } else {
                    tail->next = list2;
                    tail = tail->next;
                }
                list2 = list2->next;
            }
        }

        if (list1 != nullptr) {
            if (head == nullptr) {
                head = list1;
            } else {
                tail->next = list1;
            }
        } else if (list2 != nullptr) {
            if (head == nullptr) {
                head = list2;
            } else {
                tail->next = list2;
            }
        }

        return head;
    }
};






};


