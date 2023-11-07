class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for chars in list(s):
            if chars == '(' or chars == '[' or chars == '{':
                stack.append(chars)
            else:
                if self.isEmpty(stack):
                    return False
                top = self.peek(stack)
                if (top == '(' and chars == ')') or (top == '[' and chars == ']') or (top == '{' and chars == '}'):
                    stack.pop()
                else:
                    return False
        return self.isEmpty(stack)

    def isEmpty(self, stack) -> bool:
        if stack == []:
            return True
        else:
            return False
    
    def peek(self, stack):
        if stack == []:
            return None
        else:
            top = len(stack) -1
            return stack[top]
        
s = "(){}[]"
result = Solution().isValid(s)
print(s, " -> ", result)