## Code
[View Code Here](../src/ExactlyOneDifferentCharacter.java)

# Problem:  ExactlyOneDifferentCharacter
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/just-one-mismatch1714/1)
**Date solved: 2025-11-28**  
**Tags:** Check One Mismatch , use of CharAt() 

---
## What this shows and what this can be used for!
- how to find out the mismatch in the string which is a element in the array
---
## Intuition
In this problem, you're given:
- A string S
- An array of strings arr[] of size N
Your goal is to determine whether any string in the array differs from S by exactly one character, and has the same length as S.
If such a string exists → return "True".
Otherwise → return "False".
---

# Approach (step-by-step)s

### 🧩 Step‑by‑Step Explanation

## **1️⃣ Loop through each string in the array**

```java
for (String i : arr)
```

We compare the given string **S** with every string **i** in the array. Each comparison is independent.

---

## **2️⃣ Reset ************`diff`************ for every string**

```java
int diff = 0;
```

`diff` counts how many characters differ between the current string and **S**.
It must reset **for each new string**, so comparing one string does not affect the next.

---

## **3️⃣ Compare only if lengths match**

```java
if (i.length() == S.length())
```

If the lengths differ, they can't differ by *exactly one character*, so we skip that string.

---

## **4️⃣ Compare characters one by one**

```java
for (int idx = 0; idx < S.length(); idx++)
```

We compare each character at the same index of both strings.

---

## **5️⃣ Count differences**

```java
if (i.charAt(idx) != S.charAt(idx)) {
    diff++;
}
```

Every mismatching character increments `diff`.

### 💡 Why only count mismatches?

Because we need to check whether the string is **almost identical** except **one character**.

---

## **6️⃣ Early exit if differences exceed 1**

```java
if (diff > 1) {
    break;
}
```

If more than one character is different, the string cannot be a valid candidate — no need to check the rest.

This improves performance and ensures correctness.

---

## **7️⃣ If exactly one character differs → return "True"**

```java
if (diff == 1) return "True";
```

The moment we find a string that differs from **S** in *exactly one position*, we immediately return **True**.

There is no need to check remaining strings.

---

## **8️⃣ If none matched → return "False"**

```java
return "False";
```

If the loop finishes without finding any valid string, the array does **not** contain such a string.

---

## Complexity
- Time: O(N × M)
- N → number of strings
- M → length of the string
  Each string is checked character‑by‑character.
- Space: O(1)
Only a few variables are used.
---

## Code
```[java]
class Solution {
    static String isStringExist(String arr[], int N, String S) {
        for (String i : arr) {
            int diff = 0;

            if (i.length() == S.length()) {
                for (int idx = 0; idx < S.length(); idx++) {
                    if (i.charAt(idx) != S.charAt(idx)) {
                        diff++;

                        if (diff > 1) {
                            break;
                        }
                    }
                }
            }

            if (diff == 1) return "True";
        }

        return "False";
    }
}
```