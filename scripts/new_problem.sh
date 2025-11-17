#!/bin/bash

# Usage: ./new_problem.sh "Array Leaders"
# This script will:
# 1. Create a .java file inside src/
# 2. Create a .md solution file inside Solutions/
# 3. Auto-insert the template into the .md file
# 4. Auto-add the link to the Java code

PROBLEM_NAME="$1"

if [ -z "$PROBLEM_NAME" ]; then
  echo "❌ Error: Please provide a problem name."
  echo "Usage: ./new_problem.sh \"Array Leaders\""
  exit 1
fi

# Convert spaces → underscores for filenames
BASE_NAME=$(echo "$PROBLEM_NAME" | tr ' ' '_')

# Paths
SRC_DIR="../src"
SOL_DIR="../Solutions"
TEMPLATE_FILE="../templates/solutions_template.md"

JAVA_FILE="$SRC_DIR/${BASE_NAME}.java"
MD_FILE="$SOL_DIR/${BASE_NAME}.md"

# 1. Create Java file
touch "$JAVA_FILE"

# 2. Copy markdown template
cp "$TEMPLATE_FILE" "$MD_FILE"

# 3. Insert the Java link at the top of the MD file
JAVA_LINK="../src/${BASE_NAME}.java"
sed -i "1s|^|## Code\n[View Java Code](${JAVA_LINK})\n\n|" "$MD_FILE"

echo "✅ New problem created successfully!"
echo "📄 Java File: $JAVA_FILE"
echo "📝 Markdown: $MD_FILE"
