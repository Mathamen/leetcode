impl Solution {
    pub fn is_valid(s: String) -> bool {
        let mut stack: Vec<char> = Vec::new();
        let chars: Vec<char> = s.chars().collect();

        for &c in chars.iter() {
            match c {
                '(' | '{' | '[' => stack.push(c),
                ')' | '}' | ']' => {
                    if let Some(top) = stack.pop() {
                        if (c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                _ => {}
            }
        }

        stack.is_empty()
    }
}
