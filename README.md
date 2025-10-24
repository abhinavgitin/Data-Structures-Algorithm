# LeetCode & GFG Solutions

Welcome to my algorithm PRACTISE repository ..... a collection of short, well-documented Java solutions for LeetCode and GeeksforGeeks problems. This repo is organized by date and problem, and includes solved code, explanations, and a small template to add new problems quickly. GETS UPDATED DAILY . As I solve Dsa Problems daily!

## Highlights

- Java-first solutions with concise implementations and short explanations.
- Per-problem folder: source file + solution notes (where applicable).
- A small script and templates to speed up adding new problems.

## Quick start — compile & run

Most solutions are plain Java files Soon will include in C and JavaScript too. From PowerShell you can compile and run a single solution like this:

```powershell
# compile
javac .\problems\2025-10-21_ArrayInsertAtIndex\ArrayInsertAtIndex.java

# run (class name without .java)
java -cp .\problems\2025-10-21_ArrayInsertAtIndex ArrayInsertAtIndex
```

Notes:
- Some solution files include a `main` method with example inputs. If not, open the file and add a tiny runner or unit test.
- The commands above assume you're running from the repository root on Windows PowerShell.

## Problems (table of contents)

- [2025-10-21 Array Insert At Index (GFG)](problems/2025-10-21_ArrayInsertAtIndex) — `ArrayInsertAtIndex.java`
- [2025-10-21 Reverse Words in a String (LeetCode)](problems/2025-10-21_ReverseWordsInAString) — `ReverseWordsInAString.java`
- [2025-10-22 Find All Numbers Disappeared In The Array (LeetCode)](problems/2025-10-22_Find_All_Numbers_Disappeared_In_The_Array) — `2025-10-22_Find_All_Numbers_Disappeared_In_The_Array.java`
- [2025-10-23 Rotated String On All Possible Shifts (LeetCode)](problems/2025-10-23_Rotated_String_On_All_Possible_Shifts) — `2025-10-23_Rotated_String_On_All_Possible_Shifts.java`
- [2025-10-24 Missing In An Array (GFG)](problems/2025-10-24_Missing_In_An_Array) — `2025-10-24_Missing_In_An_Array.java`
- [2025-10-24 XOR Operation In An Array (LeetCode)](problems/2025-10-24_XOR_Operation_In_The_Array) — `2025-10-24_XOR_Operation_In_An_Array.java`

## Project structure

```
README.md
problems/                # per-problem folders (date_problemName)
	2025-10-21_ArrayInsertAtIndex/
		ArrayInsertAtIndex.java
		Solutions.md
	...
scripts/                 # helper scripts (e.g. new_problem.sh)
templates/               # templates (solutions_template.md)
```
- i am still learning the best way for management of files and folders .Till then this is what I can do the best
## How to add a new problem

1. Use the `scripts/new_problem.sh` script to scaffold a new folder (or create a folder manually).
2. Add your solution `.java` file and a short `Solution.md` explaining the approach and complexity.
3. Create a self-contained `main` example if possible so others can run it easily.

## Contribution guidelines

- Keep solutions focused and readable.
- Add short explanation and complexity analysis in `Solution.md` next to the code file.
- If you submit a PR, keep commits atomic and reference the problem link.

## Notes & tips
- This repo is my personal practice log. I prefer short, focused implementations and short notes.
- If you want tests, we can add a small JUnit harness or Gradle/Maven build later.

## Contact

GitHub: https://github.com/abhinavgitin/LeetCode-GFG-Solutions

---

If you'd like, I can also:

- add badges (build / code style),
- add a simple Gradle or Maven wrapper to compile/run all problems, or
- add a CI workflow that runs lint/tests.

Tell me which of those you'd like next and I can implement it.