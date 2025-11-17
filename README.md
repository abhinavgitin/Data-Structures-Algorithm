# LeetCode & GFG Solutions — Compact Java Workbook

This repository is a focused, hands-on notebook of Java solutions for LeetCode and GeeksforGeeks problems. Each entry is intentionally small: one source file per problem and a short markdown note describing the idea and complexity. The collection is designed for fast iteration and daily practice.

**Highlights**
- **Single-file solutions:** Clear, concise Java files in `src/` you can compile and run directly.
- **Short notes:** Human-readable explanations in `Solutions/` that accompany many solutions.
- **Lightweight scaffolding:** Use the included `scripts/new_problem.sh` (for WSL/Git Bash) or simple PowerShell steps to add new problems.

**Quick start — compile & run (PowerShell)**
- From the repository root compile one solution and run it from `src/`:

```powershell
# compile a single solution
javac .\src\ArrayInsertAtIndex.java

# run the class (class name without .java)
java -cp .\src ArrayInsertAtIndex
```

- Many files include a `main` with example inputs. If a file lacks `main`, add a small runner inside the same file to test it.

**Project layout**
- `src/` : Java source files, one problem per file (underscores often used in names).
- `Solutions/` : Short markdown notes (approach, complexity, example) that pair with source files.
- `scripts/` : Helper scripts (e.g. `new_problem.sh`) for scaffolding new problems.
- `templates/` : Markdown templates used when creating new notes.
- `local_notes/` and `bin/` : personal helpers and small utilities.

**Add a new problem**
- Recommended (WSL/Git Bash):

```bash
./scripts/new_problem.sh "Problem Name" java
```

- Manual (PowerShell):

```powershell
# create folder and copy template
# create new files manually
Copy-Item .\templates\solutions_template.md .\Solutions\My_New_Problem.md
New-Item -ItemType File -Path .\src\My_New_Problem.java
```

- After scaffolding: implement the Java solution in `src/`, add a `main` runner if needed, and add a brief note in `Solutions/`.

**Guidelines**
- Keep solutions compact and readable — prefer clarity over cleverness.
- `Solutions/` notes should contain: problem statement, core idea, complexity (time/space), and one example.
- Use underscores in filenames where spaces would appear (consistent naming convention).

**Example files in this repo**
- Representative Java files live in `src/` (for example: `ArrayInsertAtIndex.java`, `ReverseWordsInAString.java`, `Find_All_Numbers_Disappeared_In_The_Array.java`).
- Corresponding notes are in `Solutions/` (for example: `ArrayInsertAtIndex.md`, `ReverseWordsInAString.md`).

If you'd like, I can do one of the following next:
- add an automated compile/run helper (PowerShell script) to run many examples,
- scaffold a new problem with a complete runner and notes, or
- add a minimal CI action that compiles every Java file.
