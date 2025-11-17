#!/bin/bash

# NEW MULTI-LANGUAGE PROBLEM GENERATOR
# Usage:
#   ./new_problem.sh "K Places Away" java
#   ./new_problem.sh "K Places Away" c
#   ./new_problem.sh "K Places Away" cpp
#   ./new_problem.sh "K Places Away" js

PROBLEM_NAME="$1"
LANG="$2"

if [ -z "$PROBLEM_NAME" ] || [ -z "$LANG" ]; then
  echo "❌ Error: Usage: ./new_problem.sh \"Problem Name\" <java|c|cpp|js>"
  exit 1
fi

# Convert spaces → underscores
BASE_NAME=$(echo "$PROBLEM_NAME" | tr ' ' '_')

# Paths
SRC_DIR="../src"
SOL_DIR="../Solutions"
TEMPLATE="../templates/solutions_template.md"

# Extensions by language
case "$LANG" in
  java) EXT="java" ;;
  c) EXT="c" ;;
  cpp) EXT="cpp" ;;
  js) EXT="js" ;;
  *)
    echo "❌ Unsupported language: $LANG"
    echo "Supported: java, c, cpp, js"
    exit 1
    ;;
esac

# Files to create
CODE_PATH="$SRC_DIR/${BASE_NAME}.${EXT}"
MD_PATH="$SOL_DIR/${BASE_NAME}.md"

# Ask platform interactively
echo "Enter platform (LeetCode/GFG): "
read PLATFORM

# Auto date
DATE=$(date +"%Y-%m-%d")

# 1. Create code file
touch "$CODE_PATH"

# 2. Create markdown using template
cp "$TEMPLATE" "$MD_PATH"

# Insert auto-fields into markdown
# (Problem title, platform, date)
sed -i "s|# Problem:  enter this|# Problem:  $PROBLEM_NAME|" "$MD_PATH"
sed -i "s|<LeetCode/GFG>|$PLATFORM|" "$MD_PATH"
sed -i "s|Date solved:|Date solved: $DATE|" "$MD_PATH"

# Insert code link
CODE_LINK="../src/${BASE_NAME}.${EXT}"
sed -i "1s|^|## Code\n[View Code Here](${CODE_LINK})\n\n|" "$MD_PATH"

echo "✅ Problem created successfully!"
echo "📌 Code File: $CODE_PATH"
echo "📌 Solution File: $MD_PATH"
