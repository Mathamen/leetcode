impl Solution {
    pub fn is_palindrome(x: i32) -> bool {
        let s = x.to_string();
        let array: Vec<char> = s.chars().collect();

        for i in 0..array.len() / 2 {
            if array[i] != array[array.len() - 1 - i] {
                return false;
            }
        }

        true
    }
}
