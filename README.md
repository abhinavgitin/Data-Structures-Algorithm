# LeetCode & GFG Solutions

A personal DSA practice repository containing Java (and some C) solutions to problems from **LeetCode**, **GeeksforGeeks (GFG)**, and **Codeforces**. Each problem has a single source file and an optional markdown note covering the approach and complexity. The goal is daily practice with clean, readable code.

---

## Repository Layout

```
src/          – Source files, one file per problem (Java or C)
Solutions/    – Markdown notes paired with source files
scripts/      – Shell script to scaffold a new problem quickly
templates/    – Markdown template used when generating new notes
assets/       – Visual aids (images) for selected solution notes
```

- **`src/`** holds ~90 Java files and a handful of C files. Filenames mirror the problem name (spaces replaced with underscores).
- **`Solutions/`** holds ~90 markdown notes. Each note follows a consistent template: problem link, intuition, step-by-step approach, alternate approaches, and time/space complexity.
- **`assets/`** stores images referenced inside certain solution notes (diagrams, screenshots of accepted outputs).

---

## Workflow

### Adding a new problem

**Recommended – WSL / Git Bash:**
```bash
cd scripts
./new_problem.sh "Problem Name" java   # or: c | cpp | js
```
The script:
1. Creates `src/Problem_Name.java` (empty, ready to code in).
2. Copies `templates/solutions_template.md` → `Solutions/Problem_Name.md`.
3. Pre-fills the note with the problem title, platform you enter interactively, and today's date.

**Manual – PowerShell:**
```powershell
Copy-Item .\templates\solutions_template.md .\Solutions\My_New_Problem.md
New-Item -ItemType File -Path .\src\My_New_Problem.java
```

After scaffolding, implement the solution in `src/` and fill in the note in `Solutions/`.

### Compiling & running a Java solution
```powershell
javac .\src\SolutionName.java
java -cp .\src SolutionName
```
Most files include a `main` method with sample inputs so you can test them immediately.

---

## Solution Note Structure

Every note in `Solutions/` follows this template:

| Section | What it contains |
|---|---|
| **Problem** | Title, platform, link, date solved, tags |
| **What this shows** | Key concept or technique the problem demonstrates |
| **Intuition** | High-level idea behind the solution |
| **Approach** | Numbered step-by-step walkthrough |
| **Alternate Approaches** | Other valid methods and trade-offs |
| **Complexity** | Time and Space in Big-O notation |
| **Code** | Inline code block (mirrors the file in `src/`) |

---

## Platforms Covered

| Platform | Type of problems |
|---|---|
| LeetCode | Arrays, Strings, Two Pointers, Math, Sorting, Matrix |
| GeeksforGeeks | Arrays, Strings, Searching, Basic Data Structures |
| Codeforces | Competitive / logic puzzles |

---

## Guidelines

- One problem per file; filenames use underscores where a space would appear.
- Keep solutions compact — prefer clarity over cleverness.
- Always fill in the complexity section of the note.
- For problems with visual explanations, store images under `assets/<ProblemName>/` and reference them at the bottom of the note.

