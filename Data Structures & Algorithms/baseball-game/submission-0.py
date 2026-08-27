from typing import List

class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []  # Stores valid scores
        
        for op in operations:
            if op.lstrip('-').isdigit():  # Handles negative numbers too
                stack.append(int(op))
            elif op == "C":
                if stack:  # Ensure stack is not empty
                    stack.pop()
            elif op == "D":
                if stack:
                    stack.append(stack[-1] * 2)
            elif op == "+":
                if len(stack) >= 2:
                    stack.append(stack[-1] + stack[-2])
        
        return sum(stack)
