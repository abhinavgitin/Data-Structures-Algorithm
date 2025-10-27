# LeetCode & GFG Solutions

A compact, date-organized collection of short Java solutions for LeetCode and GeeksforGeeks problems. Each problem gets its own folder with the solution source and a short notes file that explains the approach and complexity. I update this daily as I practice DSA.

## Highlights

- Java-first solutions with concise, readable implementations.
- Per-problem folder: solution source + `Solution.md` notes.
- Small helper script and a template to scaffold new problems quickly.

## Quick start — compile & run (Windows PowerShell)

From the repository root you can compile and run a single solution. Use the folder and file shown in the per-problem folder when compiling.

Example (compile + run ArrayInsertAtIndex):

```powershell
# compile
javac .\problems\2025-10-21_ArrayInsertAtIndex\ArrayInsertAtIndex.java

# run (class name without .java)
java -cp .\problems\2025-10-21_ArrayInsertAtIndex ArrayInsertAtIndex
```

Notes:
- Some solution files include a `main` method with example inputs. If a file has no `main`, add a tiny runner or test harness to run it.
- These commands assume you're running from the repository root in PowerShell. If you use WSL/Git Bash, use the equivalent POSIX paths or run the included bash script there.

## Problems (table of contents)

- [2025-10-21 Array Insert At Index (GFG)](problems/2025-10-21_ArrayInsertAtIndex) — `ArrayInsertAtIndex.java`
- [2025-10-21 Reverse Words in a String (LeetCode)](problems/2025-10-21_ReverseWordsInAString) — `ReverseWordsInAString.java`
- [2025-10-22 Find All Numbers Disappeared In The Array (LeetCode)](problems/2025-10-22_Find_All_Numbers_Disappeared_In_The_Array) — `Find_All_Numbers_Disappeared_In_The_Array.java`
- [2025-10-23 Rotated String On All Possible Shifts (LeetCode)](problems/2025-10-23_Rotated_String_On_All_Possible_Shifts) — `Rotated_String_On_All_Possible_Shifts.java`
- [2025-10-24 Missing In An Array (GFG)](problems/2025-10-24_Missing_In_An_Array) — `Missing_In_An_Array.java`
- [2025-10-24 XOR Operation In An Array (LeetCode)](problems/2025-10-24_XOR_Operation_In_An_Array) — `XOR_Operation_In_An_Array.java`
- [2025-10-25 Atleast Two Greater Elements (GFG)](problems/2025-10-25_Atleast_Two_Greater_Elements) — `Atleast_Two_Greater_Elements.java`
- [2025-10-25 Reverse Degree Of A String (LeetCode)](problems/2025-10-25_Reverse_Degree_Of_A_String) — `Reverse_Degree_Of_A_String.java`
- [2025-10-26 Power of Two (LeetCode)](problems/2025-10-26_Power_Of_Two) — `2025-10-26_Power_Of_Two.java`
- [Greatest Element / Greatest Occurrence (GFG) — 2025-10-27](problems/Greatest_Element_Greatest_Occurance_Vise_Versa_2025-10-27) — `Greatest_Element_Greatest_Occurance_Vise_Versa.java`

## Project structure

```
README.md
problems/                # per-problem folders (date_problemName)
  2025-10-21_ArrayInsertAtIndex/
    ArrayInsertAtIndex.java
    Solutions.md
  ... (other dated problem folders)
scripts/                 # helper scripts (e.g. new_problem.sh)
templates/               # templates (solutions_template.md)
```

I keep problems organized by the date I solved them and a short descriptive folder name. Filenames inside the folder reflect the actual problem title (underscores replace spaces).

## How to add a new problem

You have two simple options: use the included bash scaffolding script (recommended if you have WSL or Git Bash) or create the folder/files manually in PowerShell.

Option A — use the scaffolding script (WSL/Git Bash):

- From Git Bash or WSL run:

```bash
# example: create a Java problem called "Add Element"
./scripts/new_problem.sh "Add Element" java
```

If you are on Windows PowerShell and have WSL installed you can run the same script via WSL:

```powershell
wsl ./scripts/new_problem.sh "Add Element" java
```

Option B — create manually in PowerShell (no WSL):

```powershell
# make folder
New-Item -ItemType Directory -Path .\problems\"2025-10-27_My_New_Problem"

# copy template markdown
Copy-Item .\templates\solutions_template.md .\problems\"2025-10-27_My_New_Problem\Solution.md"

# create code file
New-Item -ItemType File -Path .\problems\"2025-10-27_My_New_Problem\My_New_Problem.java"
```

Checklist after scaffolding:
- Add the Java solution in the code file and a concise `Solution.md` with approach and complexity.
- Add a `main` method or a small runner so the class can be run directly.
- Use underscores in filenames (consistent with repo style) to replace spaces.

## Contribution guidelines

- Keep `Solution.md` concise: problem statement, idea, complexity (time/space), and one short example.
- Prefer readable, well-named local variables and short methods.

## Notes & tips

- This repo is my personal practice log. Implementations are intentionally compact for learning.
- If you'd like, I can also:
	- add badges (build / code style),
	- add a simple Gradle or Maven wrapper to compile/run all problems, or
	- add a CI workflow that runs lint/tests.

Pick one and I can implement it next.